package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<>();
	 
	   employee.add(new Employee("Nishil", 2));
	   employee.add(new Employee("Prestige", 1));
	   employee.add(new Employee("Sharma", 1));
	   
	   System.out.println(employee);
	   
	   Collections.sort(employee);
	   
	   System.out.println(employee);
	}
}
