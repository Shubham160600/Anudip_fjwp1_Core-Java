/* Write a program that prompts the user to enter an integer. Handle the InputMismatchException that 
might occur if the user enters a non-integer value. */

package shubham;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
