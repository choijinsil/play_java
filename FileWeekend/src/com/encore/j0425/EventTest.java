package com.encore.j0425;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class EventTest extends Frame implements ActionListener {
	Button btn;
	int cnt = 0;
	Random r = new Random();

	public EventTest() {
		setTitle("버튼이벤트");
		btn = new Button("나버튼");
		setLayout(new FlowLayout());
		add(btn);
		setSize(300, 300);
		setVisible(true);

		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("안녕?");
		setTitle("버튼이벤트" + (++cnt));
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);

		Button btn1 = new Button("추가버튼[" + cnt + "]");
		btn1.setBackground(new Color(red, green, blue));

		add(btn1);
		setVisible(true);

		setBackground(new Color(r.nextInt(999999)));
	} // 이벤트처리부(Event Handler): 기능정의

	public static void main(String[] args) {
		new EventTest();

	}

}
