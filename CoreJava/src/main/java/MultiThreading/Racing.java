package MultiThreading;

public class Racing {

	private int balance = 0;

	public int getBalance() {
		Delay();
		return balance;
	}
	public void setBalance(int balance) {
		Delay();
		this.balance = balance;
	}
	public synchronized void Deposit(String s, int a) {
		
		int b = getBalance() + a;
		setBalance(b);
		System.out.println(s + " New Balance "+ b);
	}
	public void Delay() {
		
		try {
			  Thread.sleep(200);
		} 
		catch (Exception e) {
		}
	}
  }	
