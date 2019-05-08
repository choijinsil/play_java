package com.siri;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.IntConsumer;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		// 서비스를 제공하는 기기 피씨
		String host = "naver.com";
		InetAddress ia = InetAddress.getByName(host);
		String name = ia.getHostName(); // 도메인명
		String addr = ia.getHostAddress(); // ip주소

		System.out.println("호스트명: " + name);
		System.out.println("호스트주소: " + addr);

		// 한 도메인에 매핑된 모든 서버ip 얻어오기
		InetAddress[] ias = InetAddress.getAllByName(host);
		for (int i = 0; i < ias.length; i++) {
			System.out.println(ias[i].getHostAddress());

		}
	}

}
