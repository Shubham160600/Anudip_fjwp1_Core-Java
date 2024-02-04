/* Create a program that reads a list of strings and concatenates them into a single string using the Stream API. Avoid using lambda expressions for 
 * concatenation. */

package shubham;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateWithoutLambda {
    public static void main(String[] args) {
        // Example list of strings
        List<String> stringList = Arrays.asList("Hello", " ", "World", "!");

        // Concatenate strings using Stream API
        String concatenatedString = stringList.stream()
                .collect(Collectors.joining());

        // Print the original list and the concatenated string
        System.out.println("Original List: " + stringList);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
