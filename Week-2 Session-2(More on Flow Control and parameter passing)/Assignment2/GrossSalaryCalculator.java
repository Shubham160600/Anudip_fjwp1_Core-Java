/* 
Write a program to calculate the gross salary of a group of
employees. Basic salary should be taken from the user.
If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be
given, else HRA=3000 and DA 70% will be given to the employee.
Note:Input of basic salary will be taken from the keyboard. After calculating
the salary of one employee, the program will ask for the user's choice as
int. If “-1” is entered then the loop will continue and the loop will exit for
other int inputs. */

import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the basic salary (-1 to exit): ");
            int basicSalary = scanner.nextInt();

            if (basicSalary == -1) {
                break;
            }

            double hra, da;

            if (basicSalary > 15000) {
                hra = 0.20 * basicSalary;
                da = 0.60 * basicSalary;
            } else {
                hra = 3000;
                da = 0.70 * basicSalary;
            }

            double grossSalary = basicSalary + hra + da;
            System.out.println("Gross Salary: " + grossSalary);
        }
    }
}
