/* To know further details about Regex classes please follow these links. */

package shubham;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormattedDateMatcher {
    private final String dateFormatRegex;

    public FormattedDateMatcher(String dateFormatRegex) {
        this.dateFormatRegex = dateFormatRegex;
    }

    public boolean match(String date) {
        Pattern pattern = Pattern.compile(dateFormatRegex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String dateFormatRegex = "\\d{4}-\\d{2}-\\d{2}"; // yyyy-MM-dd
        FormattedDateMatcher matcher = new FormattedDateMatcher(dateFormatRegex);

        String validDate = "2023-07-10";
        String invalidDate = "07-10-2023";

        boolean isValid = matcher.match(validDate);
        System.out.println("Is it a valid date? " + isValid); // Output: true

        isValid = matcher.match(invalidDate);
        System.out.println("Is it a valid date? " + isValid); // Output: false
    }
}
