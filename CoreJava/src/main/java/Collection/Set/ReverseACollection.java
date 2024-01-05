
package Collection.Set;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseACollection {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		
		Collections.reverse(l);
		
		System.out.println(l);
	}
}
