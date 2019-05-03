package com.encore.j0426;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 그럼 어댑터의 용도는?? closing등 하나만 사용하려면 쓰는것?
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

		System.out.println("프레임 창닫기!");
		System.exit(0);
	}

	public static void main(String[] args) {
		new WindowCloseTest2();
	}

}
