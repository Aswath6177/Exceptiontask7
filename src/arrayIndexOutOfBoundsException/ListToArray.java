package arrayIndexOutOfBoundsException;

import java.util.ArrayList;

public class ListToArray {
public static void main (String[]args) {
	ArrayList<String> names = new ArrayList<>();
	names.add("apple");
	names.add("manga");
	names.add("grapes");
	
	
	String[] names1 = new String[names.size()];
	names1=names.toArray(names1);
	 System.out.println("Array elements:");
     for (String element : names1) {
         System.out.println(element);
}
}
}
