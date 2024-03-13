package Com.Task9;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the month (1-12): ");
		int month = scanner.nextInt();

		System.out.print("Enter the room rent per day: ");
		double roomRent = scanner.nextDouble();

		System.out.print("Enter the number of days stayed: ");
		int daysStayed = scanner.nextInt();
		double tariff = calculateTariff(month, roomRent, daysStayed);
		System.out.printf("Hotel tariff to be paid: %.2f%n", tariff);
		scanner.close();
	}

	public static double calculateTariff(int month, double roomRent, int daysStayed) {
		double tariff;
		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			roomRent *= 1.20;
			break;
		default:
			break;
		}

		tariff = roomRent * daysStayed;

		return tariff;
	}
}


