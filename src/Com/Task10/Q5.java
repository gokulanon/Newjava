package Com.Task10;

public class Q5 {

	public void prepareBasicTea() {
		System.out.println("Preparing basic tea with hot water and tea leaves");
	}

	public void addMilk() {
		System.out.println("Adding milk to the tea");
	}

	public void addSugar() {
		System.out.println("Adding sugar to the tea");
	}
	public static void main(String[] args) {
		Q5 tea =new Q5();

		tea.prepareBasicTea();
		tea.addMilk();
		tea.addSugar();
	}

}
