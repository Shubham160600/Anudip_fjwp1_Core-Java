package shubham;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Input values for the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find the largest element in the array
        int largestElement = findLargestElement(array);

        // Display the result
        System.out.println("The largest element in the array is: " + largestElement);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to find the largest element in an array
    public static int findLargestElement(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
