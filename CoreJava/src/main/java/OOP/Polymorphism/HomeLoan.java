package OOP.Polymorphism;

public class HomeLoan {

	public static void main(String[] args) {
		
		Bank[] banks = new Bank[3];
		
		banks[0] = new AxisBank();
		banks[1] = new ICICIBank();
		banks[2] = new HDFCBank();
		
		loanEnquiry(banks);
	}
	public static void loanEnquiry(Bank[] banks) {
		
		for(Bank b : banks) {
			
		String name = b.getName();
		double rate = b.interestRate();
		
		System.out.println(name +" " + rate);
		}
	}
}
