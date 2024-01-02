/* Using for loop statement, print the even and odd number between 100 to 300. */

public class EvenOddPrinter {
    public static void main(String[] args) {
        System.out.println("Even numbers between 100 and 300:");
        for (int i = 100; i <= 300; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers between 100 and 300:");
        for (int i = 100; i <= 300; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
