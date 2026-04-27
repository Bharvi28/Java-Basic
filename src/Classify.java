/*Given an interface Classify with a method String getDivision(double average). Implement this
getDivision method in a class Result such that it returns "First Division" if the average is 60 or
more.
 */
import java.util.*;
interface Clasify {
    String getDivision(double average);
}

class Result implements Clasify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Second Division";
        }
    }
}

public class Classify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average marks: ");
        double avg = sc.nextDouble();

        Result r = new Result();
        String division = r.getDivision(avg);

        System.out.println("Division: " + division);

    }
}
/*
Enter average marks: 80
Division: First Division
Enter average marks: 50
Division: Second Division
 */