package Com.Task10;

public class Q6{
	public static void prepareBlackTea() {
		System.out.println("Preparing black tea with hot water and black tea leaves.");
		System.out.println("Brewing for 5 minutes.");
	}

	public static void prepareGreenTea() {
		System.out.println("Preparing green tea with hot water and green tea leaves.");
		System.out.println("Brewing for 3 minutes.");
	}

	public static void prepareHerbalTea() {
		System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
		System.out.println("Brewing for 7 minutes.");
	}

	public static void main(String[] args) {
		System.out.println("Brewing Black Tea:");
		prepareBlackTea();

		System.out.println("\nBrewing Green Tea:");
		prepareGreenTea();

		System.out.println("\nBrewing Herbal Tea:");
		prepareHerbalTea();
	}
}
