
package com.siri.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	// 소켓서비스 서비스 제공자 - 서버, 서비스 이용자 - 클라이언트
	// 필요자원: Serversocket
	// 응답대기: accept()
	// 소켓채널에 대한 입출력
	// 출력 write: 현재 서버를 기준으로 데이터를 보내기, 입력 read
	public static void main(String[] args) throws IOException {

		// 1. 서버소켓 객체를 생성한다.
		// ServerSocket() 안에 포트 번호를 입력한다.
		// 충돌이 난다면 BindException <-- 동일한 port넘버가 두번이상 사용되면 뜨는에러
		ServerSocket ss = new ServerSocket(5000);

		System.out.println("서버시작(접속대기중)...");

		// 2. 클라이언트 접속대기 메소드를 소켓에 장착
		while (true) {
			Socket s = ss.accept(); // 클라이언트와 만났다.

			String addr = s.getInetAddress().getHostAddress(); // 접속자 ip 정보 가져오기
			System.out.println("접속자가 누구야!  --> " + addr);
			System.out.println("클라이언트접속성공");

			// 4. 소켓을 통한 입출력 객체 생성
			// 읽기만 쓰기만도 가능하다. (하나만 사용가능)
			InputStream is = s.getInputStream(); // 읽기
			BufferedReader in = new BufferedReader(new InputStreamReader(is)); // InputStream보다 이게 더 편하다.
			OutputStream out = s.getOutputStream(); // 쓰기

			// 실제통신(write --> read)
			// 5.write 6.read 7.write 8. read
			// write먼저 시작 이후 read 클라이언트 서버가 번갈아 가며 write와 read를 사용한다.

			// 5. 메세지 보내기
			// String을 byte로 변환해 한다. 왜? Write에선 String을 쓸 수 없으니깐
			// readLine()은 줄바뀔때까지 작동을 하기 때문에 서버에서 보내는 메세지에 \n을 실행 해준다.
			String msg = "까꿍\n";
			out.write(msg.getBytes()); // msg를 byte[]로 면환해서 보내기

			// 8. 메세지 읽기
			String fromMsg = in.readLine();
			System.out.println("from Client: " + fromMsg);
		}
	}
}
