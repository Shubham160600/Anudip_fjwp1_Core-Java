/* java.time.LocalDateTime. */

package shubham;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Create a LocalDateTime object representing current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // Format the date and time using a specific pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}
