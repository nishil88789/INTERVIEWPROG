package Practise;

public class Circle extends Shape {

	private int radius;
	
	public Circle() {
		
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		
		double area = 3.14 *radius *radius;
		
		System.out.println("Circle Area ="+area);
		
		return area;
	}
	
	
}
