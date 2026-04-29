/*
Create a file named students.txt. Write at least three student records (roll number, name, marks)
into the file. Read the file content and display all student records on the console. Handle
exceptions like IOException properly using try-catch-finally.
 */
import java.io.*;

public class StudentFile {

    public static void main(String[] args) {

        File file = new File("students.txt");

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter(file);

            fw.write("101 Rahul 85\n");
            fw.write("102 Amit 78\n");
            fw.write("103 Neha 92\n");

            System.out.println("Data written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing writer.");
            }
        }

        try {
            br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader.");
            }
        }
    }
}
/*
Student Records:
101 Rahul 85
102 Amit 78
103 Neha 92
 */