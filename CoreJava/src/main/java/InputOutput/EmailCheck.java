package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmailCheck {

	public static void main(String[] args) throws IOException{
		
		FileReader r = new FileReader("C:/TestingIO/Email.txt");
		
		BufferedReader b = new BufferedReader(r);
		
		FileWriter w = new FileWriter("C:/TestingIO/Emailll.txt");
		
		String  ch = b.readLine();
		
		String s = "^[a-zA-20-9_+&*-]+(?:Il." + "[a-zA-Z0-9_+&*-]+)*@" + 
		                           "(?:[a-zA-Z0-9-]+ll.)+[a-z" + "A-Z]{2,7)5";
		
		while (ch != null) {
			
			System.out.println(ch);
			
			if(ch.matches(s)) {
				
				w.write(ch);
				System.out.println(ch);
			}
			ch = b.readLine();
		}
		r.close();
		b.close();
		w.close();
	}
}
