package OOP.Constructor;

public class ImpicitConstructorCalling {

	public String name;
	public String Address;
	
	public ImpicitConstructorCalling() {
		System.out.println("Implicit Calling");
	}
	
	public ImpicitConstructorCalling(String a, String b) {
		
		
		name = a;
		Address = b;
		
		System.out.println("Explicit Calling");
	}
	
	public static void main(String[] args) {
		
		new ImpicitConstructorCalling();
	}
}
