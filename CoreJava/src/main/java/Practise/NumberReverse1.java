package Practise;

public class NumberReverse1 {

	public static void main(String[] args) {
		
		int a = 153587;
		
		int b = a;
		
		int rev = 0;
		
		while (a!=0) {
			
		rev = rev*10 + a%10;
		
		a = a/10;
		
		}
		System.out.println(rev);	
	}
}
