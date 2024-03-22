package Com.Task10;

public class Q1 {
	private String name;
	private int age;

	public Q1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Q1 person1 = new Q1("John", 30);

		System.out.println("Name: " + person1.getName());
		System.out.println("Age: " + person1.getAge());
	}
}


