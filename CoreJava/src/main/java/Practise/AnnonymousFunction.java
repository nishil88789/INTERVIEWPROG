package Practise;

@FunctionalInterface
public interface AnnonymousFunction {

	public void run(int a,int b);

	public static void print() {
		
	System.out.println("I am Static");	
	}
	
	public default void display() {
		
	System.out.println("I am Default");	
	}
	 
	 
 }

