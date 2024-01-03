package shubham;

import java.util.Scanner;
public class MenuExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int choice;
while (true) {
System.out.println("1. Option A");
System.out.println("2. Option B");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
choice = scanner.nextInt();
switch (choice) {
case 1:
// Code for Option A
break;
case 2:
// Code for Option B
break;
case 3:
System.out.println("Exiting the menu.");
scanner.close();
return; // Exit the loop and the program
default:
System.out.println("Invalid choice. Try again.");
}
}
}
}
