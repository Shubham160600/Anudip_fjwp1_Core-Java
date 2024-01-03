package shubham;

import java.util.Scanner;
public class IntegerInputExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
int num = scanner.nextInt();
System.out.println("You entered: " + num);
scanner.close();
}
}
