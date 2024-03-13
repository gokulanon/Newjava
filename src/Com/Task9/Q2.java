package Com.Task9;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userInput = scanner.nextLine();
		String reversedString = reverseString(userInput);
		System.out.println("Reversed string: " + reversedString);
		scanner.close();
	}

	public static String reverseString(String inputStr) {
		StringBuilder reversed = new StringBuilder();
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reversed.append(inputStr.charAt(i));
		}

		return reversed.toString();
	} 	

}
