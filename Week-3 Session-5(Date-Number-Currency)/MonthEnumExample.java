/* java.time.Month enum. */

package shubham;


import java.time.LocalDate;
import java.time.Month;

public class MonthEnumExample {
    public static void main(String[] args) {
        // Retrieve the current month
        Month currentMonth = LocalDate.now().getMonth();
        System.out.println("Current month: " + currentMonth);

        // Get the name and value of a specific month
        Month july = Month.JULY;
        String monthName = july.name();
        int monthValue = july.getValue();
        int monthTotalDays = july.length(false);
        System.out.println("Month name: " + monthName);
        System.out.println("Month value: " + monthValue);
        System.out.println("Month has total days: " + monthTotalDays);

        // Iterate over all the months
        for (Month month : Month.values()) {
            System.out.println(month);
        }
    }
}
