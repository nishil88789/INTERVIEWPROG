package OOP.Encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setNumber("1212121");
		a.setAccountType("SBI");
		a.setBalance(50000);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		
		a.deposit(600);
		System.out.println("After deposit ="+ a.getBalance());
		
		a.withdrawl(1000);
		System.out.println("After Withdrawl ="+a.getBalance());
		
		a.paybill(500);
		System.out.println("After Bill ="+a.getBalance());
		
		a.fundtransfer(500);
		System.out.println("After Fund Transfer ="+a.getBalance());
		
		System.out.println("Present Balance ="+a.getBalance());
		
	}
}
