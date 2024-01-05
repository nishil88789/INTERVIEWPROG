package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedEchoServer extends Thread {

	private Socket client = null;
	
	public MultiThreadedEchoServer (Socket clientSocket) {
		this.client = clientSocket;
	}
	public void run() {
		try {
			
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			
  BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
	
  String inputLine, outLine;
  
  inputLine = br.readLine();
  
  while (inputLine != null) {
	
	  System.out.println("Server Recived" + inputLine);
	  
	  out.println(inputLine + " .. " + inputLine);
	  
	  if (inputLine.equals("Bye...")) 
		 break;
	  
	  inputLine = br.readLine();
  }
         out.close();
         br.close();
         client.close();
         
		} catch (Exception e) {
	
	}
	}
	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket = null;
		
		MultiThreadedEchoServer multiThreadedEchoServer = null;
		
		serverSocket = new ServerSocket(4444);
		
		System.out.println("Echo Server Started");
		
		Socket clientSocket = null;
		
		boolean flag = true;
		
		while (flag) {
			
			clientSocket = serverSocket.accept();
			
			multiThreadedEchoServer = new MultiThreadedEchoServer(clientSocket);
			
			multiThreadedEchoServer.start();
		}
		System.out.println("Echo Server Stopped....");
		
		serverSocket.close();
	}
	
}
