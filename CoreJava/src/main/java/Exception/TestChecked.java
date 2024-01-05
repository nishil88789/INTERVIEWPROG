package Exception;

public class TestChecked {

	public static void main(String[] args) {
		    dad();
	}
     private static void dad() {
		try {
			   mom();
			   
		} catch (Checked e) {
			
			System.out.println(e.getMessage());
		}	
	}
	private static void mom() throws Checked{
		son();
	}
	private static void son () throws Checked {
		
		Checked c = new Checked();
		  
		throw c;
	}
}
