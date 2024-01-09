/* Using Finally. */

package shubham;

import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
        // Scanner class object to take input from the user
        Scanner scanner = new Scanner(System.in);

        try {
            // Input for the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Input for the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Division operation
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This block will be executed regardless of whether an exception occurs or not.
            System.out.println("Program continues after exception handling.");

            // Close the Scanner in the finally block to release resources
            scanner.close();
        }
    }
}
