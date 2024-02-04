/* Write a program that reads a list of strings and removes duplicate strings from the list using the Stream API. Avoid using lambda expressions for this
 * task. */

package shubham;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesWithoutLambda {
    public static void main(String[] args) {
        // Example list of strings with duplicates
        List<String> stringList = Arrays.asList("apple", "orange", "banana", "apple", "grape", "banana", "orange");

        // Remove duplicates using Stream API
        List<String> uniqueStrings = stringList.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the original and unique lists
        System.out.println("Original List: " + stringList);
        System.out.println("List with Duplicates Removed: " + uniqueStrings);
    }
}
