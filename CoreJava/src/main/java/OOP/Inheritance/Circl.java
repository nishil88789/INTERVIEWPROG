package OOP.Inheritance;

public class Circl extends Shap {

	private int radius;
	//private static final double PI = 3.14;
	
	//public static double getPi() {
		//return PI;
	//}
	public Circl() {
		
	}
	public Circl(int i) {
		
		this.radius = i;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		
		double area = 3.14 * radius * radius;
		
		System.out.println("Circle Area ="+ area);
		
		return area;
		
	}
	
}
