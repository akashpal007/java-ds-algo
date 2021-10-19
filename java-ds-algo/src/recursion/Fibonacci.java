package recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number(Position of Fibonacci no): ");
		Integer input = sc.nextInt();
		if (input < 1) {
			System.out.println("Please enter a positive number( grater than 0 ).");
			main(null);
		} else {
			Integer result = fibonacciNumber(input);
			System.out.println("the fibonacci no is : " + result);
		}
		sc.close();
	}

	private static Integer fibonacciNumber(Integer input) {
		if (input == 1) {
			return 0;
		} else if (input == 2) {
			return 1;
		} else if (input > 2) {
			return fibonacciNumber(input - 1) + fibonacciNumber(input - 2);
		} else {
			return null;
		}
	}
}
