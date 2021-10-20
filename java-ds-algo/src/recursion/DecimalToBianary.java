package recursion;

import java.util.Scanner;

public class DecimalToBianary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		Integer input = sc.nextInt();
		if(input<0) {
			System.out.println("Please enter a positive number.");
		}else {			
			Integer result = decimalToBianary(input);
			System.out.println("\tDecimal value: "+input+"\n\tBianary value: "+result);
		}
		sc.close();

	}

	private static Integer decimalToBianary(Integer input) {
		if(input == 0) {
			return 0;
		}else {
			return (10 * decimalToBianary(input / 2)) + (input % 2);
		}
	}

}
