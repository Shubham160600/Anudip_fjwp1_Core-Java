package shubham;

import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    float bookPrice;
    int pages;

    // Getter and setter methods
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Parameterized constructor
    public Book(int bookId, String bookName, float bookPrice, int pages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.pages = pages;
    }

    // Default constructor
    public Book() {
    }

    // Display method to print book details
    void display() {
        System.out.println(" Book Id: " + this.bookId +
                "\n Book Name: " + this.bookName +
                "\n Book Price: " + this.bookPrice +
                "\n Book Pages: " + this.pages);
    }
}

public class ArrayOfObjectEx {
    public static void main(String[] args) {
        // Create an array of Book objects
        Book books[] = new Book[10];
        int size;
        int id;
        String bookName;
        float bookPrice;
        int pages;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many books you want to enter:");
        size = sc.nextInt();

        System.out.println("Enter " + size + " book details in an array!!");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter book id: ");
            id = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.println("Enter book Name: ");
            bookName = sc.nextLine();
            System.out.println("Enter book price: ");
            bookPrice = sc.nextFloat();
            System.out.println("Enter book pages: ");
            pages = sc.nextInt();

            // Add details to the array
            books[i] = new Book(id, bookName, bookPrice, pages);
            System.out.println("====================================");
        }

        System.out.println("====================================");
        System.out.println("All Book details:");
        for (int i = 0; i < size; i++) {
            books[i].display();
            System.out.println("====================================");
        }
    }
}
