package com.encore.person.control;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogTest extends JFrame {

	public DialogTest() {
		setTitle("대화상자 테스트");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(this, "안녕?");
		String movie=JOptionPane.showInputDialog(this, "좋아하는 영화는?");
		System.out.println("영화"+movie);
		
	}

	public static void main(String[] args) {
		new DialogTest();

	}
}
