package Practise;

public class TestAnnoun {

	public static void main(String[] args) {
		
		AnnonymousFunction anny = new AnnonymousFunction() {
			
			@Override
			public void run(int a, int b) {
			
			System.out.println(a - b);	
			}
		};
		anny.run(50, 20);
	}
}
