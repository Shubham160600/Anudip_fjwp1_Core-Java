package shubham;

public class MultiplicationTable {
    // Method to create a multiplication table up to n rows and m columns
    static void createMultiplicationTable(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Print the product of i and j followed by a tab character
                System.out.print(i * j + "\t");
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Call the createMultiplicationTable method with n=5 and m=10
        createMultiplicationTable(5, 10);
    }
}
