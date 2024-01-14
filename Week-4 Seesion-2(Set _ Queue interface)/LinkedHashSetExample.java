/* LinkedHashSet. */

package shubham;

import java.util.HashSet;
import java.util.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet that implements the Set interface
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); // Adding a duplicate element (ignored in a set)

        // Displaying the elements in the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Checking if an element exists in the LinkedHashSet
        boolean containsBanana = linkedHashSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Removing an element from the LinkedHashSet
        boolean removed = linkedHashSet.remove("Orange");
        System.out.println("Removed 'Orange': " + removed);

        // Displaying the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("LinkedHashSet size: " + size);
    }
}
