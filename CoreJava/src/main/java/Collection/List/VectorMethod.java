package Collection.List;

import java.util.Vector;

public class VectorMethod {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement("Nishil");
		v.addElement("Sharma");
		v.addElement(100);
		
		v.setElementAt("Nishil", 1);
		
		System.out.println(v);
		
		System.out.println(v.capacity());
	}
}
