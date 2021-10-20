package recursion;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		Integer input = sc.nextInt();
		if (input < 0) {
			System.out.println("Please enter a positive number.");
			main(null);
		} else {
			Integer result = sumOfDigitCalculate(input);
			System.out.println("Sum Of Digit of " + input + " is: " + result);
		}
		sc.close();
	}

	private static Integer sumOfDigitCalculate(Integer input) {
		if (input / 10 == 0) {
			return input % 10;
		} else {
			return (input % 10) + sumOfDigitCalculate(input / 10);
		}
	}

}
