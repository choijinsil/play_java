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
		// 3. 서버접속요청
		// 글자 입력후 엔터 친것과 같은 행위
		Socket s = new Socket("192.168.96", 5000);// 접속할 서버의 정보

		System.out.println("서버 연결 성공");

		// 4. 소켓을 통한 입출력 객체 생성
		InputStream is = s.getInputStream(); // 읽기
		BufferedReader in = new BufferedReader(new InputStreamReader(is)); // InputStream보다 이게 더 편하다.
		OutputStream out = s.getOutputStream(); // 쓰기

		// 5.write 6.read 7.write 8. read
		// write먼저 시작 이후 read 클라이언트 서버가 번갈아 가며 write와 read를 사용한다.

		// 6. 서버에서 보낸 메세지 읽기 (5,6번은 언제나 바뀔수 있다.)
		// readLine()은 줄바뀔때까지 작동을 하기 때문에 서버에서 보내는 메세지에 \n을 실행 해준다.
		String msg = in.readLine();
		System.out.println("from Server: " + msg);

		// 7. 메세지 보내기
		// 메세지 세번을 보내려면 세번의 접속을 해야한다.
		String toMsg = "밥먹지롱\n";
		out.write(toMsg.getBytes());

	}
}
