package Collection.List;

import java.util.Stack;

public class StackMethod {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("Nishil");
		s.push("Sharma");
		s.push(25);
		
		System.out.println(s);
		System.out.println(s.peek());
		
		System.out.println(s.search("Nishil"));
		System.out.println(s.empty());
	}
}
