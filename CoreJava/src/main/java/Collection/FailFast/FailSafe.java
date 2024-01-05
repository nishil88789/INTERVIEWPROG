package Collection.FailFast;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class FailSafe {

	public static void main(String[] args) {
		
		ArrayBlockingQueue l = new ArrayBlockingQueue(9);
		
		l.add(1);
		l.add(2);
		
		Iterator it = l.iterator();
		
		l.add(3);
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
	}
}
