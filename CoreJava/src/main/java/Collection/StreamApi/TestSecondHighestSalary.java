package Collection.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSecondHighestSalary {

	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<>();
		
		l.add(new Employee("Deep", 30000));
		l.add(new Employee("Raj", 50000));
		l.add(new Employee("Parag",40000));
		
		double d = l.stream().map(e -> e.salary).distinct().sorted
				(Comparator.reverseOrder()).skip(1).findFirst().orElse(0.0);
		
		System.out.println(d);
		
	}
}
