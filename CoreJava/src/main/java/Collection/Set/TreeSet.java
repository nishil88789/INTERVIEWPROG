package Collection.Set;

import java.util.Iterator;

public class TreeSet {

	public static void main(String[] args) {
		
		java.util.TreeSet t = new java.util.TreeSet();
		
		t.add("Zero");
		t.add("One");
		t.add("Two");
		t.add("Three");
		
		Iterator e = t.iterator();
		
		while (e.hasNext()) {
	
			String s = (String)e.next();
			
			System.out.println(s);
		}
	}
}
