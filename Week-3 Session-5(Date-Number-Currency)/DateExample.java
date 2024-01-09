/* Example of parsing and formatting a date. */

package shubham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        // Parsing a date string
        String dateString = "2023-05-16";
        LocalDate date = LocalDate.parse(dateString);

        // Formatting a date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = date.format(formatter);

        System.out.println(formattedDate); // Output: 16 May 2023
    }
}
