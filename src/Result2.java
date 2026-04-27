/*Write the Java code for an interface named Exam which declares a single abstract method boolean
isPassed(int mark). This method should take an integer mark as an argument. Write the Java code
for another interface named Classify which declares a single abstract method String
getDivision(double average). This method should take a double average as an argument. Create a
class named Result that implements both the Exam and Classify interfaces. Provide concrete
implementations for isPassed() and getDivision() methods. In your main method, create an
instance of Result, set some marks and average, and demonstrate the use of both interface
methods.
 */
import java.util.*;

interface Exam {
    boolean isPassed(int mark);
}

interface Classifyy {
    String getDivision(double average);
}

class Resultt implements Exam, Classifyy {

    @Override
    public boolean isPassed(int mark) {
        return mark >= 40; // pass if marks >= 40
    }

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Result2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Resultt r = new Resultt();

        System.out.print("Enter marks: ");
        int mark = sc.nextInt();

        System.out.print("Enter average: ");
        double avg = sc.nextDouble();

        if (r.isPassed(mark)) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        System.out.println("Division: " + r.getDivision(avg));

    }
}
/*
Enter marks: 50
Enter average: 60
Result: Passed
Division: First Division

 */