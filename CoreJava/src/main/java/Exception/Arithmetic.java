package Exception;

public class Arithmetic {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;

		try {
			int c = b / a;

			System.out.println(c);
		} 
		catch (ArithmeticException e) {
		
			System.out.println(e.getMessage());
		}
		
		finally {
		
			System.out.println("Arithmatic Exception..");
		}

	}
}
		
		
		


