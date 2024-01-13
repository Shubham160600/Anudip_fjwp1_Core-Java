/* Write a Java program that demonstrates the following operations on a HashSet: 
● Create a HashSet of integers. 
● Add the numbers 5, 10, 15, 20, and 25 to the set. 
● Display the elements of the set. 
● Check if the set contains the number 10. 
● Remove the number 15 from the set. 
● Display the size of the set. */

package shubham;

import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numberSet = new HashSet<>();

        // Add numbers to the set
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        numberSet.add(25);

        // Display the elements of the set
        System.out.println("Elements in the set: " + numberSet);

        // Check if the set contains the number 10
        boolean containsTen = numberSet.contains(10);
        System.out.println("Set contains 10: " + containsTen);

        // Remove the number 15 from the set
        numberSet.remove(15);

        // Display the size of the set
        System.out.println("Size of the set: " + numberSet.size());
    }
}
