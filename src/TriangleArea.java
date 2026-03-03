/**Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the
 area of the triangle. Ensure that the program validates if the given side lengths can actually form a
 triangle (sum of any two sides must be greater than the third side) before calculating the area (use
 Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2).
**/
 import java.util.*;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lengths of 3 sides of a triangle a , b , c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a+b>c && b+c>a && a+c>b){
            double s = a+b+c;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of Triangle is : "+area);
        }
        else{
            System.out.println("Invalid input. Please enter valid side lengths");
        }
    }
}
