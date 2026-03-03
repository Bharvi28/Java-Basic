/**Write a Java program to solve a system of two linear equations with two variables (e.g., ax + by =
e and cx + dy = f). Prompt the user to enter the coefficients a, b, c, d, e, f. Calculate and display the
values of x and y using Cramer's rule. Include error handling for cases where the denominator is
zero Cramer's rule : D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D
**/
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
