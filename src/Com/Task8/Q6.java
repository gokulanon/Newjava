package Com.Task8;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to find Factorial: ");
		int number = scanner.nextInt();
		scanner.close();
		int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + "! = " + factorial);

	}

}
