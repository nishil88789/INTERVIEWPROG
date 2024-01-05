package InputOutput;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader {

	public static void main(String[] args) throws IOException{
		
		FileReader reader = new FileReader("C:/TestingIO/Nishil.txt");
		
		Scanner sc = new Scanner(reader);
		
		while (sc.hasNext()) {
			
			String line = sc.nextLine();
			
			System.out.println(line);
	}
	  reader.close();
	}
}
