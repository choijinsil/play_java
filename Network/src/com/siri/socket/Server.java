package com.siri.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server implements Runnable {
	// 외부 클래스: 소켓을 통한 접속서비스(접속대기)
	// 접속한 클라이언트를
	ServerSocket ss;
	Vector<Service> v; // 접속한 클라이언트 관리

	public Server() {
		System.out.println("Server Start.......");
		v = new Vector<Service>();
		try {
			ss = new ServerSocket(3000); // 1. 서버소켓객체생성
			new Thread(this).start();
		} catch (IOException e) {
			// binding Exception이 날 확률이 높다.
			e.printStackTrace();
		}
	}

	public void run() { // 여러 클라이언트 접속에 대한 대기
		try {
			while (true) { // 몇명 접속할지 모르니까!
				// 접속된 클라이언트 수 만큼 유지가 되어야 한다.
				Socket s = ss.accept(); // 2.3 클라이언트 접속대기( new Socket과 매핑) , 접속한 클라이언트의 소켓정보를 얻어올수 있다.
				Service serv = new Service(s); // service는 클라이언트 갯수와 동일하다.

				v.add(serv);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // 외부 run

	// ------------------------------------------------------------------
	class Service extends Thread { // 내부 클래스: 소켓을 통한 입출력 서비스
		// ** Service객체 한개 == 클라이언트 한개
		BufferedReader in; // 소켓을 통해 읽기
		OutputStream out; // 소켓에 쓰기
		String clientAddr;
		String nickName;

		public Service(Socket s) { // 내부클래스 생성자
			// 4. 소켓 입출력 생성
			try {
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
				clientAddr = s.getInetAddress().getHostAddress();
				// 여기선 현재클래스가 스레드 이므로 start만 해주면 끝이다.
				start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void run() { // 클라이언트가 보내는 여러메세지를 일어주는 기능
			while (true) {
				try {
					String msg = in.readLine(); // 6. 클라이언트가 tf보낸 메세지, 좋은하루!
					// msg -> "100|"+홍길동 "200|"안녕하세요
					// 값을 받아서
					// 서버 모니터링
					System.out.println("[" + clientAddr + "]>>>" + msg);

					String[] arr = msg.split("\\|");
					
					switch (arr[0]) {
					case "100": // 대화명 전달
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
			// 특정클라이언트에게 메세지 보내기 (실제)
			out.write((msg + "\n").getBytes()); // 7. 실제 클라이언트에게 메세지 보내기

		}

		public void messageAll(String msg) { // 좋은하루 들어옴
			// 접속한 모든 클라이언트에게 메세지 보내기
			for (int i = 0; i < v.size(); i++) { // 전체 클라이언트(Service벡터)

				Service serv = v.get(i);
				try {
					serv.messageTo(msg);
				} catch (IOException e) {

					// 에러발생 --> 이유: 클라이언트가 접속을 끊었을떄
					// 소켓은 사라졌지만 Service객체가 벡터에 존재하기 때문에 문제가 발생
					// 접속 끊긴 클라이언트를 remove해준다.
					// 0번째를 remove 를 하면 1번쨰가 값을 못받는다. remove하면서 값이 앞으로 한칸 당겨지기 때문에 2가 출력이된다.
					// 그래서 i--를 해줘야 한다.
					v.remove(i--); // v(i)를 remove해준 뒤 i를 --해줘라
					System.out.println("[#클라이언트 접속 끊음]");
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
