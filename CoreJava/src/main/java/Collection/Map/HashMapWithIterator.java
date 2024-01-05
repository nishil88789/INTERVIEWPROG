package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapWithIterator {

	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		
		h.put(10, "Nishil");
		h.put(20, "Shekhar");
		
		System.out.println(h);
		
		Set s = h.entrySet();
		
		System.out.println(s);
		
		Iterator i = s.iterator();
		
		while (i.hasNext()) {
		
			Map.Entry e = (Map.Entry)i.next();
			
			System.out.println(e.getKey() + " "+ e.getValue());
		}
	}
}
