/* 
Write a program to enter P,T (principal and time) and calculate
simple interest. Use the Scanner class for taking inputs from the
console. Users will enter the principal amount and time(in years).
Create an if-else statement and modify the interest rate based on the
principal amount. If the amount > 10000 then the interest rate is 10%. If the
amount is between 10000 and 5000 then make the interest rate 8%. For
any amount below 5000 the interest rate should be 5%. */

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner scanner = new Scanner(System.in);

        // Take input for principal amount
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Take input for time in years
        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Set initial interest rate to 5%
        double interestRate = 0.05;

        // Modify the interest rate based on the principal amount
        if (principal > 10000) {
            interestRate = 0.10;
        } else if (principal >= 5000 && principal <= 10000) {
            interestRate = 0.08;
        }

        // Calculate simple interest
        double simpleInterest = principal * interestRate * time;

        // Display the result
        System.out.println("Principal Amount (P): " + principal);
        System.out.println("Time (T): " + time + " years");
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
