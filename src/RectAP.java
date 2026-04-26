/**Define a Java class named Rectangle. It should have two double data fields: width and height, both
with a default value of 1. Implement a no-argument constructor and a constructor that takes width
and height as parameters. Include methods getArea() and getPerimeter() that return the calculated
area and perimeter respectively.
 **/

import java.util.*;
class Rectangle {

    double width = 1;
    double height = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
public class RectAP {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
        System.out.println("Enter h and w :");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        RectangleComp r2 = new RectangleComp(w,h);
        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Perimeter of r2: " + r2.getPerimeter());
    }
}