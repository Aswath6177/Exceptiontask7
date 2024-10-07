package arrayIndexOutOfBoundsException;

public class Stringexception {
public static void main(String []args) {
	String num ="12345";
	
	try {
		System.out.println(num.charAt(5));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("Exception is capturen"+ e.getMessage());
	}
}
}
