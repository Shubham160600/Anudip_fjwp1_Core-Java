package shubham;

import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create the first matrix
        int[][] matrix1 = inputMatrix("Enter values for the first matrix:", rows, columns, scanner);

        // Create the second matrix
        int[][] matrix2 = inputMatrix("Enter values for the second matrix:", rows, columns, scanner);

        // Subtract the matrices
        int[][] resultMatrix = subtractMatrices(matrix1, matrix2, rows, columns);

        // Display the result matrix
        System.out.println("Resultant Matrix (Subtraction):");
        displayMatrix(resultMatrix);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to input values for a matrix
    public static int[][] inputMatrix(String message, int rows, int columns, Scanner scanner) {
        System.out.println(message);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for element at index [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Function to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
