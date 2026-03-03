import java.util.*;
public class Cramer{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient a , b , c , d , e , f respectively: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        if (D == 0) {
            System.out.println("The system has no unique solution (D = 0).");
        }
        else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("\nValue of x = " + x);
            System.out.println("Value of y = " + y);
        }

    }
}