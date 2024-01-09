/* Parsing, Tokenizing, and Formatting. */

package shubham;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class ParsingFormattingExample {
    public static void main(String[] args) {
        // Parsing and Formatting Dates
        String dateString = "2023-07-10";
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        try {
            Date parsedDate = dateFormat.parse(dateString);
            String formattedDate = dateFormat.format(parsedDate);
            System.out.println("Parsed date: " + parsedDate);
            System.out.println("Formatted date: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        // Tokenizing and Formatting Currencies
        String amountString = "1,234.56 €";
        StringTokenizer tokenizer = new StringTokenizer(amountString);
        String amountValue = tokenizer.nextToken();
        String currencySymbol = tokenizer.nextToken();
        System.out.println("Parsed currency code " + currencySymbol);
        try {
            double amount = Double.parseDouble(amountValue.replace(",", ""));
            Currency currency = Currency.getInstance("EUR");
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
            String formattedAmount = currencyFormat.format(amount);
            System.out.println("Currency symbol is: " + currency.getSymbol());
            System.out.println("Parsed amount: " + amount);
            System.out.println("Parsed currency: " + currency);
            System.out.println("Formatted amount: " + formattedAmount);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing amount: " + e.getMessage());
        }
    }
}
