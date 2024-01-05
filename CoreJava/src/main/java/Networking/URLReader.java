package Networking;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

	public static void main(String[] args) throws Exception {
		
		URL u = new URL("https://www.google.com");
		
		System.out.println("Protocol: " + u.getProtocol());
		System.out.println("Host Name: " + u.getHost());
		System.out.println("Port Number: " + u.getPort());
		System.out.println("File Name: "+ u.getFile());
		
		InputStream in = u.openStream();
		
		Scanner s = new Scanner(in);
		
		while (s.hasNext()) {
			
			String html = s.next();
			System.out.println(html);
	}
		s.close();
	}
}
