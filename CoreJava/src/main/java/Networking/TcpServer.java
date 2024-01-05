package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(8086);

		Socket client = server.accept();

		DataInputStream d = new DataInputStream(client.getInputStream());

		DataOutputStream d1 = new DataOutputStream(client.getOutputStream());

		String s = d.readLine();

		System.out.println(s);

		d1.writeBytes("Please Tell me client \n");

		client.close();
		server.close();
	}
}
