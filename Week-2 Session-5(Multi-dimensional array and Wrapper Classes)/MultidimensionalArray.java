package shubham;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // Create a 2D array
        int[][] a = {
                { 1, 2 },
                { 4, 5, 6, 9, 10 },
                { 7 },
        };

        // Calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
}
