package arrayIndexOutOfBoundsException;
import java.util.ArrayList;

public class RemoveArrayListElements {
public static void main (String[]args) {
	ArrayList<String> names = new ArrayList<>();
	names.add("Aswath");
	names.add("Ram");
	names.add("justin");
	
	System.out.println("Original array is "+ names);
	names.clear();
	System.out.println("after removing "+ names);
}
}
