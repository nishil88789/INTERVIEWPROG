
public class ExtractIntFromString {

	public static void main(String[] args) {
		
		String[] s = {"Nishil2","Sharma5"};
		
		int count = 0;
		
		for (int i = 0; i < s.length; i++) {
		
		for(int j= 0;j<s[i].length();j++) {
			
		if (Character.isDigit(s[i].charAt(j))) {
			
	count += Integer.parseInt(String.valueOf(s[i].charAt(j))); 		
		}	
	}
 
		}
		System.out.println(count); 
	}
			
		}
		
	

