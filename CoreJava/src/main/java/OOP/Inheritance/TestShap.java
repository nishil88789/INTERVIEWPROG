package OOP.Inheritance;

public class TestShap {

	public static void main(String[] args) {
		
		double area = 0.0;
		
		Shap[] s = new Shap[3];
		
		s[0] = new Circl();
		
		s[1] = new Rectangl();
		
		s[2] = new Triangl();
	
		Circl c = (Circl) s[0];
		c.setRadius(5);
	
		Rectangl r = (Rectangl) s[1];
		r.setLength(5);
		r.setBreadth(6);
		
		Triangl m = (Triangl) s[2];
		m.setBase(6);
		m.setHeight(6);
		
		for (int i = 0; i < s.length; i++) {
			
			area = area + s[i].area();
	}
		System.out.println("Total area ="+ area);
	
	}
	
}
