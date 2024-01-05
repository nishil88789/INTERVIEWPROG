 package OOP.Polymorphism;

public class MethodOverriding2 extends MethodOverriding1 {

	public void Car() {
		
		System.out.println("Vehicle");
		
		super.Car();
	}
	public String Show() {
		
		System.out.println("String Class");
		
		return null;
	}
	public static void main(String[] args) {
		
		MethodOverriding1 md1 = new MethodOverriding1();
		 
		MethodOverriding2 md2 = new MethodOverriding2();
		
		md1.Car();
		md1.Show();
		
		md2.Car();
		md2.Show();
	}
}
