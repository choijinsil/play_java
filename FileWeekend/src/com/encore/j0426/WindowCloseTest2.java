package com.encore.j0426;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// �׷� ������� �뵵��?? closing�� �ϳ��� ����Ϸ��� ���°�?
public class WindowCloseTest2 extends WindowAdapter {
	Frame f;

	public WindowCloseTest2() {
		f = new Frame();

		f.setSize(300, 300);
		f.setVisible(true);
		f.addWindowListener(this);

	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("������ â�ݱ�!");
		System.exit(0);
	}

	public static void main(String[] args) {
		new WindowCloseTest2();
	}

}
