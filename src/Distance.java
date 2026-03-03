/**Develop a Java program that prompts the user to enter a distance in meters. Your program should
 then convert this distance to feet (1 meter = 3.28084 feet) and display the result formatted to two
 decimal places.**/
import java.util.*;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Distance in meter :");
        float meter = sc.nextFloat();
        double feet = meter * 3.28084;
        System.out.printf("Distance in feet is: %.2f", feet);
    }
}