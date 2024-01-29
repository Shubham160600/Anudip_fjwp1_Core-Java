/* Write a program to print the location of file,size and name. */

package shubham;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        // Replace "your_file_path" with the actual path of the file
        String filePath = "your_file_path";
        
        // Create a File object
        File file = new File(filePath);
        
        // Check if the file exists
        if (file.exists()) {
            // Print file information
            System.out.println("File Location: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("File Name: " + file.getName());
        } else {
            System.out.println("File not found!");
        }
    }
}
