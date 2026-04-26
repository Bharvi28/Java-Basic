/*Create a Point class representing a 2D point (x, y). Implement a default constructor that initializes
both x and y to 5. Provide a parameterized constructor to initialize x and y with user-supplied
values. Also, implement a copy constructor to create a new Point object as a copy of an existing
Point object. Include a display() method to show the point's coordinates and write a main method
to test all constructors and the display functionality.
 */
public class Point {

    private double x;
    private double y;

    public Point() {
        this.x = 5;
        this.y = 5;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.print("p1 (default)     : ");
        p1.display();

        Point p2 = new Point(3.5, 7.2);
        System.out.print("p2 (parameterized): ");
        p2.display();

        Point p3 = new Point(p2);
        System.out.print("p3 (copy of p2)  : ");
        p3.display();
    }
}

/* output :
  p1 (default)     : Point(5.0, 5.0)
  p2 (parameterized): Point(3.5, 7.2)
  p3 (copy of p2)  : Point(3.5, 7.2)
 */