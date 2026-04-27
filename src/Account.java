/*Define a base class BankAccount with common attributes like accountNumber,
accountHolderName, and balance. Then, define two subclasses: SavingAccount and
FixedDepositAccount, which inherit from BankAccount. Implement basic operations like
openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The SavingAccount
should include a calculateInterest() method specific to savings accounts, and FixedDepositAccount
should have a maturityAmount() method considering fixed deposit terms.
 */
import java.util.*;

class Bankaccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    Scanner sc = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        balance += amt;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


class SavingAccount extends Bankaccount {
    double rate = 4.0; // 4% interest

    void calculateInterest() {
        double interest = (balance * rate) / 100;
        System.out.println("Interest (Savings): " + interest);
    }
}

class FixedDepositAccount extends Bankaccount {
    double rate = 6.5; // 6.5% interest
    int years;

    void maturityAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        years = sc.nextInt();

        double maturity = balance * Math.pow((1 + rate / 100), years);
        System.out.println("Maturity Amount (FD): " + maturity);
    }
}

public class Account {
    public static void main(String[] args) {

        System.out.println(" Saving Account ");
        SavingAccount sa = new SavingAccount();
        sa.openAccount();
        sa.deposit();
        sa.withdraw();
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println(" Fixed Deposit Account ");
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount();
        fd.checkBalance();
        fd.maturityAmount();
    }
}
/*
Enter Account Number: 123
Enter Account Holder Name: Bharvi
Enter Initial Balance: 100000
Enter amount to deposit: 1000
Amount deposited successfully.
Enter amount to withdraw: 100
Withdrawal successful.
Current Balance: 100900.0
Interest (Savings): 4036.0
 Fixed Deposit Account
Enter Account Number: 465
Enter Account Holder Name: Bharvi
Enter Initial Balance: 500000
Current Balance: 500000.0
Enter number of years: 5
Maturity Amount (FD): 685043.3317078123
 */