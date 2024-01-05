package Exception;

public class TestUnChecked {

	public static void main(String[] args) {
		
		dad();
	}
     private static void dad() {
	
    	 try {
			   
    		 mom();
    		 
		} catch (UnChecked e) {
			
			System.out.println(e.getMessage());
  }
	}
	private static void mom() {
	
	     son();
	   }
	private static void son() {
		
		UnChecked c = new UnChecked();
		
		throw c;
	}
}
