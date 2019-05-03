package com.encore.j0426;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class HelloEventTest extends Frame implements ActionListener {
	Button btnHi, btnDel, btnExit;
	Panel northp, southp, centerp;
	TextField tf;
	ButtonGroup group;
	JRadioButton jLow, jMid, jHight;

	// 안녕클릭시 라디오박스+안녕~!!, get, set참고
	public HelloEventTest() {
		setTitle("안녕이벤트");

		// 객체 생성
		btnHi = new Button("안녕");
		btnDel = new Button("지우기");
		btnExit = new Button("종료");

		northp = new Panel();
		southp = new Panel();
		centerp = new Panel();

		tf = new TextField(10);

		group = new ButtonGroup();

		jLow = new JRadioButton("자바초급", true);
		jMid = new JRadioButton("자바중급", false);
		jHight = new JRadioButton("자바고급", false);

		// 그룹에 자바 초중고급 추가
		group.add(jLow);
		group.add(jMid);
		group.add(jHight);

		// southp 남쪽 안녕 지우기 종료 추가
		southp.setLayout(new FlowLayout());
		southp.setBackground(Color.PINK);
		southp.add(btnHi);
		southp.add(btnDel);
		southp.add(btnExit);

		// northp 북쪽 안녕 지우기 종료 추가
		northp.setLayout(new FlowLayout());
		northp.setBackground(Color.ORANGE);
		northp.add(tf);

		// centerp에 담기
		centerp.setLayout(new GridLayout(3, 1));
		centerp.add(jLow);
		centerp.add(jMid);
		centerp.add(jHight);

		// add("Center",group);
		add("North", northp);
		add("South", southp);
		add("Center", centerp);

		// 창사이즈와 화면 보이기 설정
		setSize(400, 400);
		setVisible(true);

		// addActionListener는 actionPerformed를 호출하는 메서드
		btnHi.addActionListener(this);
		btnDel.addActionListener(this);
		btnExit.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	/*
	 * private void eventUp() { // 이벤트 등록(이벤트 소스의 수가 많을떄!)
	 * 
	 * }
	 */

	public static void main(String[] args) {
		new HelloEventTest();
	}

	// 라디오 버튼 클릭시 클릭값 얻어오기
	// 텍스트의 setText하는 방법 알아보기
	// 종료 누르면 종료되게 하기

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource(); // 이벤트를 발생시킨 소스의 참조변수(주소)를 얻어오기.

		if (ob == btnHi) {

			// 라디오 버튼의 체크 되었는지 논리값가져오고싶음

			if (jLow.isSelected()) {
				tf.setText(jLow.getText() + "siri?");

			} else if (jMid.isSelected()) {
				tf.setText(jMid.getText() + "hana?");

			} else if (jHight.isSelected()) {
				tf.setText(jHight.getText() + "youna?");
			}

		} else if (ob == btnDel) {
			tf.setText("");

		} else if (ob == btnExit) {
			System.exit(0);
		}
	}
}
