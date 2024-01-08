package shubham;

public class SwitchCaseTest {
	public static void main(String[] args) {
		int month = 6;

		// Switch statement to determine the number of days in a month
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("This month has 31 days");
				break;
			case 4, 6, 9:
				System.out.println("This month has 30 days");
				break;
			case 2:
				System.out.println("February can have 28 or 29 days");
				break;
			default:
				System.out.println("Invalid month");
		}
	}
}
