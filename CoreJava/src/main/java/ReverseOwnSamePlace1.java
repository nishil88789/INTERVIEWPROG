
public class ReverseOwnSamePlace1 {

	public static void main(String[] args) {
		
		String s = "Ram Singh";
		
		String a [] = s.split(" ");
	
	for (int i = 0; i < a.length; i++) {
	
	for(int j = a[i].length()-1;j>=0;j--) {
		
		System.out.print(a[i].charAt(j));
	}
	System.out.print(" ");
	}	
	}
}
