/* Propagating Uncaught Exceptions. */

package shubham;

import java.util.Scanner;

public class UncaughtExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            int userInput = readInteger();
            System.out.println("You entered: " + userInput);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();
        scanner.close();
        return Integer.parseInt(input); // May throw NumberFormatException
    }
}
