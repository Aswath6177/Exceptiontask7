package arrayIndexOutOfBoundsException;

public class Arrayexception {
	
	public static void main (String[] args) {
		int [] num = {1,2,3,4,5};
	
		
		try {
		
		System.out.println(num[5]);
	}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("ArrayIndexOutOfBoundsException  ,");
		
	}
	}
}
	
