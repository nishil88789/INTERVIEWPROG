package Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollege {

	public static void main(String[] args) {
		
		List<College> college = new ArrayList<>();
		
		college.add(new College("Nishil", 1000));
		college.add(new College("Sharma", 200));
		college.add(new College("Ratlam", 90));
		
		System.out.println(college + "\n");
		
		OrderByCollegeName o = new OrderByCollegeName();
		
		Collections.sort(college,o);
		
		System.out.println(college +"\n" );
		
		OrderByCollegeNo o1 = new OrderByCollegeNo();
		
		Collections.sort(college, o1);
		
		System.out.println(college + "\n");
		
		
	}
}
