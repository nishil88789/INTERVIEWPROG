package OOP.Polymorphism;

public class Bank {

	public double interestRate() {
		return 9.0;
	}
	public String getName() {
		
		return "RBI BANK";
	}
	public Bank getBank(int i) {
		
		if(i == 0) {
			
	return new AxisBank();		
	}
		
		if(i == 1) {
			
	return new HDFCBank();		
	}
		if(i == 2) {
			
	return new ICICIBank();		
		}
		
		return null;
		
	}
}
