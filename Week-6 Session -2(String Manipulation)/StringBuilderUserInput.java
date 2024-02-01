/* StringBuilder. */

package shubham;

import java.util.Scanner;

public class StringBuilderUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize a StringBuilder
        StringBuilder sb = new StringBuilder();
        // Prompt the user for input and append it to the StringBuilder
        System.out.print("Enter a string (or 'exit' to finish): ");
        String userInput = scanner.nextLine();
        while (!userInput.equalsIgnoreCase("exit")) {
            sb.append(userInput).append("\n"); // Append user input with a newline
            System.out.print("Enter another string (or 'exit' to finish): ");
            userInput = scanner.nextLine();
        }
        // Convert StringBuilder to a String and print the result
        String result = sb.toString();
        System.out.println("Concatenated Strings:");
        System.out.println(result);
        // Close the scanner
        scanner.close();
    }
}
