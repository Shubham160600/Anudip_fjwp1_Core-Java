package shubham;

import java.util.Scanner;

public class ArrayInputUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of size 5
        int[] arr = new int[5];

        // Input values from the user
        System.out.println("Enter 5 elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
