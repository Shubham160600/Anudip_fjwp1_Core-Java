/* Write a program to check if today is independence day (15th August) or not using java MonthDay class. Using the method isBefore () find out 
 * if today is before or after the independence day. If today is before independence day then print “Independence day is yet to come this year". 
 * otherwise print “Independence day was already celebrated this year.” [Perform internet search if required]. */

package shubham;

import java.time.LocalDate;
import java.time.MonthDay;

public class IndependenceDayChecker {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Create Independence Day (15th August) using MonthDay class
        MonthDay independenceDay = MonthDay.of(8, 15);

        // Check if today is before or after Independence Day
        if (today.isBefore(LocalDate.of(today.getYear(), independenceDay.getMonth(), independenceDay.getDayOfMonth()))) {
            System.out.println("Independence day is yet to come this year.");
        } else {
            System.out.println("Independence day was already celebrated this year.");
        }
    }
}
