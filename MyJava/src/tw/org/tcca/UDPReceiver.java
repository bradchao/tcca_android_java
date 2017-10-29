package tw.org.tcca;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) {
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(8899);
		}catch(Exception e) {
			System.exit(-1);
		}
		
		byte[] buf;
		while(socket != null) {
			buf = new byte[1024];
			try {
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				String who = packet.getAddress().getHostAddress();
				byte[] data = packet.getData();
				System.out.println(who + ":" + new String(data));
				//socket.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}

}
