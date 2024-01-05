package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost", 8086);
		
		DataInputStream d = new DataInputStream(s.getInputStream());
		
		DataOutputStream d1 = new DataOutputStream(s.getOutputStream());
		
		d1.writeBytes("I am Calling the Server \n");
		
		String s1 = d.readLine();
		
		System.out.println(s1);
		
		s.close();
		
	}
}
