/* PriorityQueue. */

package shubham;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue that implements the Queue interface
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        priorityQueue.add(8);

        // Displaying the elements in the PriorityQueue
        System.out.println("PriorityQueue elements: " + priorityQueue);

        // Removing elements from the PriorityQueue
        int firstElement = priorityQueue.poll();
        System.out.println("Removed element: " + firstElement);

        // Displaying the elements after removal
        System.out.println("PriorityQueue elements after removal: " + priorityQueue);
    }
}
