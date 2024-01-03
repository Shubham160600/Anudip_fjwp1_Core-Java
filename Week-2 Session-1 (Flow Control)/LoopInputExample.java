package shubham;

import java.util.Scanner;
public class LoopInputExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter five integers separated by spaces: ");
for (int i = 0; i < 5; i++) {
int num = scanner.nextInt();
System.out.println("You entered: " + num);
}
scanner.close();
}
}
