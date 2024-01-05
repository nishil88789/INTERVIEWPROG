package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpEchoServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket sSocket = new ServerSocket(4444);
		
		System.out.println("Echo Server is Started");
		
		Socket client = null;
		
		boolean flag = true;
		
		while (flag) {
			
			client = sSocket.accept();
			talk(client);
		}
		sSocket.close();
		System.out.println("Echo Server is Closed");
	}

	private static void talk(Socket cSocket) throws Exception {
		
		PrintWriter out = new PrintWriter(cSocket.getOutputStream(),true);
		
 BufferedReader br = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));

   String line = br.readLine();
   
   while (line != null) {
	
	   System.out.println("Server Recived :"+ line);
	   
	   out.println(line +" .."+ line);
	   
	   if (line.equals("bye")) {
		   break;
		}
	   line = br.readLine();
	}
   out.close();
   br.close();
   
   cSocket.close();
		
	}
}
