package InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream file = new FileOutputStream("C:/TestingIO/serialization.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		
		m.setName("Ram");
		m.setMath(90);
		
		out.writeObject(m);
		
		System.out.println(m.getName());
		System.out.println(m.getMath());
		
		file.close();
		out.close();
		
		System.out.println("Task Completed");
		
	}
}
