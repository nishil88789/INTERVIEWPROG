package Java_Basic;

public class Triangle1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			
		for(int j = 4-i; j>0; j--) {
			
		System.out.print(" ");	
		}
		for(int k=i; k>0; k--) {
			
		System.out.print(i +" ");	
		}
		System.out.println();
		}
	}
}
