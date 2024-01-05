package Networking;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://www.raystec.com/tutorials");
		
		String question = "Java";
		
		URLConnection conn = url.openConnection();
		
		conn.setDoOutput(true);
		
		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
		
		out.write("q=" + question);
		
		out.close();
		conn.connect();
		
		InputStream inStr = conn.getInputStream();
		Scanner sc = new Scanner(inStr);
		
		System.out.print("URL contents ***");
		
		while (sc.hasNext()) {
			
			String html = sc.nextLine();
			System.out.println(html);
	}
		sc.close();
	}
}
