package shubham;

import java.util.Scanner;
public class DoubleInputExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a floating-point number: ");
double num = scanner.nextDouble();
System.out.println("You entered: " + num);
scanner.close();
}
}
