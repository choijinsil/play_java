package com.siri.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Echoclinet {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 3. �������ӿ�û
		// ���� �Է��� ���� ģ�Ͱ� ���� ����
		Socket s = new Socket("192.168.96", 5000);// ������ ������ ����

		System.out.println("���� ���� ����");

		// 4. ������ ���� ����� ��ü ����
		InputStream is = s.getInputStream(); // �б�
		BufferedReader in = new BufferedReader(new InputStreamReader(is)); // InputStream���� �̰� �� ���ϴ�.
		OutputStream out = s.getOutputStream(); // ����

		// 5.write 6.read 7.write 8. read
		// write���� ���� ���� read Ŭ���̾�Ʈ ������ ������ ���� write�� read�� ����Ѵ�.

		// 6. �������� ���� �޼��� �б� (5,6���� ������ �ٲ�� �ִ�.)
		// readLine()�� �ٹٲ𶧱��� �۵��� �ϱ� ������ �������� ������ �޼����� \n�� ���� ���ش�.
		String msg = in.readLine();
		System.out.println("from Server: " + msg);

		// 7. �޼��� ������
		// �޼��� ������ �������� ������ ������ �ؾ��Ѵ�.
		String toMsg = "�������\n";
		out.write(toMsg.getBytes());

	}
}
