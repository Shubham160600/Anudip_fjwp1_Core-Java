/* Exception Matching. */

package shubham;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();
            int result = divideBy(userInput, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Invalid input.");
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int divideBy(int dividend, int divisor) {
        return dividend / divisor;
    }
}
