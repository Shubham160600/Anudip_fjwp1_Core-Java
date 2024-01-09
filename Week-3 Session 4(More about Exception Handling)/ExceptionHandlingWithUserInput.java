/* An example that demonstrates handling a class hierarchy of exceptions using
user input. */

package shubham;

import java.util.*;

public class ExceptionHandlingWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Invalid input.");
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        } finally {
            // Ensure that the Scanner is closed
            scanner.close();
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
