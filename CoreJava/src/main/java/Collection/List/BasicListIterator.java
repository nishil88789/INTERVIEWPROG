package Collection.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class BasicListIterator {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(50);
		l.add(10);
		
		System.out.println(l);
		
		System.out.println();
		
		ListIterator i = l.listIterator();
		
		while (i.hasNext()) {
			
			System.out.println(i.next());
	}
		System.out.println();
		
		while(i.hasPrevious()) {
			
			System.out.println(i.previous());
		} 
	}
}
