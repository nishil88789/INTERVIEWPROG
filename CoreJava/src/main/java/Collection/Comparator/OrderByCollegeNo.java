package Collection.Comparator;

import java.util.Comparator;

public class OrderByCollegeNo implements Comparator<College>{

	@Override
	public int compare(College c, College c1) {

		if(c.no > c1.no) {
			
			return -1;
		}
		else if(c.no == c1.no) {
			
		return 0;
	}   else {
		 
		return 1;
	  }
	}
}
