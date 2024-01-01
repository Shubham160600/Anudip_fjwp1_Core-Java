public class DaysInMonth {
    public static void main(String[] args) {
        int month = 2; // Example: 1 for January, 2 for February, etc.

        switch (month) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
