/* Character Stream Hierarchy. */

package shubham;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterIOExample {
    public static void main(String[] args) {
        // Define the file paths for input and output
        String inputFile = "input.txt";
        String outputFile = "output2.txt";

        // Reading from a text file using FileReader
        try (FileReader reader = new FileReader(inputFile)) {
            int charValue;
            System.out.println("Reading from " + inputFile + ":");
            
            // Reads character values by default
            while ((charValue = reader.read()) != -1) {
                char character = (char) charValue;
                System.out.print(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to a text file using FileWriter
        try (FileWriter writer = new FileWriter(outputFile)) {
            String textToWrite = "Using Java Character I/O to write on file";
            System.out.println("\nWriting to " + outputFile + ":");
            writer.write(textToWrite);
            System.out.println(textToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nCharacter I/O operations completed.");
    }
}

