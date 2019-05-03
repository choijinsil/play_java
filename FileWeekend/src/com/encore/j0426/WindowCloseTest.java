package com.encore.j0426;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import com.encore.j0425.ButtonEventTest;
// 1번 Action리스너, Item리스너
// 2번 key리스너, keyAdapter, Mouse리스너, Mouse아뎁터
public class WindowCloseTest extends Frame implements WindowListener {

	public WindowCloseTest() {

		setTitle("창닫기 테스트");
		setSize(300, 300);
		setVisible(true);

		// 프레임과 밑에 추가된 핸들러를 연결한다.
		addWindowListener(this);
	}

	// 윈도우 프레임 창 우측 상단에 x버튼 구현
	public static void main(String[] args) {
		new WindowCloseTest();
	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("x버튼 클릭");
		// System.exit(0); // 0: 정상마침  -1:비정상종료
		// 이동하는 것처럼 보인다.
		new ButtonEventTest();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
