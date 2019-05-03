package com.encore.j0426;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import com.encore.j0425.ButtonEventTest;

// 1번 Action리스너, Item리스너
// 2번 key리스너, keyAdapter, Mouse리스너, Mouse아뎁터
public class WindowCloseTest3 extends Frame {
	Button btn;
	int cnt=0;

	public WindowCloseTest3() {
		btn = new Button("나는 클릭하면 종료");
		add(btn);
		setLayout(new FlowLayout());

//		btn.addActionListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});

		setTitle("창닫기 테스트3");
		setSize(300, 300);
		setVisible(true);

//		MyClass myClass = new MyClass();
//		// 프레임과 밑에 추가된 핸들러를 연결한다.
//		addWindowListener(myClass);

		// 익명의 내부클래스
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//System.out.println("Exit");
				//System.exit(0);
				//현재 프레임의 타이틀을 부타는 금요일로 변경하세요
				setTitle("불타는 금요일");
				// this(참조변수) --> 내부클래스의 참조변수!
				
			}
		});
	}

	// 윈도우 프레임 창 우측 상단에 x버튼 구현
	public static void main(String[] args) {
		new WindowCloseTest3();
	}

}
