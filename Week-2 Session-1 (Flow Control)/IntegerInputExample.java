package shubham;

import java.util.Scanner;

public class IntegerInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the user input as an integer
        int num = scanner.nextInt();

        // Display the entered integer
        System.out.println("You entered: " + num);

        // Close the Scanner to release system resources
        scanner.close();
    }
}
