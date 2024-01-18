/* Write a Java program to associate the specified value with the specified key in a HashMap. [Hint:Create HashMap and store few elements on it].
 *  */

package shubham;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Store elements in the HashMap
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 28);

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);
    }
}
