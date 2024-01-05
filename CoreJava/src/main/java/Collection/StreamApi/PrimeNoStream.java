package Collection.StreamApi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class PrimeNoStream {

	static boolean isPrime(int x) {
		
		int count = 0;
		
		if(x ==1) {
			
			return false;
		}
		for (int i = 2; i < x - 1; i++) {
			
			if(x % i == 0) {
				
				count++;
			}
		}
		return count == 0;
	}
	public static void main(String[] args) {
		
	List<Integer> l =  Arrays.asList(5,4,3,8,7,9);
	
	l.stream().filter(e -> isPrime(e)).forEach(i -> System.out.println(i));
	}
}
