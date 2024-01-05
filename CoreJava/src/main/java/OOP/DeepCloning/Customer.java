package OOP.DeepCloning;

import OOP.ShallowCloning.Account;

public class Customer implements Cloneable {

	public String name = null;
	
	public Account accountBalance = null;
	
	 Customer() {
		
	}
	 Customer(String name, int amt){
		 
		 this.name = name;
		 
		 this.accountBalance = new Account(amt);
		 
	 }
	 public String getName() {
		 
		 return name;
	}
	 public Object clone() throws CloneNotSupportedException {
		 
		 Customer c = (Customer)super.clone();
		 
		 c.accountBalance = (Account)accountBalance.clone();
		 
		 return c;
		 
	 }
	
}
