package Practise;

public class MethodOverloading {

	private int age;
	private String name;
	private String address;

	public MethodOverloading() {
		
		System.out.println("DEfault Cont");
	}

	public MethodOverloading(int age, String name) {

		this.age = age;
		this.name = name;

		System.out.println("2 Parameter Const");
	}

	public MethodOverloading(int age, String name, String address) {

		this.age = age;
		this.name = name;
		this.address = address;

		System.out.println("3 Parameter Const");
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mv = new MethodOverloading(12,"SS");
		
	}

}
