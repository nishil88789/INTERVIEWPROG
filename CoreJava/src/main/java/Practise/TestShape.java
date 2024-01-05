package Practise;

public class TestShape {

	public static void main(String[] args) {
		
		double area = 0.0;
		
		Shape[] s = new Shape[1];
		
		s[0] = new Circle();
		
		Circle c = (Circle)s[0];
		
		c.setRadius(5);
		
		for (int i = 0; i < s.length; i++) {
			
			area = area +s[i].area();
		}
		System.out.println("Total area ="+area);
	}
}
