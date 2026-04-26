/*Write a Java program that demonstrates method overloading to calculate the volume of different
3D shapes. Implement overloaded methods named calculateVolume() for a Cube (takes one side
length), a RectangularCube (takes length, width, height), and a Sphere (takes radius).
 */
import java.util.*;

public class Volume {

    public static double calculateVolume(double side) {
        return side * side * side;
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Cube ");
        System.out.print("Enter side length : ");
        double side = sc.nextDouble();
        System.out.printf("Volume            : %.2f%n", calculateVolume(side));

        System.out.println(" Rectangular Cuboid ");
        System.out.print("Enter length : ");
        double length = sc.nextDouble();
        System.out.print("Enter width  : ");
        double width = sc.nextDouble();
        System.out.print("Enter height : ");
        double height = sc.nextDouble();
        System.out.printf("Volume       : %.2f%n", calculateVolume(length, width, height));

        System.out.println(" Sphere ");
        System.out.print("Enter radius : ");
        double radius = sc.nextDouble();
        System.out.printf("Volume       : %.2f%n", calculateVolume(radius, true));

    }
}
/*
Cube
Enter side length : 12
Volume            : 1728.00
 Rectangular Cuboid
Enter length : 12
Enter width  : 12
Enter height : 12
Volume       : 1728.00
 Sphere
Enter radius : 12
Volume       : 7238.23
 */