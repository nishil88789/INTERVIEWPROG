package Practise;

public class Bank {

	public double intrestRate() {
		return 9.0;
	}
	public String getName() {
		return "RBI Bank";
	}
	public Bank getBank(int a) {
		
		if(a ==0) {
		
			return new AxisBank();
		}
		if(a ==1) {
			
			return new HDFCBank();
		}
		if(a ==2) {
			
		return new ICICIBank();	
		}
		return null;
	}
}
