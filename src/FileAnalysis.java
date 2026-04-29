/*
Write a Java program that reads a text file named data.txt. The program should count and display:
The total number of lines, The total number of words, The total number of characters (excluding
spaces and newline characters), Use FileReader / BufferedReader for reading the file. Handle
exceptions like FileNotFoundException and IOException.
 */
import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {

        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            br = new BufferedReader(new FileReader("src/data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                charCount += line.replaceAll("\\s", "").length();
            }

            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
/*
Total Lines: 2
Total Words: 6
Total Characters (excluding spaces): 24
 */