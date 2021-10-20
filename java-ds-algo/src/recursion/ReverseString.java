package recursion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		if (input == null || input.trim().isEmpty()) {
			System.out.println("Enter a valid string.");
		} else {
			String result = reverseString(input);
			System.out.println("\t Input String: " + input);
			System.out.println("\t Reverse string: " + result);
		}
		sc.close();
	}

	private static String reverseString(String input) {
		if (input.isEmpty()) {
			return input;
		} else {
			return reverseString(input.substring(1)) + input.charAt(0);
		}
	}

}
