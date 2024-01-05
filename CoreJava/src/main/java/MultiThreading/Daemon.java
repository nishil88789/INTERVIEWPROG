package MultiThreading;

public class Daemon  extends Thread {

	public void run() {
		
		System.out.println("Run Method Started"+" "+Thread.currentThread().isDaemon());
		
		while (true) {
			
			try {
				Thread.sleep(200);
				System.out.println("Deamon Thread Wokeup");
			}
			catch (Exception e) {
			
			}
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		Daemon d = new Daemon();
		d.setDaemon(true);
		d.start();
		
		try {
			Thread.sleep(600);
			System.out.println("Inside Main Method");
		} 
		catch (Exception e) {
	      
		}
		System.out.println("Leaving main Thread"); 
		System.out.println("JVM will Exit");
	}
	
}
