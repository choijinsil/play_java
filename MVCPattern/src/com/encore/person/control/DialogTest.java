package com.encore.person.control;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogTest extends JFrame {

	public DialogTest() {
		setTitle("��ȭ���� �׽�Ʈ");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(this, "�ȳ�?");
		String movie=JOptionPane.showInputDialog(this, "�����ϴ� ��ȭ��?");
		System.out.println("��ȭ"+movie);
		
	}

	public static void main(String[] args) {
		new DialogTest();

	}
}
