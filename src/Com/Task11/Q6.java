package Com.Task11;

import java.util.Scanner;

public class Q6 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String correctPassword = "password123"; // Correct password

	        System.out.print("Enter your password: ");
	        String enteredPassword = scanner.nextLine();

	        if (enteredPassword.equals(correctPassword)) {
	            System.out.println("Login successful:)!");
	        } else {
	            System.out.println("OOPS:) Incorrect password entered.");
	        }

	        scanner.close();
	    }
	}


