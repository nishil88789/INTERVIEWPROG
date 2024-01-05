package Collection.StreamApi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		
		String[] a = { "ram", "seeta", "geeta", "shyam" };
	
		Stream s = Arrays. stream(a);
		
		System.out.println(" ");
		
		s.sorted().forEach(System.out::println);
	}
}
