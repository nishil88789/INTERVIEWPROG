package Practise;

public class TestAnnounous {

	public static void main(String[] args) {
		
		AnnonymousFunction.print();
	AnnonymousFunction anny = new AnnonymousFunction() {
	
		public void  run(int a,int b) {
			
		System.out.println(a+b);
	}
	};
	anny.run(10,20);
	
	anny.display();
	}
	}
	
	


	
	
