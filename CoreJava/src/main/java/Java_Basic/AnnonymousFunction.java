package Java_Basic;

import javax.swing.DefaultBoundedRangeModel;

@FunctionalInterface
public interface AnnonymousFunction {

	public void run(int a, int b);
	
	public  static void Print() {
	
		System.out.println("I am static");
	}	
	
	public default void display() {
		
	   System.out.println("I am Default");	
	}
	
}

