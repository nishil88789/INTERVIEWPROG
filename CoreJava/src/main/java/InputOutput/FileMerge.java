package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {

	public static void main(String[] args) throws IOException {

		PrintWriter pr = new PrintWriter("C:/TestingIO/f.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("C:/TestingIO/w.txt"));
		
		String line = br.readLine();
		
		while (line != null) {
			
			pr.println(line);
			
			line = br.readLine();
		}
		br = new  BufferedReader(new FileReader("C:/TestingIO/y.txt"));
		
		line = br.readLine();
		
		while (line != null) {
			
			pr.println(line);
			
			line = br.readLine();
	}
		pr.flush();
		
		br.close();
		pr.close();
		
		System.out.println("Check your Folder");
	}
}

