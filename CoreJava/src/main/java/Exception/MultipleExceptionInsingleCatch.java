package Exception;

public class MultipleExceptionInsingleCatch {

	public static void main(String[] args) {
		
		String  name = "java";
		
		try {
			System.out.println(name.charAt(5));
		} catch (StringIndexOutOfBoundsException | NullPointerException e ) {
			
			System.out.println(e.getMessage());
		}
	}
}
