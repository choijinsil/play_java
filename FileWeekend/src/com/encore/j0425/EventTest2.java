package com.encore.j0425;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest2 extends Frame {// implements ActionListener {
	Button btn;
	Label label;
	int cnt = 0;

	public EventTest2() {
		setTitle("버튼을 클릭했을떄");

		setLayout(new FlowLayout());
		btn = new Button("ActionBtn");
		label = new Label("이곳에 메세지가 표시됩니다.");

		add(btn);
		add(label);

		setSize(300, 300);
		setVisible(true);

		A a = new A(this); // this는 프레임이었다.
		btn.addActionListener(a);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		label.setText("안녕?---->" + cnt);
//		cnt++;
//	}

	public static void main(String[] args) {
		new EventTest2();
	}

}
