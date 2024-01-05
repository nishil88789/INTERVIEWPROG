package Practise;

public class CheckedEcxepti {

	public static void main(String[] args) {
		   dad();
	}

	private static void dad() {
		try {
			mom();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	private static void mom() throws Exception {
		son();
		
	}

	private static void son() throws Exception {
		
		System.out.println("Unchecked Exception...");
		
		throw new Exception();
	}
	
}
