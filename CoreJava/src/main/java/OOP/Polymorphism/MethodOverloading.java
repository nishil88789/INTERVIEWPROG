package OOP.Polymorphism;

public class MethodOverloading {

	public void Car(String a) {
		
		System.out.println("This is Car");
	}
	public void Bike(int a) {
		
		System.out.println("This is Bike");
	}
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		
		m.Car("BMW");
		m.Bike(1);
	}
}
