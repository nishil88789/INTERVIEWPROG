package Practise;

public class NotesCount12 {

	public static void main(String[] args) {
		
		int [] notes = {2000,500,200,100,50,10};
		
		int a = 23450;
		
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
