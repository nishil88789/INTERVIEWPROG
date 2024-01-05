package Exception;

public class UnCheckedShape {

	public static void main(String[] args) {
		shape();
	}
     private static void shape() {
	
    	 try {
			circle();
		} catch (Exception e) {
		
			System.out.println("Exception Handeled....");
		}
	}
	private static void circle() {
	    arc();
		
	}
	private static void arc() {
	
	RuntimeException r = new RuntimeException();
	  throw r;
	}
	
}
