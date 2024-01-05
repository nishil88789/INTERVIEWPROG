package Collection.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class TestSalaryGreaterThan20000 {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee("Ram", 50000));
		l.add(new Employee("Raj", 25000));
		l.add(new Employee("Raju",35000));
		
		l.stream().map(e ->e.salary).filter(e -> e > 20000).forEach(e -> System.out.println(e));
	}
}
