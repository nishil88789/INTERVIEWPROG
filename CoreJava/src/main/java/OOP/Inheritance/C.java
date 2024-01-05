package OOP.Inheritance;

public class C extends B {

	public void Cclass() {
		
		System.out.println("This is C class");
	}
	public static void main(String[] args) {
		
		C c = new C();
		
		c.Aclass();
		c.Bclass();
		c.Cclass();
	}
}
