/* ArrayDeque. */

package shubham;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements to the front of the deque (like a stack)
        arrayDeque.push("Element 1");
        arrayDeque.push("Element 2");
        arrayDeque.push("Element 3");

        // Adding elements to the end of the deque (like a queue)
        arrayDeque.offer("Element 4");
        arrayDeque.offer("Element 5");
        arrayDeque.offer("Element 6");

        // Displaying the elements in the deque
        System.out.println("ArrayDeque elements: " + arrayDeque);

        // Removing elements from the front of the deque
        String removedFromFront = arrayDeque.pop();
        System.out.println("Removed from front: " + removedFromFront);

        // Removing elements from the end of the deque
        String removedFromEnd = arrayDeque.pollLast();
        System.out.println("Removed from end: " + removedFromEnd);

        // Displaying the elements after removal
        System.out.println("ArrayDeque elements after removal: " + arrayDeque);
    }
}
