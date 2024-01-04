/* Write a java program to find largest element from single dimensional array. */

package shubham;

public class LargestElementInArray {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 5, 8, 3, 15, 7};

        // Find the largest element
        int largest = findLargestElement(numbers);

        // Display the result
        System.out.println("The largest element in the array is: " + largest);
    }

    // Function to find the largest element in an array
    private static int findLargestElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            // Handle edge case where array is empty or null
            System.out.println("Array is empty or null.");
            return Integer.MIN_VALUE; // Return a special value indicating error
        }

        int largest = arr[0]; // Assume the first element is the largest

        // Iterate through the array to find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
