package abc;

public class InstanceofExample {
    public static void main(String[] args) {
        // Create a String object
        String str = "Anudip";
        boolean result;

        // Verifies if 'str' is an instance of String class
        result = str instanceof String;
        System.out.println("Is str an instance of String? " + result);
    }
}
