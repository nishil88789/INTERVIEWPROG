package InputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class CharByCharWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:/TestingIO/user.txt");
		
		char[] c =  {'w','r','t'};
		
		fw.write(c);
		fw.close();
		
		System.out.println("Done");
	}
}
