
public class ReveraseWordSeq {

public static void main(String[] args) {
		
		String s = "Nitesh Vishwakarma sharma";
		
		String [] arrOfStr = s.split(" ");
		
		for (int i = arrOfStr.length-1; i>= 0; i--) {
			
			String rev = arrOfStr[i] + " ";
			
			System.out.print(rev);
		}
	}
}
