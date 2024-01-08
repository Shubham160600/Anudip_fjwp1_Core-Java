package shubham;

import java.util.*;
/**
*
* Class to demonstrate selection sorting tecnique
*
*/
import java.util.Arrays;

public class SelectionSort {
    // This method sorts the input array using selection sort
    static void sortArray(int numArray[]) {
        int n = numArray.length;

        // Traverse the unsorted array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (numArray[j] < numArray[min_idx])
                    min_idx = j; // min_idx gets the index of the Minimum element

            // Swap the minimum element with the compared element
            int temp = numArray[min_idx];
            numArray[min_idx] = numArray[i];
            numArray[i] = temp;
        }
    }

    public static void main(String args[]) {
        // Declare and print the original array
        int numArray[] = { 7, 1, 4, 2, 3 };
        System.out.println("Original Array: " + Arrays.toString(numArray));

        // Call the selection sort method
        sortArray(numArray);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numArray));
    }
}
