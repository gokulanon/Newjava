package Com.Task11;

public class Q5 {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3};
		try {

			int num = numbers[3];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
		}

		// StringIndexOutOfBoundsException example
		String text = "Hello";
		try {

			char ch = text.charAt(10);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
		}
	}
}

