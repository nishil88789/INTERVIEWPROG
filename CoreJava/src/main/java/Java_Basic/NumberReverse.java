
package Java_Basic;

public class NumberReverse {

	public static void main(String[] args) {
		
		int a = 153;
		
		int b = a;
		
		int rev = 0;
		
	while(a!=0) {
		
	rev =rev*10 + a % 10;
	
	a = a/10;
	}
	System.out.println(rev);
	}
}
