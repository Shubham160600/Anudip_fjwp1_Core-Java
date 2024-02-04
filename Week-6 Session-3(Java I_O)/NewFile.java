/* Exception Handling. */

package shubham;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NewFile {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\Anudip Foundation Core Java\\MyProject\\src\\shubham\\testout.txt");
			fout.write(65);
			fout.write('B');
			fout.close();
			System.out.println("success...");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}