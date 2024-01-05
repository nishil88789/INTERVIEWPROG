package OOP.ShallowCloning;

public class Account implements Cloneable {

	public int balance = 0;
	
	public String name = null;
	
	public Account() {
		
}
	public Account(int b) {
		balance = b;
	}

	public int getBalance() {
		return balance;
	}

	//public void setBalance(int balance) {
		//this.balance = balance;
	//}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Object  clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
