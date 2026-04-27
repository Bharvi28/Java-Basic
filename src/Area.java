/*Design a base class Shape with two double data members d1 and d2 to store dimensions. Include a
method getData(double d1, double d2) to initialize these dimensions. Create two derived classes,
Triangle and Rectangle, which inherit from Shape. Each derived class should have its own method
to calculate its specific area.
 */
import java.util.*;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {

    double area() {
        return 0.5 * d1 * d2;
    }
}

class Rect extends Shape {

    // Method to calculate area of rectangle
    double area() {
        return d1 * d2;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        t.getData(base, height);
        System.out.println("Area of Triangle: " + t.area());

        Rect r = new Rect();
        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        r.getData(length, breadth);
        System.out.println("Area of Rectangle: " + r.area());

    }
}
/*
Enter base and height of triangle: 2
5
Area of Triangle: 5.0
Enter length and breadth of rectangle: 2
5
Area of Rectangle: 10.0
 */