package recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String temp[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		Integer input = sc.nextInt();
		if (input < 0) {
			System.out.println("Please enter a positive number.");
			main(null);
		} else {
			Integer result = factorialCalculation(input);
			System.out.println("Factorial of " + input + " is: " + result);
		}
		sc.close();
	}

	private static Integer factorialCalculation(Integer input) {
		if (input == 0) {
			return 1;
		} else {
			return input * factorialCalculation(input - 1);
		}
	}
}
