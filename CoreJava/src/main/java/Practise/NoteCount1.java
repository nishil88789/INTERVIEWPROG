package Practise;

public class NoteCount1 {

	public static void main(String[] args) {
		
		int [] notes = {2000,500,200,100,50};
		
		int a = 5650;
		
		int b;
		
	for (int i = 0; i < notes.length; i++) {
		
		b = a/notes[i];
		
		if(b>0) {
			
		a = a % notes[i];
		
	System.out.println(notes[i]+"="+b);	
		}
	}	
		
	}
}
