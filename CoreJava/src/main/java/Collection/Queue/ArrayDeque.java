package Collection.Queue;

public class ArrayDeque {

	public static void main(String[] args) {
		
		java.util.ArrayDeque q = new java.util.ArrayDeque();
		
		q.add("One");
		q.add("Two");
		q.add("Three");
		q.addFirst("Zero");
		q.addLast("Four");
		
		Object ele = q.element();
		
		System.out.println(q);
		
		q.remove();
		
		System.out.println(q);
		
		q.removeFirst();
		
		System.out.println(q);
		
		q.removeLast();
		
		System.out.println(q);
		
	}
}
