package Practise;

public class TestUnch {

	public static void main(String[] args) {
		
		A();
	}

	private static void A() {
		try {
			
			B();
			
		} catch (Uncheck e ) {
			
			System.out.println(e.getMessage());
		}
		
	}
        private static void B() {
		
        	C();
        }
         private static void C() {
		
        	 Uncheck c = new Uncheck();
        	 
        	 throw c;
	}
}
