package Collection.Set;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		
		java.util.HashSet s = new java.util.HashSet();
		
		s.add(100);
		s.add(200);
	
		System.out.println(s);
		System.out.println();
		
		Iterator e = s.iterator();
		
		while (e.hasNext()) {
			
			System.out.println(e.next());
		}	
	}
}
