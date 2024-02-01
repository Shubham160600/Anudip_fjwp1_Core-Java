/* FileNavigation. */

package shubham;

import java.io.File;

public class FileClassMethods {
    public static void main(String[] args) {
        // File name: Data.txt
        File myFile = new File("D:\\Anudip Foundation Core Java\\MyProject\\src\\shubham\\Data.txt");

        if (myFile.exists()) {
            // Print the file name
            System.out.println(myFile.getName() + " exists");
            System.out.println("The file is " + myFile.length() + " bytes long");

            // Check if the file can be read
            if (myFile.canRead())
                System.out.println("Ok to read");
            else
                System.out.println("Not ok to read");

            // Check if the file can be written
            if (myFile.canWrite())
                System.out.println("Ok to write");
            else
                System.out.println("Not ok to write");

            // Print the file path
            System.out.println("Path: " + myFile.getAbsolutePath());
            // Print the file name (repeated)
            System.out.println("File Name: " + myFile.getName());
            // Print the file size (repeated)
            System.out.println("File Size: " + myFile.length() + " bytes");
        } else {
            System.out.println("File does not exist");
        }
    }
}
