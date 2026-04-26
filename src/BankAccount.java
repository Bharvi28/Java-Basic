/*Design a class BankAccount with account_holder_name and balance. Use a static variable
interest_rate (same for all accounts). Include methods to calculate and display the interest earned.
Update interest rate using a static method.
 */
public class BankAccount {

    private String accountHolderName;
    private double balance;

    private static double interestRate = 3.5;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    public void displayDetails() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : $" + balance);
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Interest Earned: $" + calculateInterest());
    }

    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to " + interestRate + "% for all accounts.");
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Alice", 10000);
        BankAccount acc2 = new BankAccount("Bob", 25000);

        System.out.println(" Before Rate Update ");
        System.out.println(" Account 1 ");
        acc1.displayDetails();
        System.out.println(" Account 2 ");
        acc2.displayDetails();

        System.out.println(" Updating Interest Rate ");
        BankAccount.updateInterestRate(5.0);

        System.out.println(" After Rate Update ");
        System.out.println(" Account 1 ");
        acc1.displayDetails();
        System.out.println(" Account 2 ");
        acc2.displayDetails();
    }
}
/*
Before Rate Update
 Account 1
Account Holder : Alice
Balance        : $10000.0
Interest Rate  : 3.5%
Interest Earned: $350.0
 Account 2
Account Holder : Bob
Balance        : $25000.0
Interest Rate  : 3.5%
Interest Earned: $875.0
 Updating Interest Rate
Interest rate updated to 5.0% for all accounts.
 After Rate Update
 Account 1
Account Holder : Alice
Balance        : $10000.0
Interest Rate  : 5.0%
Interest Earned: $500.0
 Account 2
Account Holder : Bob
Balance        : $25000.0
Interest Rate  : 5.0%
Interest Earned: $1250.0
 */