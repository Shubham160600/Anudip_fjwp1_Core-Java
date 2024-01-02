/* 
Write a program to find out all the armstrong numbers within a given
range using a method named printArmstrongNumber( int start, int
end) by taking input from the user. The program should print the
Armstrong number in a given range starting from “start” and ending
with “end”.
Armstrong Number Example: 153 13+53+33 =153 (Number which is equal
to the sum of the cubes of its digits)
Note: input should be taken from the keyboard. Use a loop to calculate the
Armstrong number from “start” to “end”. Also use loops to calculate the
cube of a number. Do not use the Math.pow() function. */

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending range: ");
        int end = scanner.nextInt();
        
        printArmstrongNumber(start, end);
    }

    static void printArmstrongNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
