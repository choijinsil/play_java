package com.encore.j0426;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.encore.j0425.ButtonEventTest;

public class MyClass extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("x��ư Ŭ�� ����°");
		// System.exit(0); // 0: ����ħ -1:����������
		// �̵��ϴ� ��ó�� ���δ�.
		System.exit(0);
	}

}
