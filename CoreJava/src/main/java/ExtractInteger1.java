 
public class ExtractInteger1 {

	public static void main(String[] args) {
		String[] s= {"Nite2sh", "Vishwakar5ma"};
		//System.out.println(s.length);
		int count = 0;
		for(int i=0; i<s.length; i++) {
			//System.out.println(s[i].replaceAll("[^0-9]", ""));
			for(int j=0; j < s[i].length(); j++) {
				if(Character.isDigit(s[i].charAt(j))) {
		count +=Integer.parseInt(String.valueOf(s[i].charAt(j)));
				}
			}
		} 
		System.out.println(count);
		}
}
