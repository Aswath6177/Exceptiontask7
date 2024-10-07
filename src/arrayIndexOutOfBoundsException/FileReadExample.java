package arrayIndexOutOfBoundsException;

import java.io.File;
import java.io.FileNotFoundException;   /* Implement exception handling in a Java program that reads data from a file. 
                              If the file does not exist, throw a "FileNotFoundException" and display an error message to the user*/

import java.util.Scanner;

public class FileReadExample {
	 public static void main(String[] args) {
	        
	        String fileName = "example.txt";  

	        
	        File file = new File(fileName);

	        
	        try {
	            Scanner fileScanner = new Scanner(file);
	            while (fileScanner.hasNextLine()) {
	                String line = fileScanner.nextLine();
	                System.out.println(line);
	            }
	            fileScanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: The file '" + fileName + "' was not found.");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        }
	    }
	}

