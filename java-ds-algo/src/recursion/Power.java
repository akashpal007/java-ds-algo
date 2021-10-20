package recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter base: ");
		Integer base = sc.nextInt();

		System.out.print("Enter power: ");
		Integer exp = sc.nextInt();

		if (exp < 0) {
			System.out.println("Please enter a positive number for the exponent.");
			main(null);
		} else {
			Integer result = powerCalculate(base, exp);
			System.out.println("\tBase: " + base + " Exponent: " + exp + "\n\tResult: " + result);
		}
		sc.close();
	}

	private static Integer powerCalculate(Integer base, Integer exp) {

		if (exp == 0) {
			return 1;
		} else {
			return base * powerCalculate(base, exp - 1);
		}

	}

}
