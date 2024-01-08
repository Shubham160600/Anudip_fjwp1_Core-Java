/* Create a Java program that acts as a simple calculator. 
 * ● The program should prompt the user to enter two numbers and an operator (+, -, *, /). 
 * ● Perform the corresponding calculation based on the operator. 
 * ● Handle potential exceptions, such as division by zero or invalid operator input. 
 * ● Display the result or an appropriate error message. */

package shubham;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Perform calculation based on operator
            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }

            // Display result
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
