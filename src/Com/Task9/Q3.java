package Com.Task9;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();
	        printPattern(numRows);
	        scanner.close();
	    }

	    public static void printPattern(int rows) {
	        int num = 1;
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num++ + " ");
	            }
	            System.out.println();

	}

	    }
}
