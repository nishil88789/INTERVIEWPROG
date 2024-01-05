package InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestExternalizable {

	public static void main(String[] args) throws IOException{
		
		FileOutputStream f = new FileOutputStream("C:/TestingIO/a.txt");
		
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		ExtBean m = new ExtBean();
		
		m.setMath(88);
		m.setTemp(120);
		
		o.writeObject(m);
		f.close();
		o.close();
		
		System.out.println(m.getMath());
		System.out.println(m.getTemp());
	}
}
