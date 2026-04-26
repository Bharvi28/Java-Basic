/**Create an Employee class with private instance variables for employeeName (String) and
employeeSalary (double). Implement public methods readEmployeeData() (to take input from the
user) and displayEmployeeData() (to print the employee's name and salary). Demonstrate object
creation and method invocation in a main method.import java.util.*;
 **/
import java.util.*;
public class Employee {

    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name   : ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary : ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name   : " + employeeName);
        System.out.println("Employee Salary : $" + employeeSalary);

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();   // Object creation

        emp1.readEmployeeData();          // Method invocation (input)
        emp1.displayEmployeeData();       // Method invocation (output)
    }
}