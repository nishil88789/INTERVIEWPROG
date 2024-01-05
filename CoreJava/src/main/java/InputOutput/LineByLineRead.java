package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineByLineRead {

	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("C:/TestingIO/Nishil.txt");
     
		BufferedReader br = new BufferedReader(f);
		
		String s = br.readLine();
		
		while (s != null) {
			
			System.out.println(s);
			
			s = br.readLine();
	}
		f.close();
		br.close();
	}
}
