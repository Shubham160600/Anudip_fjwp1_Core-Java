/* Write a program that takes user input and converts it to an integer using Integer.parseInt(). Handle the NumberFormatException and 
 * NullPointerException that might occur during the conversion. */

package shubham;

import java.util.Scanner;

public class StringToIntegerConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number as a string: ");
            String userInput = scanner.nextLine();

            // Handling NumberFormatException
            int convertedNumber = Integer.parseInt(userInput);
            System.out.println("Converted integer: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Error: Input is null. Please enter a valid string.");
        } finally {
            scanner.close();
        }
    }
}
