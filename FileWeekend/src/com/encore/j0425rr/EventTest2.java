package com.encore.j0425rr;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class EventTest2 extends Frame {
	Button btn;

	public EventTest2() {
		setTitle("��ư Ŭ����");
		setLayout(new FlowLayout());
		btn = new Button("��ư�׼�");
		add(btn);

		A a = new A(this);
		System.out.println("this<--" + this);
		// this <--EventTest2�� �� �������ھ�
		// <-- �ּҸ� �����ھ�.
		setSize(300, 300);
		setVisible(true);
		btn.addActionListener(a);
		// �޼ҵ�ȣ��: method(������)
		// ������ȣ��: new A( 203ȣ )
	}

	public static void main(String[] args) {
		EventTest2 et2 = new EventTest2(); // 203ȣ
		System.out.println("new EventTest2()<--" + et2);
	}
}
