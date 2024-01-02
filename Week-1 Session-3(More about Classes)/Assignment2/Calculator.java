/* 
● Write a Java program that demonstrates method overloading by creating a class called Calculator.
● Add three methods called add().
● The first add() method should take two int variables as arguments and return their sum as int.
● The second add() method should take three int variables as arguments and return their sum as int.
● The third add() method should take two doubles as arguments and return their sum as double.
● The program should allow the user to display the results of each method. */

import java.util.Scanner;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers for method 1: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        System.out.println("Result of method 1: " + calculator.add(int1, int2));

        System.out.print("Enter three integers for method 2: ");
        int int3 = scanner.nextInt();
        System.out.println("Result of method 2: " + calculator.add(int1, int2, int3));

        System.out.print("Enter two doubles for method 3: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        System.out.println("Result of method 3: " + calculator.add(double1, double2));
    }
}
