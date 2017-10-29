package tw.org.tcca;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) {
		byte[] buf = "Hello, World".getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, 
					InetAddress.getByName("10.0.1.8"),	8888);
			socket.send(packet);
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
