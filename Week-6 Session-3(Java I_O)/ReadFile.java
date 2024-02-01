/* BufferedReader. */

package shubham;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            // Create a File object representing the text file
            File file = new File("input.txt");

            // Create a FileReader to connect to the text file
            FileReader fileReader = new FileReader(file);

            // Connect the FileReader to the BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read and display each line of the text file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Display the file's contents on the screen, one line at a time
                System.out.println(line);
            }

            // Close the BufferedReader to release resources
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


