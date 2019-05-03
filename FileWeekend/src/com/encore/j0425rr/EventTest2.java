package com.encore.j0425rr;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class EventTest2 extends Frame {
	Button btn;

	public EventTest2() {
		setTitle("버튼 클릭쿨릭");
		setLayout(new FlowLayout());
		btn = new Button("버튼액션");
		add(btn);

		A a = new A(this);
		System.out.println("this<--" + this);
		// this <--EventTest2를 다 가져오겠어
		// <-- 주소를 보내겠어.
		setSize(300, 300);
		setVisible(true);
		btn.addActionListener(a);
		// 메소드호출: method(데이터)
		// 생성자호출: new A( 203호 )
	}

	public static void main(String[] args) {
		EventTest2 et2 = new EventTest2(); // 203호
		System.out.println("new EventTest2()<--" + et2);
	}
}
