/* Exception Handling. */

package shubham;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIOTest {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
