package OOP.Inheritance;

public class Triangl extends Shap {

	private int base;
	
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public double area() {
		
		double area = base * height;
		
		System.out.println("Traingle area ="+ area);
		
		return area;
	}
}
