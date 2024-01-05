package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSplit {

	public static void main(String[] args) throws IOException{
		
		String inputFile = "C:/TestingIO/Split.txt";
		
		int nol = 2;
		int count = 0;
		
		File file = new File(inputFile);
		
		Scanner s = new Scanner(file);
		
		while (s.hasNext()) {
			String string = s.next();
			count++;
		}
		System.out.println(count);
		
		int temp = count / nol;
		int rem =  count % nol;
		int nof = 0;
		
		if (temp != 0) {
			nof = temp;
		}
		if (rem != 0 ) {
			nof++;
		} else {
		     
			nof = temp;
		}
		System.out.println(nof);
	    
		FileReader fr = new FileReader(inputFile);
		
		BufferedReader br = new BufferedReader(fr);
	   
		String stLine;
		
		for (int i = 1; i <= nof; i++) {
			
			FileWriter fw = new FileWriter("C:/TestingIO/Splitt.txt");
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int j = 1; j <= nol; j++) {
				
				stLine = br.readLine();
				
				if(stLine != null) {
					
					bw.write(stLine);
					if(j !=nol) {
						bw.newLine();
					}
				}
			}
			bw.close();
		}
		br.close();
	}
}
