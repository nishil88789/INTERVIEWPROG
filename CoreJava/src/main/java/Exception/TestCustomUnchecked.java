package Exception;

public class TestCustomUnchecked {

	public static void main(String[] args) {
		
		dad();
	}

	private static void dad() {
		
		try {
			
			mom();
		}
		
		catch (CustomUncheckedException e) {
		
			System.out.println(e.getMessage());
		}
	}
         private static void mom() {
		     son();
	}

		private static void son() {
	
			CustomUncheckedException c = new CustomUncheckedException();
			
			     throw c;
		}
	
}
