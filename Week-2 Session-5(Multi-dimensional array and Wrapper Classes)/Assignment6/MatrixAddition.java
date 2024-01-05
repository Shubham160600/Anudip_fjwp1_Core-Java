/* Write a Java program that performs addition of two matrices. The
program should use a 2D array of wrapper class objects (e.g., Integer) for
the matrix elements. Take two matrices as input, perform the addition
operation, and display the resulting matrix. */

package shubham;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrices
        Integer[][] matrix1 = inputMatrix("Enter elements for the first matrix:");
        Integer[][] matrix2 = inputMatrix("Enter elements for the second matrix:");

        // Check if matrices can be added
        if (canAddMatrices(matrix1, matrix2)) {
            // Perform matrix addition
            Integer[][] resultMatrix = addMatrices(matrix1, matrix2);

            // Display the result matrix
            System.out.println("Resultant Matrix:");
            displayMatrix(resultMatrix);
        } else {
            System.out.println("Matrices cannot be added. Dimensions are not compatible.");
        }

        scanner.close();
    }

    // Method to input a matrix from the user
    private static Integer[][] inputMatrix(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(prompt);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        Integer[][] matrix = new Integer[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Method to check if two matrices can be added
    private static boolean canAddMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    // Method to add two matrices
    private static Integer[][] addMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        Integer[][] resultMatrix = new Integer[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Method to display a matrix
    private static void displayMatrix(Integer[][] matrix) {
        for (Integer[] row : matrix) {
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
