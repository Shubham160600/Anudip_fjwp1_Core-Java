package shubham;

public class SwitchCaseWithMultipleConstants {
public static void main(String[] args) {
int month =14;
switch (month) {
case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("this month has 31 days");
case 4, 6, 9 -> System.out.println("this month has 30 days");
case 2 -> System.out.println("February can have 28 or 29 days");
default -> System.out.println("invalid month");
}
}
}