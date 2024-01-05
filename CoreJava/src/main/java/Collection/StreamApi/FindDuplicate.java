package Collection.StreamApi;

import java.util.ArrayList;
import java.util.Collections;

public class FindDuplicate {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		
		l.add("a");
		l.add("b");
		l.add("b");
		l.add("c");
		
		l.stream().filter(e -> Collections.frequency(l, e) > 1).distinct().
		forEach(e -> System.out.println(e));
	}
}
