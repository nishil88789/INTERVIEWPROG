package Collection.Lamda;

public class TestAdd {

	public static void main(String[] args) {
		
		Add a1 = (int a, int b) -> {
			return a + b;
		};
		System.out.println(a1.sum(2, 3));
		
		Add a2 = (a ,b) -> a + b;
		
		System.out.println(a2.sum(5, 4));
	}
}
