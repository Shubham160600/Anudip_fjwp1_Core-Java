package shubham;

public class SwitchCaseExample {
    public static void main(String[] args) {
        // Assign a value to the dayOfWeek variable (for example, 3 represents
        // Wednesday)
        int dayOfWeek = 3;

        // Switch statement to determine the day of the week based on the value of
        // dayOfWeek
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
