package Com.Task8;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();
		scanner.close();

		int positiveNumber = Math.abs(number);
		String numberAsString = Integer.toString(positiveNumber);
		int digitCount = numberAsString.length();

		System.out.println("Number of digits in the integer is: " + digitCount);
	}


}


