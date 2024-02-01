/* Exception Handling. */

package shubham;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        // Creating object BufferedInputStream class
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Input.txt"))) {
            int data;
            // Read character by character by default
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
