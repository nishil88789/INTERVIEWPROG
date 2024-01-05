 package Exception;

public class UncheckedPropogation {

	public static void main(String[] args) {
		
		dad();
	}

	private static void dad() {
		
		try {
			mom();
			
		} catch (RuntimeException e) {
		
			System.out.println(e.getMessage());
		}
	}

	private static void mom() {
		
		son();
	}
    private static void son() {
	
	RuntimeException e = new RuntimeException("I Made a Mistake.....");
	
	throw e;
	}
}
