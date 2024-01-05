package Collection.List;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class BasicIterator {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("Nishil");
		l.add("Sharma");
		
		System.out.println(l);
		
		Iterator i = l.iterator();
		
		while (i.hasNext()) {
			
			System.out.println(i.next());
		}
		
	}
}
