package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LineByLineWrite {

	public static void main(String[] args) throws IOException {
		
		FileWriter f = new FileWriter("C:/TestingIO/user.txt");
		
		BufferedWriter w = new BufferedWriter(f);
		
		w.write("I am Nishil Sharma");
		
		w.write("I am Engineer");
		
		w.close();
		
		f.close();
		
		System.out.println("Line");
		
	}
}
