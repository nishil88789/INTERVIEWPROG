
public class Diamond {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			
			for (int j = i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
			System.out.print("*"+" ");

			}
			System.out.println();
			
		}
	   
		 for (int i = 5-1; i >=1; i--) {
			 for (int j = i; j >= 1; j--) {
					System.out.print(" ");
				}
				for (int j = 5; j >= i; j--) {
				System.out.print("*"+" ");

				}
			System.out.println();
		}
		
	}
	
}
