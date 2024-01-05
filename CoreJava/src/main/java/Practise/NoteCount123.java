package Practise;

public class NoteCount123 {

	public static void main(String[] args) {
		
		int []  notes = {2000,500,200,100,50,10};
		
		int t = 4550;
		
		int r;
		
		for (int i = 0; i < notes.length; i++) {
			
			r = t/notes[i];
			
			if(r>0) {
				
			t = t % notes[i];
			
		System.out.println(notes[i]+"="+r);		
			}
		}
		
	}
}
