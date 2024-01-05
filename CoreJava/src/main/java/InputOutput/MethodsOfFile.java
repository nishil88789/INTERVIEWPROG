package InputOutput;

import java.io.File;

public class MethodsOfFile {

	public static void main(String[] args) {
		
		File f = new File("C:/TestingIO/io.txt");
		
		if (f.exists()) {
			
			System.out.println("Name:"+ f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());
			
		}
	}
}
