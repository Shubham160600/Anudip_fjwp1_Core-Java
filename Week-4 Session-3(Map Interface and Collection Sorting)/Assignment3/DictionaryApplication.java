/* Write a Java program that demonstrates the functionality of this dictionary application using a TreeMap. Your program should include the 
 * following features: i)A TreeMap named dictionary to store word-definition pairs. ii)A way to input word-definition pairs and add them to the 
 * dictionary. iii)A way to retrieve and display the definition of a specific word. iv)An iteration through the dictionary to display all 
 * word-definition pairs in alphabetical order based on words. */

package shubham;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApplication {

    public static void main(String[] args) {
        // Create a TreeMap to store word-definition pairs
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Add word-definition pairs to the dictionary
        while (true) {
            System.out.print("Enter a word (or 'exit' to stop): ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter the definition: ");
            String definition = scanner.nextLine();

            // Add the word-definition pair to the dictionary
            dictionary.put(word, definition);
        }

        // Retrieve and display the definition of a specific word
        System.out.print("Enter a word to search for: ");
        String searchWord = scanner.nextLine();
        if (dictionary.containsKey(searchWord)) {
            System.out.println("Definition: " + dictionary.get(searchWord));
        } else {
            System.out.println("Word not found in the dictionary.");
        }

        // Display all word-definition pairs in alphabetical order
        System.out.println("All word-definition pairs in alphabetical order:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }
}
