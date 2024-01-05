package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailRead {

	public static void main(String[] args) throws IOException {
		
		FileReader f =  new FileReader("C:/TestingIO/Email.txt");
		
		BufferedReader r = new  BufferedReader(f);
		
		String s = r.readLine();
		
		while (s != null) {
			
			if(s.endsWith("@gmail.com")) {
				
				System.out.println(s);
			}
			s = r.readLine();
		}
		f.close();
		r.close();
	}
}
