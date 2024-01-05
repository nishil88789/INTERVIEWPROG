package Practise;

public class CircleInt implements ShapeInt{

	private int radius;
	
	
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
	
		double area = PI * radius * radius;
		
		return area;
	}
	public static void main(String[] args) {
		
		CircleInt c = new CircleInt();
		
		c.setRadius(5);
		
		System.out.println(c.area());
	}

}
