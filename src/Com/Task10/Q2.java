package Com.Task10;

public class Q2 {
	    private int id;
	    private String firstName;
	    private String lastName;
	    private int salary;

	    public Q2(int id, String firstName, String lastName, int salary) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getName() {
	        return firstName + " " + lastName;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    public int getAnnualSalary() {
	        return salary * 12;
	    }
	    public int raiseSalary(int percent) {
	        salary += (salary * percent) / 100;
	        return salary;
	    }

	    public static void main(String[] args) {
	        Q2 employee1 = new Q2(101, "John", "Doe", 50000);
	        System.out.println("Original Salary:" + employee1.getSalary());
	        employee1.raiseSalary(10);
	        System.out.println("New Salary:" + employee1.getSalary());
	    }
	}

