package com.encore.j0425rr;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A implements ActionListener {
	Frame f;
	EventTest2 event2;

	public A(Frame f) {
		// EventTest2 f=new EventTest2();
		// Frame f= new EventTest2(); <--�ڽ��̴ϱ�
		System.out.println("f--->"+f);
		this.f = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f.setTitle("����");
		// =EventTest2.setTitle();
	}
}

