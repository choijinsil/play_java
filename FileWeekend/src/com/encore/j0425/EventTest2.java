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
		setTitle("��ư�� Ŭ��������");

		setLayout(new FlowLayout());
		btn = new Button("ActionBtn");
		label = new Label("�̰��� �޼����� ǥ�õ˴ϴ�.");

		add(btn);
		add(label);

		setSize(300, 300);
		setVisible(true);

		A a = new A(this); // this�� �������̾���.
		btn.addActionListener(a);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		label.setText("�ȳ�?---->" + cnt);
//		cnt++;
//	}

	public static void main(String[] args) {
		new EventTest2();
	}

}
