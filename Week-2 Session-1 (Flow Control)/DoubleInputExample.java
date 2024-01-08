package shubham;

import java.util.Scanner;

public class DoubleInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a floating-point number
        System.out.print("Enter a floating-point number: ");

        // Read the user input as a double
        double num = scanner.nextDouble();

        // Display the entered number
        System.out.println("You entered: " + num);

        // Close the Scanner to release system resources
        scanner.close();
    }
}
