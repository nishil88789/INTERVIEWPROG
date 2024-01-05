package Exception;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		
     String s = "Nishil";
      //String a = null;
     try {
 		
			System.out.println(s.charAt(7));
			System.out.println(s.length());
		

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} catch (NullPointerException e1) {
			System.out.println(e1.getMessage());
		}

		catch (Exception e2) {
			System.out.println(e2.getMessage());
		} finally {
			System.out.println("I am finally");
		}
		

	}


	
}
