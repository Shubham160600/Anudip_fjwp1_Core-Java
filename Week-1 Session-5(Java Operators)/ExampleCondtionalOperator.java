package abc;

public class ExampleCondtionalOperator {
    public static void main(String[] args) {
        int daysInFebruary = 29;
        String result;

        // Ternary conditional operator
        result = (daysInFebruary == 28) ? "Not a leap year" : "Leap year";

        // The above statement is equivalent to the following if-else block:
        // if (daysInFebruary == 28) {
        // result = "Not a leap year";
        // } else {
        // result = "Leap year";
        // }

        System.out.println(result);
    }
}
