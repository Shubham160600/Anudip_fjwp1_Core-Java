/* Hashing. */

package shubham;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet that implements the Set interface
        Set<String> stringSet = new HashSet<>();

        // Adding elements to the set
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Apple"); // Adding a duplicate element (ignored in a set)

        // Displaying the elements in the set
        System.out.println("Set elements: " + stringSet);

        // Checking if an element exists in the set
        boolean containsBanana = stringSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Removing an element from the set
        boolean removed = stringSet.remove("Orange");
        System.out.println("Removed 'Orange': " + removed);

        // Displaying the size of the set
        int size = stringSet.size();
        System.out.println("Set size: " + size);
    }
}
