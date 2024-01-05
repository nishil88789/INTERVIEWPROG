package Practise;

public class NumberReverse11 {

	public static void main(String[] args) {
		
		int a = 1245;
		
		int b = a;
		
		int rev = 0;
		
		while(a!=0) {
			
		rev = rev * 10+ a % 10;
		
		a = a/10;
		}
		System.out.println(rev);
	}
}
