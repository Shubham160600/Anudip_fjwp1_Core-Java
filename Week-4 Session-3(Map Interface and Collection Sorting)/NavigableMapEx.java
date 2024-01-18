/* NavigableMap Interface. */

package shubham;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapEx {
    public static void main(String[] args) {
        // Create a NavigableMap (TreeMap) to store String keys and Integer values
        NavigableMap<String, Integer> my_map = new TreeMap<>();

        // Add elements to the TreeMap
        my_map.put("A", 856);
        my_map.put("M", 349);
        my_map.put("Z", 567);

        // Display the descending set of keys
        System.out.printf("The descending set is: %s%n", my_map.descendingKeySet());

        // Display the floor entry for the key "A"
        System.out.printf("The floor entry is: %s%n", my_map.floorEntry("A"));

        // Display the first key in the TreeMap
        System.out.printf("The first key: %s%n", my_map.firstKey());

        // Display the reversed map
        System.out.printf("The reversed map: %s%n", my_map.descendingMap());
    }
}
