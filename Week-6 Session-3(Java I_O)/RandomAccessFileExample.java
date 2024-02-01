/* RandomAccessFile class. */

package shubham;

import java.io.*;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "data.txt";

        // Write data to the file using RandomAccessFile
        writeDataToFile(filePath);
        System.out.println("Writing successful");

        // Read and print data from specific positions in the file
        readDataFromFile(filePath);
    }

    private static void writeDataToFile(String filePath) {
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
            // Write data at specific positions in the file
            raf.writeUTF("John Doe"); // Writes a UTF-encoded string
            raf.writeInt(30); // Writes an integer
            raf.writeDouble(1000.5); // Writes a double
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readDataFromFile(String filePath) {
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
            // Move the file pointer to specific positions and read data
            raf.seek(0); // Move to the beginning of the file
            String name = raf.readUTF();
            int age = raf.readInt();
            double salary = raf.readDouble();
            
            System.out.println("Read Data:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

