package Com.Task10;

public class Q4 {

	private double balance;

	public Q4() {
		this.balance = 0.0;
	}
	public Q4(double initialBalance) {
		this.balance = initialBalance;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. Current balance: " + balance);
		} else {
			System.out.println("Insufficient balance or invalid amount for withdrawal.");
		}
	}
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. Current balance: " + balance);
		} else {
			System.out.println("Invalid amount for deposit.");
		}
	}

	public static void main(String[] args) {

		Q4 depositAmount = new Q4(); 
		Q4 withdrawAmount = new Q4(1000.0); 

		depositAmount.deposit(500.0);
		withdrawAmount.withdraw(200.0);
	}
}
