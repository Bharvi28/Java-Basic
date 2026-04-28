/*Take the value of denominator and numerator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time error.
 */
class Division {
    public static void main(String[] args) {

        try {

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program executed.");
        }
    }
}
/*
PS C:\Users\jeetcctv\Java-Basic> javac Division.java
use --help for a list of possible options
PS C:\Users\jeetcctv\Java-Basic> javac src/Division.java
Denominator: 2
Result: 5
PS C:\Users\jeetcctv\Java-Basic> java -cp src Division 10
An error occurred: Index 1 out of bounds for length 1
Program executed.
PS C:\Users\jeetcctv\Java-Basic> javac src/Division.java
PS C:\Users\jeetcctv\Java-Basic> java -cp src Division 10 0
An error occurred: / by zero
Program executed.
PS C:\Users\jeetcctv\Java-Basic> javac src/Division.java
PS C:\Users\jeetcctv\Java-Basic> java -cp src Division abc
An error occurred: For input string: "abc"
Program executed.
PS C:\Users\jeetcctv\Java-Basic>

 */