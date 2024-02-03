package Com.Task8;

import java.util.Scanner;

public class Q5 {
public int number;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
 
        for (int i = 2; i <= Math.sqrt(number); i++) {
        	if (number % i == 0) {
        		System.out.println(number + " is not a prime number");
        	}else {
        		 System.out.println(number + " is a prime number.");
        		 
        	}
        }
		
	}
        
	
}




