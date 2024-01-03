package shubham;

import java.util.Scanner;

public class EvenPositionElements {
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

        // Print elements at even positions
        System.out.println("Elements at even positions:");

        for (int i = 1; i < size; i += 2) {
            System.out.println("Position " + (i + 1) + ": " + array[i]);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
