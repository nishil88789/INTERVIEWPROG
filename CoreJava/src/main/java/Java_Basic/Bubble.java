package Java_Basic;

public class Bubble {

	public static void main(String[] args) {
		
		int[] t = {30,20,10,70,60,40};
		
		int temp = 0;
		
		for (int i = 0; i < t.length; i++) {
		
		for(int j= i + 1; j<t.length; j++) {
			
			if(t[i] > t[j]) {
				
			temp = t[j];
			
			t[j] = t[i];
			
			t[i] = temp;
			}
		}
		System.out.print(t[i]+",");
		}
	} 
}
