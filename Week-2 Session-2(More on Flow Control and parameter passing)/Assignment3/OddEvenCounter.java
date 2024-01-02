/* 
Write a program to count and print the total number of odd and even
numbers from user inputs. Program will ask for user inputs in a loop. Loop
will terminate if -1 is entered as input. */

import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oddCount = 0;
        int evenCount = 0;

        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}
