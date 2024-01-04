/* Write a java program to print left and right diagonal elements from matrix. */


package shubham;

public class DiagonalElements {
    public static void main(String[] args) {
        // Sample square matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print left diagonal elements
        System.out.println("Left Diagonal Elements:");
        printLeftDiagonal(matrix);

        // Print right diagonal elements
        System.out.println("\nRight Diagonal Elements:");
        printRightDiagonal(matrix);
    }

    // Function to print the left diagonal elements of a square matrix
    private static void printLeftDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    // Function to print the right diagonal elements of a square matrix
    private static void printRightDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
        System.out.println();
    }
}
