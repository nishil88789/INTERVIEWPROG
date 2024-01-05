package Java_Basic;


import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,34,5,3);
		
		list.forEach((number)-> System.out.println(number));
	}
}
