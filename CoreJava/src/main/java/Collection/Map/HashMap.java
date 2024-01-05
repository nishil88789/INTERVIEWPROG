package Collection.Map;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
		java.util.HashMap<Integer,String> h = new  java.util.HashMap();
		
		h.put(10, "Nishil");
		h.put(20, "Deep");
		
		System.out.println(h);
		
		for(Map.Entry m : h.entrySet()) {
			
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
	}
}
