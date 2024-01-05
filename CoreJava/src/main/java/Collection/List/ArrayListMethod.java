package Collection.List;

import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20);
		
		System.out.println(l);
		
		ArrayList l1 = new ArrayList();
		
		l1.add(10);
		l1.add(40);
		
		l1.addAll(l);
		
		System.out.println(l1);
		
		l1.clear();
		
		System.out.println(l1);
		
		System.out.println(l.size());
	}
}
