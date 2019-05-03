package com.encore.gui0429;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest extends JFrame{

	JButton bt;
	
	public SwingTest() {
	   setTitle("Swing테스트");
	   
	   bt = new JButton("<html><font size=20 color=blue face=궁서체>나버튼</font></html>");
	   
	   setLayout(new FlowLayout());
	   add(bt);
	   
	   setSize(300,300);
	   setVisible(true);
	   //만약 프레임 우측상단의 X버튼클릭시 프로그램 종료만 할 것이라면 아래의 코드 사용!!
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   //X버튼에 기능 부여할 것이면 addWindowListener() 사용!!
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}

}






