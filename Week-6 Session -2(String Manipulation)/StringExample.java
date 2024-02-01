/* String class and its methods. */

package shubham;

public class StringExample {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");

        // Concatenating strings
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        // Finding string length
        String text = "This is a sample text.";
        int length = text.length();

        // String comparison
        String java1 = "Java";
        String java2 = "Java";
        boolean areEqual = java1.equals(java2); // Content comparison
        boolean areSame = (java1 == java2); // Reference comparison

        // Substring
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String substring = sentence.substring(10, 15); // Extracts "brown"

        // Searching in strings
        String sentence2 = "Java is a popular programming language.";
        int indexOfJava = sentence2.indexOf("Java"); // Find the index of "Java"
        boolean containsJava = sentence2.contains("Java"); // Check if it contains "Java"

        // Splitting strings
        String csvData = "John,Doe,30";
        String[] parts = csvData.split(",");

        // Converting case
        String mixedCase = "ThIs Is A MiXeD CaSe StRiNg";
        String uppercase = mixedCase.toUpperCase();
        String lowercase = mixedCase.toLowerCase();

        // Trimming whitespace
        String paddedString = " Some Text with Spaces ";
        String trimmedString = paddedString.trim();

        // Checking for empty or null strings
        String emptyString = "";
        String nullString = null;
        boolean isEmpty1 = emptyString.isEmpty(); // Check if empty
        boolean isEmpty2 = nullString == null || nullString.isEmpty();

        // Replace characters or substrings
        String originalText = "I love cats. Cats are cute!";
        String replacedText = originalText.replace("cats", "dogs");

        // String format
        String formattedString = String.format("Hello, %s! You are %d years old.", "Alice", 25);

        // String builder for efficient string manipulation
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This ");
        stringBuilder.append("is ");
        stringBuilder.append("a ");
        stringBuilder.append("string ");
        stringBuilder.append("builder.");
        String result = stringBuilder.toString();

        // Output
        System.out.println(str1);
        System.out.println(fullName);
        System.out.println("Length of text: " + length);
        System.out.println("Are equal: " + areEqual);
        System.out.println("Are same: " + areSame);
        System.out.println("Substring: " + substring);
        System.out.println("Index of 'Java': " + indexOfJava);
        System.out.println("Contains 'Java': " + containsJava);
        System.out.println("Parts after splitting: " + String.join(", ", parts));
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Trimmed: '" + trimmedString + "'");
        System.out.println("Is empty 1: " + isEmpty1);
        System.out.println("Is empty 2: " + isEmpty2);
        System.out.println("Replaced text: " + replacedText);
        System.out.println(formattedString);
        System.out.println("StringBuilder result: " + result);
    }
}
