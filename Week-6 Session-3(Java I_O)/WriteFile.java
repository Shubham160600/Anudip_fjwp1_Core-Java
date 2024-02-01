/* BufferedWriter. */

package shubham;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String[] list = {"one", "two", "three", "fo"};
        
        try {
            // Create a File object representing the text file
            File file = new File("data1.txt");

            // Create a FileWriter to connect to the text file
            FileWriter fileWriter = new FileWriter(file);

            // Connect the FileWriter to the BufferedWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write each string from the array to the file
            for (String s : list) {
                bufferedWriter.write(s + "\n");
            }

            // Close the BufferedWriter to release resources
            bufferedWriter.close();

            System.out.println("Written output successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
