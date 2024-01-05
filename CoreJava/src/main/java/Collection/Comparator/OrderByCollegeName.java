package Collection.Comparator;

import java.util.Comparator;

public class OrderByCollegeName implements Comparator<College> {

	@Override
	public int compare(College c, College c1) {
		
		return c.name.compareTo(c1.name);
	}
}
