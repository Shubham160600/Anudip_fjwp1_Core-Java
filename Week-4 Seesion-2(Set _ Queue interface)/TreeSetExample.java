/* TreeSet. */

package shubham;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet that implements the SortedSet interface
        Set<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Apple"); // Adding a duplicate element (ignored in a set)

        // Displaying the elements in the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // Checking if an element exists in the TreeSet
        boolean containsBanana = treeSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Removing an element from the TreeSet
        boolean removed = treeSet.remove("Orange");
        System.out.println("Removed 'Orange': " + removed);

        // Displaying the size of the TreeSet
        int size = treeSet.size();
        System.out.println("TreeSet size: " + size);
    }
}
