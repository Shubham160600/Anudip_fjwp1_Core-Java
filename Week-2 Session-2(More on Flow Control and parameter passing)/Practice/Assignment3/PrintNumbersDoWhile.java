/* Write a program to print the number from 300 to 1 using do while. */

public class PrintNumbersDoWhile {
    public static void main(String[] args) {
        int number = 300;

        do {
            System.out.print(number + " ");
            number--;
        } while (number >= 1);
    }
}
