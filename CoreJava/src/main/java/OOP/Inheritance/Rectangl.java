package OOP.Inheritance;

public class Rectangl extends Shap{

	private int length;
	
	private int breadth;
	
	public Rectangl() {
		
	}
	public Rectangl(int i , int j) {
		
		this.length = i;
		
		this.breadth = j;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public double area() {
		
		double area  = length * breadth;
		
		System.out.println("Rectamgl Area ="+ area);
		
		return area;
	}
}
