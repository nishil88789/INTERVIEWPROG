package OOP.Constructor;

import Practise.SameConstructorCall;

public class ConstructorCallingThis {

	private int age;
	private String name;

	public ConstructorCallingThis() {
		System.out.println("Consturctor Calling Thorugh This");
	}

	public ConstructorCallingThis(int age, String name) {
		this();
		this.age = age;
		this.name = name;

	}

	public static void main(String[] args) {
		SameConstructorCall s = new SameConstructorCall(24, "Shashank");

	}

}
