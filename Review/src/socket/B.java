package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class B {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 8000);

		System.out.println("서버 연결 성공");
	}

}
