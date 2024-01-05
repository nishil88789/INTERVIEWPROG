
public class ReverseWordSequenceSb {

public static void main(String[] args) {

	String s = "Nishil Sharma";
	
	StringBuilder sb = new StringBuilder();
	
	String[] a =s.split(" ");
	
	for (int i= a.length-1 ; i>=0 ; i--) {
		
	sb.append(a[i]).append(" ");
}
	String rev = sb.toString();
	
	System.out.println(rev);
	}
}
