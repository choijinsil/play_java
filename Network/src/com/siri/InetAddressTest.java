package com.siri;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.IntConsumer;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		// ���񽺸� �����ϴ� ��� �Ǿ�
		String host = "naver.com";
		InetAddress ia = InetAddress.getByName(host);
		String name = ia.getHostName(); // �����θ�
		String addr = ia.getHostAddress(); // ip�ּ�

		System.out.println("ȣ��Ʈ��: " + name);
		System.out.println("ȣ��Ʈ�ּ�: " + addr);

		// �� �����ο� ���ε� ��� ����ip ������
		InetAddress[] ias = InetAddress.getAllByName(host);
		for (int i = 0; i < ias.length; i++) {
			System.out.println(ias[i].getHostAddress());

		}
	}

}
