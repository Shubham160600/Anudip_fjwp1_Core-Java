/* Working with Currency. */

package shubham;

import java.util.Currency;
import java.util.Locale;

public class CurrencyExample {
    public static void main(String[] args) {
        // Creating instances of Currency for USD and EUR
        Currency usdCurrency = Currency.getInstance("USD");
        Currency euroCurrency = Currency.getInstance("EUR");

        // Displaying information for USD
        System.out.println(usdCurrency.getDisplayName(Locale.US)); // Output: US Dollar
        System.out.println(usdCurrency.getSymbol(Locale.US)); // Output: $

        // Displaying information for EUR
        System.out.println(euroCurrency.getDisplayName(Locale.GERMANY)); // Output: Euro
        System.out.println(euroCurrency.getSymbol(Locale.GERMANY)); // Output: €
    }
}
