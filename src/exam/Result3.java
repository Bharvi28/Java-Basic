package exam;

import student.Student;
import java.util.*;

 class Reesult extends Student {
    int marks1, marks2, marks3;

    // Constructor
    public Reesult(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public void displayResult() {
        displayStudent();
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);

        int total = marks1 + marks2 + marks3;
        double avg = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}



public class Result3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        Reesult r = new Reesult(rollNo, name, m1, m2, m3);

        System.out.println(" Mark Sheet ");
        r.displayResult();

    }
}
/*
Enter Roll No: 154
Enter Name: Bharvi
Enter Marks 1: 70
Enter Marks 2: 65
Enter Marks 3: 75
 Mark Sheet
Roll No: 154
Name: Bharvi
Marks 1: 70
Marks 2: 65
Marks 3: 75
Total: 210
Average: 70.0
 */