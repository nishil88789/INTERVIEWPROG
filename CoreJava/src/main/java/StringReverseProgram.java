
public class StringReverseProgram {

	public static void main(String[] args) {
		
	StringBuffer sb = new StringBuffer("Nishil Sharma");
	
	String s = sb.toString();
	
	String a[]= s.split(" ");
	for (int i = 0; i < a.length; i++) {
		
	for(int j = a[i].length()-1;j>=0;j--) {
		
		System.out.print(a[i].charAt(j));
	}
		System.out.print(" ");	
	}
	}
}
