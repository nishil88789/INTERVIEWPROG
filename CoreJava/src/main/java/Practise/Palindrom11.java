package Practise;

public class Palindrom11 {

	public static void main(String[] args) {
		
		int a =131;
		
		int b = a;
		
		int c;
		
		int sum =0;
		
		while (b>0) {
			
		c = b%10;
		
	sum = sum*10+c;
	
	b = b/10;
	}
		if(sum == a) {
		
	System.out.println("palinderom");		
		}
		else {
	System.out.println("Not Palindrom");		
		}
		
	}
}
