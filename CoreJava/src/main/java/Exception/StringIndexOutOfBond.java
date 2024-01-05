package Exception;

public class StringIndexOutOfBond {

	public static void main(String[] args) {
		
		String s = "Nishil";
		
		try {
			
			System.out.println(s.charAt(10));
		} 
		catch (StringIndexOutOfBoundsException e) {
		
			System.out.println(e.getMessage());
			
		}
	}
}
