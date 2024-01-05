package Collection.StreamApi;

import java.util.stream.Collectors;
import java.util.*;

public class TestDepartment {

	public static void main(String[] args) {
		
		List<Department> d = new ArrayList<Department>();
		
		d.add(new Department("Ram", 2));
		d.add(new Department("Shyam", 1));
		d.add(new Department("Jay", 1));
		d.add(new Department("Vijay", 3));
		
		List<Department> l = d.stream().sorted(Comparator.comparingInt(Department::getId))
				.collect(Collectors.toCollection(ArrayList::new));

		l.forEach(D -> System.out.println((D.getName() + " - Salary: " + D.getId())));		
	
	}
}
