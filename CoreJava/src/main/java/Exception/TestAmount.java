package Exception;

public class TestAmount {

	public static void main(String[] args) {
		
		double balance = 1000;
		
		try {
			
			if(balance<2000) {
				
				throw new Amount();
			
			} else {
			
				System.out.println("Sufficent Balance");
			}
			
		} catch (Amount a) {
		
			a.printStackTrace();
			
			System.out.println(a.getMessage());
		}
	}
}
