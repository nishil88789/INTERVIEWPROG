package OOP.ShallowCloning;

public class TestAccountClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account a1 = new Account(100);
		
		Account a2 = (Account)a1.clone();
		
		a2.balance = 200;
		
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
	}
}
