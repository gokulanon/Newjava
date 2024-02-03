package Com.Task8;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = scanner.nextInt();
		scanner.close();
		System.out.println("Original values: ");
		System.out.println("First number: " + number1);
		System.out.println("Second number: " + number2);
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("\nValues after swapping: ");
		System.out.println("First number: " + number1);
		System.out.println("Second number: " + number2);

	}

}
