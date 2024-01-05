package Collection.StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestLotteryStream {

	public static void main(String[] args) {
		
	List<LotteryStream> l = new ArrayList<LotteryStream>();
	
	l.add(new LotteryStream("Ram", "9898987657"));
	l.add(new LotteryStream("Shyam", "9876567898"));
	l.add(new LotteryStream("Raj", "9997799599"));
	l.add(new LotteryStream("Ravi", "9876786789"));
	
	l.stream().map(e ->e.getName()).collect(Collectors.collectingAndThen
			
			(Collectors.toList(), e-> { Collections.shuffle(e);
	
	return e.stream();
	
			})).limit(3).forEach(e -> System.out.println(e));
	}
	
	}

