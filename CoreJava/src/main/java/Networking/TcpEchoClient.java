package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpEchoClient {

	public static void main(String[] args) throws Exception {
		
		Socket client = new Socket("127.0.0.1",4444);
		
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		
	BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
	
	System.out.println("Echo Client Started");
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	String line = bf.readLine();
	
	while (line != null) {
		
		out.println(line);
		
		System.out.println("Echo:"+ in.readLine());
		
		if ("bye".equals(line)) {
			break;
		}
		line = bf.readLine();
	}
	out.close();
	in.close();
	bf.close();
	
	client.close();
	}
	
}
