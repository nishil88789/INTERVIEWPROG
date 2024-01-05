package Collection.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNoFind {

	public static void main(String[] args) {
		
	List<Integer> l = Arrays.asList(1,4,8,40,22,33,99);
	
	l.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
	}
}
