package OOP.Constructor;

public class SameConstructorCall {

	private  int age;
	
	private String name;
	
	private String address;
	
	public SameConstructorCall() {
	
	}
	//public SameConstructorCall(int age, String name) {
	
		//this.age = age;
		
		//this.name = name;
	//}
	public SameConstructorCall(int age, String name, String address) {
		
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public static void main(String[] args) {
		
		SameConstructorCall s = new SameConstructorCall(10,"Rishi","Indore");
		
		System.out.println(s.getName());
		
		System.out.println(s.getAddress());
		
		System.out.println(s.getAge());
		
	}
	
}
