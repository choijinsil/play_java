package com.encore.j0426;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.encore.j0425.ButtonEventTest;

public class MyClass extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("x버튼 클릭 세번째");
		// System.exit(0); // 0: 정상마침 -1:비정상종료
		// 이동하는 것처럼 보인다.
		System.exit(0);
	}

}
