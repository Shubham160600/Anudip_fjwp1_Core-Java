/* example of how you can use StringTokenizer and SimpleDateFormat for date parsing. */

package shubham;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class DateParsingExample {
    public static void main(String[] args) {
        String dateString = "10-07-2023"; // Assuming the initial date format is dd-MM-yyyy

        // Create a StringTokenizer to split the date string
        StringTokenizer tokenizer = new StringTokenizer(dateString, "-");

        // Extract the day, month, and year from the tokenized string
        String dayStr = tokenizer.nextToken();
        String monthStr = tokenizer.nextToken();
        String yearStr = tokenizer.nextToken();

        // Parse the date components into a Date object in another format
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date parsedDate = dateFormat.parse(monthStr + "/" + dayStr + "/" + yearStr);
            System.out.println("Parsed date: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
