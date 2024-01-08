package shubham;

import java.util.Scanner;

public class StringInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the entered name as a string using nextLine()
        String name = scanner.nextLine();

        // Display a greeting using the entered name
        System.out.println("Hello, " + name + "!");

        // Close the Scanner to release system resources
        scanner.close();
    }
}
