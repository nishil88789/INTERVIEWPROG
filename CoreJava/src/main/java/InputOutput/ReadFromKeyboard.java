package InputOutput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p = new PrintWriter(new FileWriter("C:/TestingIO/keyboard.txt"));

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		String s = b.readLine();
		while (!s.equals("quite")) {
			p.println(s);
			s = b.readLine();

		}
		p.close();
		r.close();
		b.close();
	
		System.out.println("Check ur file");
	}
}
