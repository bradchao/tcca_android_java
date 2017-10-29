package tw.org.tcca;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIPTest {

	public static void main(String[] args) {
		try {
			InetAddress ip = 
					InetAddress.getByName("192.168.2.333");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("not exist");
		}
		
		
	}

}
