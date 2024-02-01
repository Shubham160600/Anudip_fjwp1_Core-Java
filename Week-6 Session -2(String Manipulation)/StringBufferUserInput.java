/* StringBuffer. */

package shubham;

import java.util.Scanner;

public class StringBufferUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        // Prompt the user for input and append it to the StringBuffer
        System.out.print("Enter a string (or 'exit' to finish): ");
        String userInput = scanner.nextLine();

        while (!userInput.equalsIgnoreCase("exit")) {
            stringBuffer.append(userInput).append("\n"); // Append user input with a newline
            System.out.print("Enter another string (or 'exit' to finish): ");
            userInput = scanner.nextLine();
        }

        // Convert StringBuffer to a String and print the result
        String result = stringBuffer.toString();
        System.out.println("Concatenated Strings:");
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
