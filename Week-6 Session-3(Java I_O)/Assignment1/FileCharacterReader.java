/* Write a Java program that reads an input file from the file system and outputs the content of the file character by character. Use FileReader.read() 
 * method to read characters from the file. At the end, print the total number of characters present in the file. */

package shubham;

import java.io.FileReader;
import java.io.IOException;

public class FileCharacterReader {
    public static void main(String[] args) {
        // Specify the path of the input file
        String filePath = "input.txt";

        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            int charCount = 0;

            System.out.println("Content of the file:");

            // Read characters from the file and print them
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
                charCount++;
            }

            // Print the total number of characters in the file
            System.out.println("\nTotal number of characters: " + charCount);

        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
