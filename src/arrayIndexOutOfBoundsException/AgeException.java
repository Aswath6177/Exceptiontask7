package arrayIndexOutOfBoundsException;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeException {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age =sc.nextInt();
		
		try {
		if(age<18) {
			 throw new InvalidAgeException("Age must be 18 or older.");
		}
				
	}catch(InvalidAgeException e) {
		System.out.println("age is less than 18");
	}
		sc.close();
	}
	

}
