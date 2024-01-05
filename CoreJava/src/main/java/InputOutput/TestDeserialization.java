package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:/TestingIO/Nishil.txt");
		
		ObjectInputStream o = new ObjectInputStream(f);
		
		Marksheet m = (Marksheet) o.readObject();
		
		System.out.println("Name :"+ m.getName());
		System.out.println("Math :"+m.getMath());
		
		f.close();
		o.close();
		
		System.out.println("Task Completed");
	}
}
