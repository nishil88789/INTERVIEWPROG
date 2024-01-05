package Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket();
		
		byte[] buf = new byte[256];
		
		InetAddress address = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(buf, buf.length , address , 4445);
		
		socket.send(packet);
		
		packet = new DatagramPacket(buf, buf.length);
		
		socket.receive(packet);
		
		String received = new String(packet.getData());
		
		System.out.println("Quote of Moment : " + received);
		
		socket.close();
	}
}
