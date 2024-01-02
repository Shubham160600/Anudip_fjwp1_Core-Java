/* 
Write a program which calculates the monthly bill amount for a
internet subscriber based on the following logic:
1) If the total data consumed is less than 10 GB then bill amount
will be Rs. 300. (Basic charge)
2) If the data consumed is between 10 GB and 30 GB then bill
amount will be basic charge + 5* (Total GB consumed - 10).
That means consumers will be charged Rs 5 for each
additional GB consumed over 10 GB.
3) If the consumer consumes more than 30 GB then
The bill amount = 400 + 3 *(Total GB consumed - 30).
That means the consumer has to pay additional Rs 3 for each
GB above 30GB.
Use if-else block to solve the problem. */

import java.util.Scanner;

public class InternetBillCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner scanner = new Scanner(System.in);

        // Take input for total data consumed in GB
        System.out.print("Enter total data consumed in GB: ");
        int totalDataConsumed = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the monthly bill amount based on the provided logic
        int basicCharge = 300;
        int additionalCharge;

        if (totalDataConsumed <= 10) {
            // Basic charge for consumption less than or equal to 10 GB
            additionalCharge = 0;
        } else if (totalDataConsumed <= 30) {
            // Additional charge for consumption between 10 GB and 30 GB
            additionalCharge = 5 * (totalDataConsumed - 10);
        } else {
            // Additional charge for consumption above 30 GB
            additionalCharge = 400 + 3 * (totalDataConsumed - 30);
        }

        // Calculate the total bill amount
        int totalBillAmount = basicCharge + additionalCharge;

        // Display the result
        System.out.println("Total Data Consumed: " + totalDataConsumed + " GB");
        System.out.println("Monthly Bill Amount: Rs. " + totalBillAmount);
    }
}
