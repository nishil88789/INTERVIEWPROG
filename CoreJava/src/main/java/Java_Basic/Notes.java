package Java_Basic;

public class Notes {

	public static void main(String[] args) {
		
		int [] notes = {2000,500,200,100};
		
		int t = 8000;
		
		int r;
		
		for (int i = 0; i < notes.length; i++) {
			
		r = t/notes[i];
		
		if(r>0) {
			
		System.out.println(notes[i]+"="+r);	
		
		t = t % notes[i];
	  }
	 }
	}
  }
