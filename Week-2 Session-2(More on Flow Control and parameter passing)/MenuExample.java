package shubham;

import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Displaying the menu options
            System.out.println("1. Option A");
            System.out.println("2. Option B");
            System.out.println("3. Exit");

            // Prompting the user to enter their choice
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Switch statement to handle different menu choices
            switch (choice) {
                case 1:
                    // Code for Option A
                    System.out.println("You selected Option A.");
                    // Add your code for Option A here
                    break;
                case 2:
                    // Code for Option B
                    System.out.println("You selected Option B.");
                    // Add your code for Option B here
                    break;
                case 3:
                    // Exiting the menu
                    System.out.println("Exiting the menu.");
                    scanner.close();
                    return; // Exit the loop and the program
                default:
                    // Handling invalid choices
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
