/**Develop a Java application that calculates a person's Body Mass Index (BMI). The program should
 ask the user for their weight in pounds and height in inches. Convert these values to kilograms and
 meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and then calculate BMI
 (weight in kg / (height in meters)^2). Display the calculated BMI.
 **/
import java.util.*;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in pounds");
        double pound = sc.nextDouble();
        System.out.println("Enter your height in inches");
        double inch = sc.nextDouble();
        double kg = pound * 0.45359237;
        System.out.println("Weight in kg : "+kg);
        double meter = inch * 0.0254;
        System.out.println("Height in meters : "+meter);
        System.out.println("Your BMI is : " + (kg/(Math.pow(meter,2))));

    }
}
