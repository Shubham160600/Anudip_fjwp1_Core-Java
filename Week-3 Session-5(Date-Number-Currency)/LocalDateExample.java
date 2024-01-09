/* java.time.LocalDate. */

package shubham;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        // Create a LocalDate object representing today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Add 1 week to the current date
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("Next week's date: " + nextWeek);

        // Format the date using a specific pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}
