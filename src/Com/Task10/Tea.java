package Com.Task10;

	
	public class Tea {
	    void prepareTea() {
	        System.out.println("Preparing tea...");
	    }

	    public static void main(String[] args) {
	        // Create an array of Tea objects
	        Tea[] teas = new Tea[4];

	        // Populate the array with instances of Tea and its subclasses
	        teas[0] = new Tea();
	        teas[1] = new BlackTea();
	        teas[2] = new GreenTea();
	        teas[3] = new HerbalTea();

	        // Iterate over the array and call prepareTea() on each object
	        for (int i = 0; i < teas.length; i++) {
	            System.out.println("Brewing Tea " + (i + 1) + ":");
	            teas[i].prepareTea();
	            System.out.println(); // Add a newline for clarity
	        }
	    }
	}

	// Subclass BlackTea
	class BlackTea extends Tea {
	    @Override
	    void prepareTea() {
	        System.out.println("Preparing black tea with hot water and black tea leaves.");
	        System.out.println("Brewing for 5 minutes.");
	    }
	}

	// Subclass GreenTea
	class GreenTea extends Tea {
	    @Override
	    void prepareTea() {
	        System.out.println("Preparing green tea with hot water and green tea leaves.");
	        System.out.println("Brewing for 3 minutes.");
	    }
	}

	// Subclass HerbalTea
	class HerbalTea extends Tea {
	    @Override
	    void prepareTea() {
	        System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
	        System.out.println("Brewing for 7 minutes.");
	    }
	}



