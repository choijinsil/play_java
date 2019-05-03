package com.encore.j0425;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A implements ActionListener {
	Frame f;
	EventTest2 event2;

	public A(Frame f) {
		this.f = f;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("안냥");
		f.setTitle("변경해따");
		// event2.label.setText("안녕?---->" + event2.cnt);
		// event2.cnt++;
	}

}
