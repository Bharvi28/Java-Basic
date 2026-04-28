/*
Define a custom exception class BookNotAvailableException that extends Exception.
● Create a class Library with:
● An instance variable availableBooks (integer).
● A method issueBook(int count) that:
o If count <= availableBooks, reduce the number of books and display "Book issued
successfully".
o Otherwise, throw BookNotAvailableException with the message "Requested books not
available".
In the main() method:
● Initialize the library with 3 available books.
● Try issuing 2 books (valid).
● Then try issuing 2 more books (should throw the custom exception).
 */
import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Books left: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class Book {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of available books: ");
        int total = sc.nextInt();

        Library lib = new Library(total);

        try {

            System.out.print("Enter number of books to issue (1st time): ");
            int first = sc.nextInt();
            lib.issueBook(first);

            System.out.print("\nEnter number of books to issue (2nd time): ");
            int second = sc.nextInt();
            lib.issueBook(second);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("\nLibrary process completed");
        }
    }
}
/*
Enter number of available books: 10
Enter number of books to issue (1st time): 5
Book issued successfully
Books left: 5

Enter number of books to issue (2nd time): 7
Exception: Requested books not available

Library process completed
 */