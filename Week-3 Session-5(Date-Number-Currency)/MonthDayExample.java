/* java.time.MonthDay class. */

package shubham;


import java.time.MonthDay;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MonthDayExample {
    public static void main(String[] args) {
        // Create a MonthDay object for a specific month and day
        MonthDay christmas = MonthDay.of(Month.DECEMBER, 25);
        System.out.println("Christmas: " + christmas);

        // Get the month and day from a MonthDay object
        Month month = christmas.getMonth();
        int day = christmas.getDayOfMonth();
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        // Format the MonthDay using a specific pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd");
        String formattedMonthDay = christmas.format(formatter);
        System.out.println("Formatted MonthDay: " + formattedMonthDay);

        // Check if a MonthDay matches the current date
        MonthDay today = MonthDay.now();
        if (today.equals(christmas)) {
            System.out.println("Today is Christmas!");
        } else {
            System.out.println("Today is not Christmas.");
        }
    }
}
