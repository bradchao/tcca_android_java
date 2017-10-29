package tw.org.tcca;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			File upload = new File("./data/bg.jpg");
			byte[] buf = new byte[(int)(upload.length())];
			FileInputStream fin = new FileInputStream(upload);
			fin.read(buf);
			fin.close();
			
			Socket socket = new Socket(InetAddress.getByName("10.0.1.8"), 7777);
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
			System.out.println("Send OK");
		}catch(Exception ee) {
			System.out.println("Send ERR:" + ee.toString());
		}
		
		
	}

}
