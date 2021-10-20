package recursion;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first input: ");
		Integer input1 = sc.nextInt();

		System.out.print("Enter second input: ");
		Integer input2 = sc.nextInt();

		if (input1 < 1 || input2 < 1) {
			System.out.println("Please enter a valid positive number.");
		} else {
			Integer result = null;
			if (input1 > input2) {
				result = gcdCalculate(input1, input2);
			} else {
				result = gcdCalculate(input2, input1);
			}
			System.out.println("\tGCD of: " + input1 + " And " + input2 + "\n\tResult: " + result);
		}

		sc.close();

	}

	private static Integer gcdCalculate(Integer input1, Integer input2) {
		if (input1 % input2 == 0) {
			return input2;
		} else {
			return gcdCalculate(input2, input1 % input2);
		}
	}

}
