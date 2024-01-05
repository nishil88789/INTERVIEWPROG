package OOP.SuperKeyword;

public class D1 extends D {

	void d() {
		
	System.out.println("Testing Method Calling Through Super Keyword");	
	
	}
	
	void test() {
	
	       d();
	
	      super.d();
	}
	public static void main(String[] args) {
		
		D1 d1 = new D1();
		
		d1.test();
	}
}
