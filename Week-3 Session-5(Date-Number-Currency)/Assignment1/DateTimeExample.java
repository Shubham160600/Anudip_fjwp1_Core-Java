/* Create a date time object using java.time.LocalDateTime class. Format the same date in dd/MM/yyyy HH:mm:ss format and print the output. */

package shubham;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Create a LocalDateTime object
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Format the date in dd/MM/yyyy HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Print the formatted date and time
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
