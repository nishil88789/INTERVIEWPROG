package Exception;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			
			int i = 10/0;
			
			System.out.println(i);
		}
		catch (ArithmeticException e) {
		
			System.out.println(e.getMessage());
	  }
		finally {
			System.out.println("This is finally Block....");
		}
	}
}
