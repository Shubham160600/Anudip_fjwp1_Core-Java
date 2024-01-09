/* example demonstrating how to format numbers and currencies using the French locale in Java. */

package shubham;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormattingExample {
    public static void main(String[] args) {
        // Create a French Locale
        Locale frenchLocale = new Locale("fr", "FR");

        // Format a number using the French locale
        double number = 123456.789;
        System.out.println("The number is " + number);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(frenchLocale);
        String formattedNumber = numberFormat.format(number);
        System.out.println("Formatted number in French Locale: " + formattedNumber);

        // Format currency using the French locale
        double amount = 1234.56;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(frenchLocale);
        String formattedCurrency = currencyFormat.format(amount);
        System.out.println("Formatted currency in French Locale: " + formattedCurrency);
    }
}
