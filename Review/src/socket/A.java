package socket;

import java.io.IOException;
import java.net.ServerSocket;

public class A {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("��������! ���Ӵ��..");

		ss.accept();

		System.out.println("Ŭ���̾�Ʈ����!");
	}
}
