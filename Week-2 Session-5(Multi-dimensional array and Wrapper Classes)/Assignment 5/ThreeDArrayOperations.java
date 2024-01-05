/* Write a Java program that demonstrates various operations on a 3D
array:
1. Initializing the 3D array with random values.
2. Finding the maximum value in the array.
3. Calculating the average of all elements.
4. Displaying the array. */

package shubham;

import java.util.Random;

public class ThreeDArrayOperations {

    public static void main(String[] args) {
        // Define the dimensions of the 3D array
        int x = 3;
        int y = 3;
        int z = 3;

        // Initialize a 3D array with random values
        int[][][] array3D = initialize3DArray(x, y, z);

        // Display the 3D array
        System.out.println("3D Array:");
        display3DArray(array3D);

        // Find the maximum value in the array
        int max = findMaxValue(array3D);
        System.out.println("Maximum value in the array: " + max);

        // Calculate the average of all elements
        double average = calculateAverage(array3D);
        System.out.println("Average of all elements: " + average);
    }

    // Method to initialize a 3D array with random values
    private static int[][][] initialize3DArray(int x, int y, int z) {
        int[][][] array3D = new int[x][y][z];
        Random random = new Random();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array3D[i][j][k] = random.nextInt(100); // Adjust the range as needed
                }
            }
        }

        return array3D;
    }

    // Method to find the maximum value in a 3D array
    private static int findMaxValue(int[][][] array3D) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    if (array3D[i][j][k] > max) {
                        max = array3D[i][j][k];
                    }
                }
            }
        }

        return max;
    }

    // Method to calculate the average of all elements in a 3D array
    private static double calculateAverage(int[][][] array3D) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    sum += array3D[i][j][k];
                    count++;
                }
            }
        }

        return (double) sum / count;
    }

    // Method to display a 3D array
    private static void display3DArray(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
