/* Write a Java program that takes an array of integers as input and sorts it in ascending order using any sorting algorithm of your 
choice. Print the sorted array. */

package shubham;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));

        scanner.close();
    }
}
