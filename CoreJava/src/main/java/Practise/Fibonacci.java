package Practise;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a = 0;
		
		int b = 2;
		
		int c;
		
	for (int i = 0; i <10; i++) {
		
		c = a+b;
		
	   a = b;
	   
	   b = c;
	 
	  System.out.print(a+" "); 
	}	
	}
}
