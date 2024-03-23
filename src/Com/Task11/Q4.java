package Com.Task11;

import java.util.Scanner;

public class Q4 {
	
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        try {
	            int result = divideNumbers(num1, num2);
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero. Please enter a non-zero second number.");
	        }

	        scanner.close();
	    }

	    public static int divideNumbers(int num1, int num2) {
	        return num1 / num2;
	    }
	}

