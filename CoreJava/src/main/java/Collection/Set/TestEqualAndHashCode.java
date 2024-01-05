package Collection.Set;

public class TestEqualAndHashCode {

	public static void main(String[] args) {
		
		EqualAndHashCode eq1 = new EqualAndHashCode("Nishil", "10", 100);
		
		EqualAndHashCode eq2 = new EqualAndHashCode("Nishil", "10", 100);
		
		System.out.println(eq1.equals(eq2));
		
		System.out.println(eq1.hashcode());
		
		System.out.println(eq2.hashcode());
	}
}
 