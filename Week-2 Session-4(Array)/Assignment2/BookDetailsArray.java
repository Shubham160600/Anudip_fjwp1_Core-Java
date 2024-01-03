package shubham;

import java.util.Scanner;

class Book {
    private int bookId;
    private String bookName;
    private double price;

    // Constructor to initialize book details
    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

public class BookDetailsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of Book objects
        Book[] books = new Book[3];

        // Input book details from the user
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int bookId = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Book Name: ");
            String bookName = sc.nextLine();
            System.out.print("Price: $");
            double price = sc.nextDouble();

            // Create a Book object and store it in the array
            books[i] = new Book(bookId, bookName, price);
        }

        // Display book details
        System.out.println("Book Details:");
        for (Book book : books) {
            book.displayDetails();
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
