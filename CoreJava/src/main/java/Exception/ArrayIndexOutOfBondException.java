package Exception;

public class ArrayIndexOutOfBondException {

	public static void main(String[] args) {
		
		int [] a = {1,2,3};
		
		try {
			
			System.out.println(a[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException......");
		}
	}
}
