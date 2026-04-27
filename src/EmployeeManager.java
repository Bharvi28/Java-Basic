/* Create a base class named Employee that contains a method displayDetails() which prints general
employee details such as name and department. Now create a subclass Manager that inherits from
Employee and overrides the displayDetails() method to include additional information such as the
manager's team size or project name. In the main method, create objects of both Employee and
Manager classes and call the displayDetails() method using each object to show how Java
determines which version of the method to execute at runtime.
*/
import java.util.*;

class Emp {
    String name;
    String department;

    void getData(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Emp {
    int teamSize;
    String projectName;

    void getManagerData(Scanner sc) {
        getData(sc);
        System.out.print("Enter Team Size: ");
        teamSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Project Name: ");
        projectName = sc.nextLine();
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Emp e = new Emp();
        System.out.println(" Enter Employee Details ");
        e.getData(sc);

        Manager m = new Manager();
        System.out.println(" Enter Manager Details ");
        m.getManagerData(sc);

        System.out.println(" Employee Details ===");
        e.displayDetails();

        System.out.println(" Manager Details ");
        m.displayDetails();

    }
}
/*
Enter Employee Details
Enter Employee Name: abc
Enter Department: tech
 Enter Manager Details
Enter Employee Name: pqr
Enter Department: management
Enter Team Size: 5
Enter Project Name: ai
 Employee Details ===
Employee Name: abc
Department: tech
 Manager Details
Employee Name: pqr
Department: management
Team Size: 5
Project: ai
 */