/* Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object. Create an 
ArrayList of type Book and store all book objects into collections and display all book details. [Hint:Use advanced for loop to display 
all Books details]. */

package shubham;

import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Author: " + authorName;
    }
}

public class BookArrayListExample {
    public static void main(String[] args) {
        ArrayList<Book> booksList = new ArrayList<>();

        // Adding books to the ArrayList
        booksList.add(new Book(1, "The Catcher in the Rye", "J.D. Salinger"));
        booksList.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        booksList.add(new Book(3, "1984", "George Orwell"));

        // Displaying all book details using an enhanced for loop
        System.out.println("All Books Details:");
        for (Book book : booksList) {
            System.out.println(book);
        }
    }
}
