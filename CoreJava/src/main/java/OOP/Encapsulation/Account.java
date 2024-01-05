package OOP.Encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdrawl(int d) {
		balance = balance - d;
	}
	public void fundtransfer(int f) {
		balance = balance - f;		
	}
	public void deposit(double b) {
		balance = balance + b;
	}
	public void paybill(double n) {
		balance = balance - n;
	}
	
}
