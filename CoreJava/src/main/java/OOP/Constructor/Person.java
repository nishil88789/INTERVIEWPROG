package OOP.Constructor;

public class Person {

	public String name;
	public String address;

	public Person(String a, String b) {

		this.name = a;
		this.address = b;
	}

	public static void main(String[] args) {

		Person p = new Person("Nishil", "Sharma");

		System.out.println(p.name+" " + p.address);

	}
}
