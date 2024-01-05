package MultiThreading;

public class PriorityThread  extends Thread {

	
	public PriorityThread(String name) {
	
		super(name);
	}
	
	public void run() {
	
	System.out.println(getName()+ " = "+ getPriority());
	}
	 
	public static void main(String[] args) {
	
		PriorityThread p1 = new PriorityThread("Nishil");
		PriorityThread p2 = new PriorityThread("Sharma");
		PriorityThread p3 = new PriorityThread("Ratlam");
		
		p1.setPriority(10);
		p3.setPriority(2);
		
		p1.start();
		p2.start();
		p3.start();
		
	}
	
	
}
