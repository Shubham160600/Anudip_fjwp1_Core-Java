package shubham;

public class LabelExample {
    public static void main(String[] args) {
        // Labeled statement 'outerLoop'
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                // Checking if the product of i and j is greater than 5
                if (i * j > 5) {
                    System.out.println("Exiting both loops.");
                    // Using the labeled statement with break to exit both loops
                    break outerLoop;
                }
                // Printing the values of i, j, and the product of i and j
                System.out.println("i=" + i + " j=" + j + " i*j=" + i * j);
            }
        }
    }
}
