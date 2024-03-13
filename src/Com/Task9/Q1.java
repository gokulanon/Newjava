package Com.Task9;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userInput = scanner.nextLine();
		if (isPalindrome(userInput)) {
			System.out.println(userInput + " is a palindrome.");
		} else {
			System.out.println(userInput + " is not a palindrome.");
		}

		scanner.close();
	}

	public static boolean isPalindrome(String inputStr) {
		String cleanedStr = inputStr.replaceAll(" ", "").toLowerCase();
		int startIndex = 0;
		int endIndex = cleanedStr.length() - 1;
		for (int i = 0; i < cleanedStr.length() / 2; i++) {
			if (cleanedStr.charAt(startIndex) != cleanedStr.charAt(endIndex)) {
				return false;
			}
			startIndex++;
			endIndex--;
		}

		return true;
	}

}
