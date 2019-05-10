package socket;

import java.io.IOException;
import java.net.ServerSocket;

public class A {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("서버시작! 접속대기..");

		ss.accept();

		System.out.println("클라이언트성공!");
	}
}
