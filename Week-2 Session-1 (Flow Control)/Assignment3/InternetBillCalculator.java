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
