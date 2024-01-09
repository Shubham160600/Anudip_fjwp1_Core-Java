/* Print the names of All months and the total number of days in each month using the enum java.time.Month. Consider that the year is not 
Leap Year. */

package shubham;

import java.time.Month;

public class MonthEnumExample {
    public static void main(String[] args) {
        // Iterate over all months and print their names and the total number of days
        for (Month month : Month.values()) {
            int totalDays = month.length(false); // false indicates not a leap year
            System.out.println(month + ": " + totalDays + " days");
        }
    }
}
