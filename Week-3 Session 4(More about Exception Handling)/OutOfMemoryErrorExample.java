/* OutOfMemoryError example in java. */

package shubham;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<byte[]> memoryList = new ArrayList<>();
        try {
            while (true) {
                byte[] memoryChunk = new byte[1024 * 1024]; // Allocate 1 MB
                memoryList.add(memoryChunk);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught: " + e.getMessage());
            System.out.println("Number of memory chunks allocated: " + memoryList.size());
        }
    }
}
