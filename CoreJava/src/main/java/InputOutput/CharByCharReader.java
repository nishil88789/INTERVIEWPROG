package InputOutput;

import java.io.FileReader;
import java.io.IOException;

public class CharByCharReader {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("C:/TestingIO/Nishil.txt");
		
		int ch = f.read();
		
		while (ch != -1) {
			
			char c = (char)ch;
			
			System.out.print(c);
			
			ch = f.read();
		}
		f.close();
	}
}
