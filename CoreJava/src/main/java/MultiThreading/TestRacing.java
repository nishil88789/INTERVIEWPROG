package MultiThreading;

public class TestRacing extends Thread {

	public TestRacing(String name) {
		super(name);
	}
	public static Racing r = new Racing();
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			r.Deposit(getName(), 1000);
		}
	}
	public static void main(String[] args) {
		
		TestRacing t1 = new TestRacing("A");
		TestRacing t2 = new TestRacing("B");
		
		t1.start();
		t2.start();
	}
}
