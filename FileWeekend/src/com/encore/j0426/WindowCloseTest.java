package com.encore.j0426;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import com.encore.j0425.ButtonEventTest;
// 1�� Action������, Item������
// 2�� key������, keyAdapter, Mouse������, Mouse�Ƶ���
public class WindowCloseTest extends Frame implements WindowListener {

	public WindowCloseTest() {

		setTitle("â�ݱ� �׽�Ʈ");
		setSize(300, 300);
		setVisible(true);

		// �����Ӱ� �ؿ� �߰��� �ڵ鷯�� �����Ѵ�.
		addWindowListener(this);
	}

	// ������ ������ â ���� ��ܿ� x��ư ����
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
		
		System.out.println("x��ư Ŭ��");
		// System.exit(0); // 0: ����ħ  -1:����������
		// �̵��ϴ� ��ó�� ���δ�.
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
