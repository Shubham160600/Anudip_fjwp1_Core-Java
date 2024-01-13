/* Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers. */

package shubham;

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        int sum = calculateSumOfEvenNumbers(numbersList);
        System.out.println("Sum of even numbers: " + sum);
    }

    private static int calculateSumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
