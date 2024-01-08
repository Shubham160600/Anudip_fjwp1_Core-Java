package shubham;

import java.util.Scanner;

public class LoopInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter five integers separated by spaces
        System.out.print("Enter five integers separated by spaces: ");

        // Use a for loop to read and print each entered number
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        }

        // Close the Scanner to release system resources
        scanner.close();
    }
}
