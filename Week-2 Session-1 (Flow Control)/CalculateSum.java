package shubham;

public class CalculateSum {
	// Calculating the sum of the first n natural numbers:
	static int calculateSum (int n) {
	int sum = 0;
	// For loop to calculate sum
	for (int i = 1; i <= 10; i++) {
	sum += i;
	}
	return sum;
	}
	public static void main(String[] args) {
	System.out.println("Sum of the first 10 natural numbers: " + calculateSum(10));
	}
	}