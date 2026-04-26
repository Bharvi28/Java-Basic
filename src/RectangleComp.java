/*Define a Java class named Rectangle. It should have two double data fields: width and height. In
your main method, create two Rectangle objects: one with width 4 and height 40, and another with
width 3.5 and height 35.9. For each rectangle, display its width, height, calculated area, and
perimeter. Then, compare the two rectangles based on their areas and print which one has a larger
area.
 */
public class RectangleComp {

    double width;
    double height;

    public RectangleComp(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void display() {
        System.out.println("Width      : " + width);
        System.out.println("Height     : " + height);
        System.out.println("Area       : " + getArea());
        System.out.println("Perimeter  : " + getPerimeter());
    }

    public static void main(String[] args) {

        RectangleComp r1 = new RectangleComp(4, 40);
        RectangleComp r2 = new RectangleComp(3.5, 35.9);

        System.out.println("Rectangle 1");
        r1.display();

        System.out.println("Rectangle 2");
        r2.display();

        System.out.println("Comparison");
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal areas.");
        }
    }
}
/*
Rectangle 1
Width      : 4.0
Height     : 40.0
Area       : 160.0
Perimeter  : 88.0
Rectangle 2
Width      : 3.5
Height     : 35.9
Area       : 125.64999999999999
Perimeter  : 78.8
Comparison
Rectangle 1 has a larger area.
 */