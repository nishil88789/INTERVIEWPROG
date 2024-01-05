package Java_Basic;

public class RandomNumber {

	public static void main(String[] args) {
		
		int num = 5;
		
		for(int i =0; i<5; i++) {
			
		num = (int)(Math.random()*10);
		
		if (num<10) {
			
		num = num+10;	
		}
		System.out.print(" "+num);
		
		}
	}
}
