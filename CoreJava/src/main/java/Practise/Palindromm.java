package Practise;

public class Palindromm {

	public static void main(String[] args) {
		
		int a = 221;
		
		int b = a;
		
		int c ;
		
	int sum = 0;
	
	while(b>0) {
		
		c = b%10;
		
	sum = sum*10+c;
	
	b = b/10;
	}
	if(sum ==a) {
		
	System.out.println("Palindrom");
} 
	else {
	System.out.println("Not Palindrom");	
	}
	}
}
