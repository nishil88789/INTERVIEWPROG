package OOP.Abstraction;

public class Vehicle extends Car{

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		
		v.Start();
	}
	void Start() {
		
		System.out.println("This is Car");
	}
}
