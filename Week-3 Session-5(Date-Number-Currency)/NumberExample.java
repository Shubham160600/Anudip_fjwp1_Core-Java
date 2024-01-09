/* Example of parsing and formatting numbers using java.text
package. */

package shubham;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberExample {
    public static void main(String[] args) {
        // Parsing a number string
        String numberString = "12345.6789";
        try {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            Number number = numberFormat.parse(numberString);
            double parsedNumber = number.doubleValue();
            System.out.println(parsedNumber); // Output: 12345.6789
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Formatting a number
        double number = 12345.6789;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedNumber = decimalFormat.format(number);
        System.out.println(formattedNumber); // Output: 12,345.68
    }
}
