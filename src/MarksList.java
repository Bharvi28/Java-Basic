/*
Write a Java program that uses an ArrayList<Integer> to store marks of students. Perform the
following operations:
● Add at least 5 marks.
● Display all marks.
● Find and display the highest and lowest marks using Collections.max() and Collections.min().
 */
import java.util.*;

public class MarksList {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 marks:");
        for (int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("\nMarks entered:");
        for (int m : marks) {
            System.out.println(m);
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("\nHighest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

    }
}
/*
Enter 5 marks:
10
20
30
40
50

Marks entered:
10
20
30
40
50

Highest Marks: 50
Lowest Marks: 10

 */