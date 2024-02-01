/* Exception Handling. */

package shubham;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        // Creating object BufferedOutputStream class
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            String data = "Hello, BufferedOutputStream!";
            byte[] bytes = data.getBytes();
            bos.write(bytes);
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
