
package Collection.List;

import java.util.Enumeration;
import java.util.Vector;

public class BasicEnumeration {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Nishil");
		v.add("Sharma");
		v.add(25);
		
		System.out.println(v);
		System.out.println();
		
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}

	}
}
