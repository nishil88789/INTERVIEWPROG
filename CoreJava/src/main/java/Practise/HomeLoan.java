package Practise;

public class HomeLoan {

	public static void main(String[] args) {
		
		Bank[] bank= new Bank[3];
		
		bank[0] = new AxisBank();
		bank[1] = new ICICIBank();
		bank[2] = new HDFCBank();
		
		LoanEnquiry(bank);
	}

	private static void LoanEnquiry(Bank[] bank) {
	
		for(Bank b : bank) {
			
		
		
		String name = b.getName();
		
		double rate = b.intrestRate();
		
		System.out.println(name +" "+ rate);
	}
	}
	}
