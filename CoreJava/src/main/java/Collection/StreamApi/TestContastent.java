package Collection.StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestContastent {

	public static void main(String[] args) {
		
		ArrayList<Contentant> l = new ArrayList<>();
		
		l.add(new Contentant("A", "123456776"));
		l.add(new Contentant("B", "933456678"));
		l.add(new Contentant("C", "982746666"));
		
		System.out.println("Winner !!");
		
		l.stream().map(e ->e.phoneno).filter(e ->e.length() == 10).distinct().collect
		(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			
			return e.stream();
			
		})).limit(3).forEach(e -> System.out.println(e));
		
	}
}
