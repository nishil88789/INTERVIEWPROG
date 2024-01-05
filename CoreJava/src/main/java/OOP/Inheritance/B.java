package OOP.Inheritance;

public class B extends A {

	public void Bclass() {
		
		System.out.println("This is B class");
	}
	 public static void main(String[] args) {
		
		 B b = new B();
		 
		 b.Aclass();
		 b.Bclass();
	}
}
