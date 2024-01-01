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
