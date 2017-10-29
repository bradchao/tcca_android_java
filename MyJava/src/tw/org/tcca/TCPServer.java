package tw.org.tcca;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			InputStream in = socket.getInputStream();
			
			FileOutputStream fout = new FileOutputStream("./upload/brad.jpg");
			byte[] buf = new byte[4096]; int len=0;
			while ( (len = in.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			in.close();
			
			System.out.println("Receive OK");
		} catch (Exception e) {
			System.out.println("Receive ERR:" + e.toString());
		}
	}

}
