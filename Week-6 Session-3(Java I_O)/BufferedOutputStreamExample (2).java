/* Exception Handling. */

package shubham;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        // Here we read from an input file Input.png and write to Output.txt
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Output.txt"))) {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Input.png"));
            int fileData;

            // -1 will signal closing of the file
            while ((fileData = bis.read()) != -1) {
                bos.write(fileData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

