package Practise;

public class Fibonacci12 {

	public static void main(String[] args) {
		
		int a = 0;
		
		int b = 1;
		
		int c;
		
		for (int i = 0; i < 10; i++) {
			
			c = a + b;
			
			a = b;
			
			b = c;
			
	System.out.print(a+" ");	
		}
	}
}
