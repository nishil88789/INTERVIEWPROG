package Collection.FailFast;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Failfast {

	public static void main(String[] args) {
	
		ArrayBlockingQueue l = new ArrayBlockingQueue(9);
		
		l.add(1);
		l.add(2);
		
		Iterator it = l.iterator();
		
		l.add(3);
		
		while (it.hasNext()) {
			//Object object = (Object) it.next();
			System.out.println(it.next());
		}
	}
}
