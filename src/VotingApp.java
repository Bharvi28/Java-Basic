/*
Write a Java program to create a class VotingApp where:
● The method checkEligibility(int age) checks if a person is eligible to vote.
● If age < 18, explicitly throw the predefined exception IllegalArgumentException with the
message "Age must be 18 or above to vote".
In the main method, test the method with different age inputs.
● Use a try-catch-finally block to handle exceptions.
● The finally block should always print "Validation process completed"
 */
import java.util.*;

class VotingApp {

    void checkEligibility(int age) {
        if (age < 18) {

            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingApp v = new VotingApp();

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            v.checkEligibility(age);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("Validation process completed");
        }

    }
}
/*
Enter age: 45
You are eligible to vote.
Validation process completed

Enter age: 10
Exception: Age must be 18 or above to vote
Validation process completed

Enter age: abc
Invalid input!
Validation process completed
 */
