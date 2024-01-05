package Exception;

public class HierarchyException {

	public static void main(String[] args) {
		
		String name = "Java";
		
		try {
			System.out.println(name.charAt(4));
			
		} catch (StringIndexOutOfBoundsException e) {
		
			System.out.println("StringIndexOutOfBondException....");
		}catch (RuntimeException e) {
			
			System.out.println("RuntimeException...");
	
		}catch (Exception e) {
		System.out.println("Exception....");	
		}
	}
}
