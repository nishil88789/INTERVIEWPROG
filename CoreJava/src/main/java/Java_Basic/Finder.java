package Java_Basic;

public class Finder {

	public static void main(String ar[]) {
		
		int x[] = {20,30,40,80};
		
	    int y = 80;
	   
	   Finder f = new Finder();
	   
	  boolean b= f.search(x,y);
	  
		/*
		 * if (b) 
		 * { System.out.println("Value Founded");
		 * 
		 * }
		 */
	}
	
	public boolean search(int a[], int b) {
		
	for (int i = 0; i < 4; i++) {
		
		if(a[i]==b) {
			
	System.out.println(a[i]+" at index="+i);	
	return true;
		}	
	}
	return false;
}
}