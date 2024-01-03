package shubham;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the dimensions of the array
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Create a two-dimensional array
        int[][] twoDArray = new int[rows][columns];

        // Input values for each array element
        System.out.println("Enter the values for the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for element at index [" + i + "][" + j + "]: ");
                twoDArray[i][j] = sc.nextInt();
            }
        }

        // Display the two-dimensional array
        System.out.println("The two-dimensional array is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line for a new row
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
