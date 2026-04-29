/*
Write a program that will count the number of characters, words, and lines in a file. Words are
separated by whitespace characters. The file name should be passed as a command-line argument.
 */
import java.io.*;

class FileStats {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide file name as command-line argument.");
            return;
        }

        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file!");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
/*
PS C:\Users\jeetcctv\Java-Basic> javac src/FileStats.java
PS C:\Users\jeetcctv\Java-Basic> java -cp src FileStats src/test.txt
Lines: 2
Words: 6
Characters: 28
PS C:\Users\jeetcctv\Java-Basic>

 */