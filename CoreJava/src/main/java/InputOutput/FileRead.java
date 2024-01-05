package InputOutput;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("C:/TestingIO/Nishil.txt");
		
		int a = reader.read();
		
		char c;
		
		while (a != -1) {
			
			c = (char) a;
			
			System.out.print(c);
			
			a = reader.read();
		}
		reader.close();
	}
}
