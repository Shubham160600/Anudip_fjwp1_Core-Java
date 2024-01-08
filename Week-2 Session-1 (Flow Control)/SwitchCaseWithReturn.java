package shubham;

public class SwitchCaseWithReturn {
    // Method to get the number of days in a month using a switch expression
    static int getDays(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> 28;
            default -> 0;
        };
    }

    // Main method
    public static void main(String[] args) {
        int month = 3; // March
        System.out.println("Number of days in March = " + getDays(month));
    }
}
