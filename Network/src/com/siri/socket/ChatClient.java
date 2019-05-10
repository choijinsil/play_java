package com.siri.socket;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable {
	// Center -> JTextArea( 서버가 보낸 메세지를 출력)
	// South -> JTextField( 서버에게 보낼 메세지)

	JTextArea ta;

	JTextField tf_send;
	JButton bt_change; // 대화명 변경

	JPanel southp;

	JScrollPane scroll_ta;

	OutputStream out; // 소켓 쓰기
	BufferedReader in; // 소켓 읽기

	public ChatClient() {
		setTitle("대화방");
		// 스크롤이 필요한 컴포넌트를 매개변수로 넣는다.
		southp = new JPanel();
		ta = new JTextArea();
		ta.setFont(new Font("굴림체", Font.ITALIC, 20));
		scroll_ta = new JScrollPane(ta);
		tf_send = new JTextField(15);
		tf_send.setFont(new Font("굴림체", Font.BOLD, 20));
		bt_change = new JButton("대화명 변경");

		southp.add(tf_send);
		southp.add(bt_change);

		add("Center", scroll_ta);
		add("South", southp);

		setBounds(300, 200, 300, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		connectProcess(); // in, out객체 생성

		new Thread(this).start(); // in객체 사용

		String nickName = JOptionPane.showInputDialog(this, "대화명: ");
		toServer("100|" + nickName);

		tf_send.addActionListener(this);
		bt_change.addActionListener(this);
	}

	// 최초대화명 길동이
	// 대화시도: ta출력

	// 대화명 변경 버튼 클릭시
	// 대화상자 보이기
	// 변경대화명 입력 - > 변경 대화명으로 바뀌게끔
	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		if (ob == tf_send) {// 텍스트필드에 엔터가 입력되었을때
			String msg = tf_send.getText();
			toServer("200|" + msg);// "200|안녕하세요??"
			tf_send.setText("");
		} else if (ob == bt_change) {// 대화명변경 버튼 클릭시
			String cNickName = JOptionPane.showInputDialog(this, "변경대화명:");
			toServer("100|" + cNickName);
		}
	}

	public void connectProcess() { // 서버소켓과 연결하는 작업
		try {
			Socket s = new Socket("192.168.0.93", 3000); // 3. 서버소켓 연결
			// 4. 소켓 입출력 객체 생성
			out = s.getOutputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 서버에게 메세지 보내기
	public void toServer(String msg) {
		try {
			out.write((msg + "\n").getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() { // 만든이유 쓰레드 사용!
		try {
			while (true) {
				// 최소한 connect프로세스 다음에 호출되어야 한다.
				String msg = in.readLine(); // 8. 서버가 보낸 메세지 읽기
				ta.append(msg + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatClient();
	}

}
