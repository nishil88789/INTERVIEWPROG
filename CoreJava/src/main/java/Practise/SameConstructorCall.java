package Practise;

public class SameConstructorCall {

	private int age;
	private String name;

	public SameConstructorCall() {
		System.out.println("Consturctor Calling Thorugh This");
	}

	public SameConstructorCall(int age, String name) {
		this();
		this.age = age;
		this.name = name;

	}

	public static void main(String[] args) {
		SameConstructorCall s = new SameConstructorCall(24, "Shashank");

	}

}
