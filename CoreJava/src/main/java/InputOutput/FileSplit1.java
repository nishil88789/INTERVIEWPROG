package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileSplit1 {

	public static void main(String[] args) throws IOException{
		
		String s = "C:/TestingIO/Split.txt";
		double d = 4;
		int count = 0;
		
		File file = new File(s);
		Scanner scanner = new Scanner(file);
		
		while (scanner.hasNext()) {
			scanner.nextLine();
			count++;
		}
		System.out.println("Success");
		
		double d1 = count / d;
		int t = (int) d1;
		int nof = 0;
		
		if (t == d1) {
		     nof = t;
		}
		else {
		       nof = t + 1;
		}
		System.out.println("Files Generatred"+ nof);
		
		FileInputStream fstream = new FileInputStream(s);
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		for (int j = 1; j <= nof; j++) {
			
	FileWriter f1 = new FileWriter("C:/TestingIO/FileSplit"+ j +".txt" );
	
	BufferedWriter out = new BufferedWriter(f1);
	
	for (int i = 1; i <= d; i++) {
		
		String s1 = br.readLine();
		
		if (s1 != null) {
			
			out.write(s1);
			if(i != d) {
				out.newLine();
			}
		}
	}
	out.close();
		}
			in.close();
	}
}
