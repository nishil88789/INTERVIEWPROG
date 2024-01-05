package MultiThreading;

public class UsingRunnable implements Runnable {

	public void run() {
		
		for (int i = 0; i <= 5; i++) {
			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		UsingRunnable u = new UsingRunnable();
		 
		Thread t = new Thread(u);
		
		t.start();
	}
}
