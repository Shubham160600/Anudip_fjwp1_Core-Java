package shubham;

public class ArrayInitialization {
    public static void main(String[] args) {
        // Initializing an int array with default values (0 for int)
        int[] arr = new int[10];
        System.out.println("Printing the default values for all elements of the int array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Initializing a boolean array with default values (false for boolean)
        boolean[] boolArr = new boolean[10];
        System.out.println("Printing the default values for all elements of the boolean array:");
        for (int i = 0; i < boolArr.length; i++) {
            System.out.print(boolArr[i] + " ");
        }
    }
}
