package Com.Task10;

public class Q3 {

	    private double radius;
	    
	    
	    public Q3() {
	        this.radius = 0.0; 
	    }
	    
	  
	    public Q3(double radius) {
	        this.radius = radius;
	    }
	    
	    // Method to calculate Circumference
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }
	    
	    public static void main(String[] args) {
	        
	        Q3 circle1 = new Q3(2.5);
	        Q3 circle2 = new Q3(5.0);
	      
	        double circumference1 = circle1.calculateCircumference();
	        double circumference2 = circle2.calculateCircumference();
	      
	        System.out.println("Circumference of Circle 1: " + circumference1);
	        System.out.println("Circumference of Circle 2: " + circumference2);
	    }

}
