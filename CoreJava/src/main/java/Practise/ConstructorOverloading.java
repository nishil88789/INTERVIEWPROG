package Practise;

public class ConstructorOverloading {

	public void add(int a , int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b , int c) {
		
		System.out.println(a + b +c);
	}
	public void add(int a ,double b,String c) {
		
		System.out.println(a + b +c);
	}
	public static void main(String[] args) {
		
		ConstructorOverloading c = new ConstructorOverloading();
		
		c.add(10, 10.10 , "Nishil");
	
	}
}


 
