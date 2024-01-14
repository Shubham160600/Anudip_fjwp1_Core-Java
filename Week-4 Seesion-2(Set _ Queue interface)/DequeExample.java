/* Deque Interface. */

package shubham;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a Deque using ArrayDeque implementation
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front of the deque (like a stack)
        deque.push("Element 1");
        deque.push("Element 2");
        deque.push("Element 3");

        // Adding elements to the end of the deque (like a queue)
        deque.offer("Element 4");
        deque.offer("Element 5");
        deque.offer("Element 6");

        // Displaying the elements in the deque
        System.out.println("Deque elements: " + deque);

        // Removing elements from the front of the deque
        String removedFromFront = deque.pop();
        System.out.println("Removed from front: " + removedFromFront);

        // Removing elements from the end of the deque
        String removedFromEnd = deque.pollLast();
        System.out.println("Removed from end: " + removedFromEnd);

        // Displaying the elements after removal
        System.out.println("Deque elements after removal: " + deque);
    }
}
