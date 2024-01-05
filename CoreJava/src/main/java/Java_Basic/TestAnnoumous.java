package Java_Basic;

public class TestAnnoumous {

	public static void main(String[] args) {
		
	AnnonymousFunction.Print();	
		
	AnnonymousFunction anny = new AnnonymousFunction() {
		
		public void run(int x , int y) {
			
			System.out.println(x - y);

		}
	};
		anny.run(10, 30);
		
		anny.display();
	
	}
}
