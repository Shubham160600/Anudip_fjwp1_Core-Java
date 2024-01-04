/* Write a java program to find smallest element from single dimensional array. */

package shubham;

public class SmallestElementInArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 5, 8, 3, 15, 7};

        // Find the smallest element
        int smallest = findSmallestElement(numbers);

        // Display the result
        System.out.println("The smallest element in the array is: " + smallest);
    }

    // Function to find the smallest element in an array
    private static int findSmallestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            // Handle edge case where array is empty or null
            System.out.println("Array is empty or null.");
            return Integer.MIN_VALUE; // Return a special value indicating error
        }

        int smallest = arr[0]; // Assume the first element is the smallest

        // Iterate through the array to find the smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }
}
