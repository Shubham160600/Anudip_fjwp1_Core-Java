/* java.time.LocalTime. */

package shubham;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Create a LocalTime object representing the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // Create a LocalTime object with specific hour, minute, and second values
        LocalTime specificTime = LocalTime.of(12, 30, 45);
        System.out.println("Specific time: " + specificTime);

        // Perform operations on LocalTime objects
        LocalTime plusTwoHours = currentTime.plusHours(2);
        LocalTime minusTenMinutes = currentTime.minusMinutes(10);
        System.out.println("Current time plus two hours: " + plusTwoHours);
        System.out.println("Current time minus ten minutes: " + minusTenMinutes);

        // Format the time using a specific pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Formatted time: " + formattedTime);
    }
}
