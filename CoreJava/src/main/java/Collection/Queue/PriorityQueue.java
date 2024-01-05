package Collection.Queue;

import java.util.Iterator;

public class PriorityQueue {

	public static void main(String[] args) {
		
		java.util.PriorityQueue q = new java.util.PriorityQueue();
		
		q.add("one");
		q.add("Two");
		q.add("Three");
		
		System.out.println(q);
		
		Object obj = q.element();
		
		obj = q.remove();
		
		System.out.println(obj);
		
		System.out.println(q);
		
		Iterator it = q.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
	}
}
