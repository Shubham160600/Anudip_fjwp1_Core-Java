/* Print number 123456.78 using Italian Locale. Convert this number in the currency format of Korea and print. Use Locale.KOREA. */

package shubham;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {
    public static void main(String[] args) {
        double number = 123456.78;

        // Print number using Italian Locale
        NumberFormat italianFormatter = NumberFormat.getInstance(Locale.ITALY);
        String numberInItalianLocale = italianFormatter.format(number);
        System.out.println("Number in Italian Locale: " + numberInItalianLocale);

        // Convert number to Korean currency format
        NumberFormat koreanCurrencyFormatter = NumberFormat.getCurrencyInstance(Locale.KOREA);
        String numberInKoreanCurrency = koreanCurrencyFormatter.format(number);
        System.out.println("Number in Korean Currency Format: " + numberInKoreanCurrency);
    }
}
