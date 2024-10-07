package arrayIndexOutOfBoundsException;
import java.util.Scanner;

public class DivisionOfTwoNumbers {
public static void main(String[]args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("enter first number ");
	int a = sc.nextInt();
	System.out.println("enter second number ");
	int b =sc.nextInt();
	try {
		int c=a/b;
		
		System.out.println("the dividion of two numbers is "+c);
	}catch(ArithmeticException e) {
;		System.out.println("cannot be devided by zero  ");
	}
	
	sc.close();
	
}
}
