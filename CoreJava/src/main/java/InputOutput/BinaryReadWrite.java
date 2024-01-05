package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite {

	public static void main(String[] args) throws  IOException {
		
		FileInputStream file = new FileInputStream("C:/TestingIO/aaaa.jpg");
		
		FileOutputStream out = new FileOutputStream("C:/TestingIO/bbbb.jpg");
		
		int ch = file.read();
		
		while (ch != -1) {
			
			out.write(ch);
			
			ch = file.read();
		}
		out.close();
		file.close();
		
		System.out.println("Success...");
	}
}
