/* Methods in StringBuilder. */

package shubham;
import java.util.Scanner;

public class StringBuilderUserInputExample {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Initialize a StringBuilder with the user's input
        StringBuilder stringBuilder = new StringBuilder(userInput);

        // Append more text
        System.out.print("Enter text to append: ");
        String additionalText = scanner.nextLine();
        stringBuilder.append(" ").append(additionalText);

        // Insert text at a specific position
        System.out.print("Enter text to insert: ");
        String textToInsert = scanner.nextLine();
        System.out.print("Enter the position to insert: ");
        int insertPosition = scanner.nextInt();

        if (insertPosition >= 0 && insertPosition <= stringBuilder.length()) {
            stringBuilder.insert(insertPosition, textToInsert);
            System.out.println("Modified Text: " + stringBuilder.toString());
        } else {
            System.out.println("Invalid insert position.");
        }

        // Close the scanner
        scanner.close();
    }
}
