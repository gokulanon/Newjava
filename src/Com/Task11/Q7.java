package Com.Task11;
import java.util.Scanner;


class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class Q7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();

			if (age < 18) {
				throw new InvalidAgeException("Age must be 18 or greater.");
			}

			System.out.println("Age entered: " + age);
		} catch (InvalidAgeException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: Invalid input. Please enter a valid age.");
		} finally {
			scanner.close();
		}
	}
}



