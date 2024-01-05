package MultiThreading;

public class UsingThreadClass extends Thread {

	public void run() {
		
		System.out.println("Using Thread Class");
	}
	
	public static void main(String[] args) {
	
		UsingThreadClass u = new UsingThreadClass();
		
		u.start();
	}
}
