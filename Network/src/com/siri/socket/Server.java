package com.siri.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server implements Runnable {
	// �ܺ� Ŭ����: ������ ���� ���Ӽ���(���Ӵ��)
	// ������ Ŭ���̾�Ʈ��
	ServerSocket ss;
	Vector<Service> v; // ������ Ŭ���̾�Ʈ ����

	public Server() {
		System.out.println("Server Start.......");
		v = new Vector<Service>();
		try {
			ss = new ServerSocket(3000); // 1. �������ϰ�ü����
			new Thread(this).start();
		} catch (IOException e) {
			// binding Exception�� �� Ȯ���� ����.
			e.printStackTrace();
		}
	}

	public void run() { // ���� Ŭ���̾�Ʈ ���ӿ� ���� ���
		try {
			while (true) { // ��� �������� �𸣴ϱ�!
				// ���ӵ� Ŭ���̾�Ʈ �� ��ŭ ������ �Ǿ�� �Ѵ�.
				Socket s = ss.accept(); // 2.3 Ŭ���̾�Ʈ ���Ӵ��( new Socket�� ����) , ������ Ŭ���̾�Ʈ�� ���������� ���ü� �ִ�.
				Service serv = new Service(s); // service�� Ŭ���̾�Ʈ ������ �����ϴ�.

				v.add(serv);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // �ܺ� run

	// ------------------------------------------------------------------
	class Service extends Thread { // ���� Ŭ����: ������ ���� ����� ����
		// ** Service��ü �Ѱ� == Ŭ���̾�Ʈ �Ѱ�
		BufferedReader in; // ������ ���� �б�
		OutputStream out; // ���Ͽ� ����
		String clientAddr;
		String nickName;

		public Service(Socket s) { // ����Ŭ���� ������
			// 4. ���� ����� ����
			try {
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
				clientAddr = s.getInetAddress().getHostAddress();
				// ���⼱ ����Ŭ������ ������ �̹Ƿ� start�� ���ָ� ���̴�.
				start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void run() { // Ŭ���̾�Ʈ�� ������ �����޼����� �Ͼ��ִ� ���
			while (true) {
				try {
					String msg = in.readLine(); // 6. Ŭ���̾�Ʈ�� tf���� �޼���, �����Ϸ�!
					// msg -> "100|"+ȫ�浿 "200|"�ȳ��ϼ���
					// ���� �޾Ƽ�
					// ���� ����͸�
					System.out.println("[" + clientAddr + "]>>>" + msg);

					String[] arr = msg.split("\\|");
					
					switch (arr[0]) {
					case "100": // ��ȭ�� ����
						nickName = arr[1];
						break;

					case "200":
						messageAll("[" + arr[0] + "]->" + arr[1]);
						break;
					
					}

					/*
					 * for (int i = 0; i < arr.length; i++) { messageAll(arr[i]); }
					 */

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		public void messageTo(String msg) throws IOException {
			// Ư��Ŭ���̾�Ʈ���� �޼��� ������ (����)
			out.write((msg + "\n").getBytes()); // 7. ���� Ŭ���̾�Ʈ���� �޼��� ������

		}

		public void messageAll(String msg) { // �����Ϸ� ����
			// ������ ��� Ŭ���̾�Ʈ���� �޼��� ������
			for (int i = 0; i < v.size(); i++) { // ��ü Ŭ���̾�Ʈ(Service����)

				Service serv = v.get(i);
				try {
					serv.messageTo(msg);
				} catch (IOException e) {

					// �����߻� --> ����: Ŭ���̾�Ʈ�� ������ ��������
					// ������ ��������� Service��ü�� ���Ϳ� �����ϱ� ������ ������ �߻�
					// ���� ���� Ŭ���̾�Ʈ�� remove���ش�.
					// 0��°�� remove �� �ϸ� 1������ ���� ���޴´�. remove�ϸ鼭 ���� ������ ��ĭ ������� ������ 2�� ����̵ȴ�.
					// �׷��� i--�� ����� �Ѵ�.
					v.remove(i--); // v(i)�� remove���� �� i�� --�����
					System.out.println("[#Ŭ���̾�Ʈ ���� ����]");
					e.printStackTrace();
				}

			}
		}
	}
	
	// ------------------------------------------------------------------
	public static void main(String[] args) {
		new Server();
	}

}
