package arrayIndexOutOfBoundsException;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap of employee IDs and names
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(101, "Alice");
        employees.put(102, "Charlie");
        employees.put(103, "Bob");

        // Print the names of all employees in alphabetical order
        System.out.println("Employees in alphabetical order:");
        for (String name : employees.values()) {
            System.out.println(name);
        }
    }
}

