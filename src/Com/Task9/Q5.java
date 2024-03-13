package Com.Task9;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the mark: ");
	        int mark = scanner.nextInt();
	        char grade = calculateGrade(mark);
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }

	    public static char calculateGrade(int mark) {
	        char grade;

	        if (mark >=100) {
	            grade = 'S';
	        } else if (mark >= 90 && mark <= 99) {
	            grade = 'A';
	        } else if (mark >= 80 && mark <= 89) {
	            grade = 'B';
	        } else if (mark >= 70 && mark <= 79) {
	            grade = 'C';
	        } else if (mark >= 60 && mark <= 69) {
	            grade = 'D';
	        }else if (mark >=50 && mark <=59) {
	        	grade = 'E';
	        }else {
	        	grade ='F'; 
	        }

	        return grade;
	    }

	}
