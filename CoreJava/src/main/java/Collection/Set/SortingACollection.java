package Collection.Set;

import java.util.ArrayList;
import java.util.Collections;

public class SortingACollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(23);
		l.add(24);
		l.add(25);
		
		System.out.println(l);
		
		Collections.sort(l);
		
	}
}
