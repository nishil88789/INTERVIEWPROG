package Collection.Lamda;

public class TestLemda {

	public static void main(String[] args) {
		
		Lamda l = new LamdaImplementation();
		
		l.goodEvening();
		
		Lamda l1 = new Lamda() {
			
			@Override
			public void goodEvening() {
				
				System.out.println("Done");
			}
		};
		l1.goodEvening();
		
	  Lamda l2 = new Lamda() {
		
		@Override
		public void goodEvening() {
			
			System.out.println("Second Announymous Class");
		}
	};
	l2.goodEvening();
	
	Lamda l3 = () -> {
		
		System.out.println("This is Lamda Expression");
	};
	l.goodEvening();
	
	Lamda l4 = () -> System.out.println("Second implementation of Lamda");
	
	l4.goodEvening();
	
	}
}
