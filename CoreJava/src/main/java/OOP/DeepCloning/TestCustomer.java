package OOP.DeepCloning;

public class TestCustomer {

	public static void main(String[] args) throws CloneNotSupportedException {
		
        Customer c1 = new Customer("Rishi",100);
		
		Customer c2 = (Customer)c1.clone();
		
		c2.name = "Nishil";
		
		c2.accountBalance.balance = 5000;
		
		System.out.println("c1 name :"+ c1.getName());
		
		System.out.println("c1 bal :"+ c2.accountBalance.getBalance());
		
		System.out.println("c2 name :"+ c2.getName());
		
		System.out.println("c2 bal :"+ c2.accountBalance.getBalance());
	}
}
