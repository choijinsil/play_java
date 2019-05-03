package com.encore.j0426;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import com.encore.j0425.ButtonEventTest;

// 1�� Action������, Item������
// 2�� key������, keyAdapter, Mouse������, Mouse�Ƶ���
public class WindowCloseTest3 extends Frame {
	Button btn;
	int cnt=0;

	public WindowCloseTest3() {
		btn = new Button("���� Ŭ���ϸ� ����");
		add(btn);
		setLayout(new FlowLayout());

//		btn.addActionListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});

		setTitle("â�ݱ� �׽�Ʈ3");
		setSize(300, 300);
		setVisible(true);

//		MyClass myClass = new MyClass();
//		// �����Ӱ� �ؿ� �߰��� �ڵ鷯�� �����Ѵ�.
//		addWindowListener(myClass);

		// �͸��� ����Ŭ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				//System.out.println("Exit");
				//System.exit(0);
				//���� �������� Ÿ��Ʋ�� ��Ÿ�� �ݿ��Ϸ� �����ϼ���
				setTitle("��Ÿ�� �ݿ���");
				// this(��������) --> ����Ŭ������ ��������!
				
			}
		});
	}

	// ������ ������ â ���� ��ܿ� x��ư ����
	public static void main(String[] args) {
		new WindowCloseTest3();
	}

}
