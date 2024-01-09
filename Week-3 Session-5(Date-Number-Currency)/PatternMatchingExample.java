package shubham;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";

        // Define the pattern to search for
        String patternString = "fox";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(patternString);

        // Create a Matcher object for the given text
        Matcher matcher = pattern.matcher(text);

        // Perform pattern matching and print the results
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String match = matcher.group();

            System.out.println("Found match: \"" + match + "\" starting at index " + start + " and ending at index " + end);
        }
    }
}
