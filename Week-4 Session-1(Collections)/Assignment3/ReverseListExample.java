/* Write a program to reverse a given List of strings. */

package shubham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        System.out.println("Original List: " + stringList);

        // Reverse the list using Collections.reverse()
        Collections.reverse(stringList);

        System.out.println("Reversed List: " + stringList);
    }
}

/* Output:-

Original List: [Apple, Banana, Orange, Grapes]
Reversed List: [Grapes, Orange, Banana, Apple]
*/