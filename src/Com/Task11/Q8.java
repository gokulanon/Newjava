package Com.Task11;
	
	
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class Q8 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the file name (or full path): ");
	        String fileName = scanner.nextLine();
	        
	        try {
	            File file = new File(fileName);
	            Scanner fileScanner = new Scanner(file);
	            
	            while (fileScanner.hasNextLine()) {
	                String data = fileScanner.nextLine();
	                System.out.println(data);
	            }
	            
	            fileScanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File '" + fileName + "' not found.");
	        }
	        
	        scanner.close();
	    }
	}

