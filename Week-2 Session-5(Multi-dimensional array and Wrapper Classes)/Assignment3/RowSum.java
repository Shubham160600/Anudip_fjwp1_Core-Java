/* Write a java program to find the sum of each row elements. */

package shubham;

public class RowSum {
    public static void main(String[] args) {
        // Sample 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Find and print the sum of each row
        findRowSums(matrix);
    }

    // Function to find the sum of elements in each row of a 2D array
    private static void findRowSums(int[][] matrix) {
        // Iterate through each row
        for (int i = 0; i < matrix.length; i++) {
            // Initialize sum for the current row
            int rowSum = 0;

            // Iterate through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Add the current element to the sum
                rowSum += matrix[i][j];
            }

            // Print the sum of the current row
            System.out.println("Sum of elements in row " + (i + 1) + ": " + rowSum);
        }
    }
}
