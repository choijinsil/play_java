
package com.siri.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	// ���ϼ��� ���� ������ - ����, ���� �̿��� - Ŭ���̾�Ʈ
	// �ʿ��ڿ�: Serversocket
	// ������: accept()
	// ����ä�ο� ���� �����
	// ��� write: ���� ������ �������� �����͸� ������, �Է� read
	public static void main(String[] args) throws IOException {

		// 1. �������� ��ü�� �����Ѵ�.
		// ServerSocket() �ȿ� ��Ʈ ��ȣ�� �Է��Ѵ�.
		// �浹�� ���ٸ� BindException <-- ������ port�ѹ��� �ι��̻� ���Ǹ� �ߴ¿���
		ServerSocket ss = new ServerSocket(5000);

		System.out.println("��������(���Ӵ����)...");

		// 2. Ŭ���̾�Ʈ ���Ӵ�� �޼ҵ带 ���Ͽ� ����
		while (true) {
			Socket s = ss.accept(); // Ŭ���̾�Ʈ�� ������.

			String addr = s.getInetAddress().getHostAddress(); // ������ ip ���� ��������
			System.out.println("�����ڰ� ������!  --> " + addr);
			System.out.println("Ŭ���̾�Ʈ���Ӽ���");

			// 4. ������ ���� ����� ��ü ����
			// �б⸸ ���⸸�� �����ϴ�. (�ϳ��� ��밡��)
			InputStream is = s.getInputStream(); // �б�
			BufferedReader in = new BufferedReader(new InputStreamReader(is)); // InputStream���� �̰� �� ���ϴ�.
			OutputStream out = s.getOutputStream(); // ����

			// �������(write --> read)
			// 5.write 6.read 7.write 8. read
			// write���� ���� ���� read Ŭ���̾�Ʈ ������ ������ ���� write�� read�� ����Ѵ�.

			// 5. �޼��� ������
			// String�� byte�� ��ȯ�� �Ѵ�. ��? Write���� String�� �� �� �����ϱ�
			// readLine()�� �ٹٲ𶧱��� �۵��� �ϱ� ������ �������� ������ �޼����� \n�� ���� ���ش�.
			String msg = "���\n";
			out.write(msg.getBytes()); // msg�� byte[]�� ��ȯ�ؼ� ������

			// 8. �޼��� �б�
			String fromMsg = in.readLine();
			System.out.println("from Client: " + fromMsg);
		}
	}
}
