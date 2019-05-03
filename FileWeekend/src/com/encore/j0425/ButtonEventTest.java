package com.encore.j0425;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventTest extends Frame implements ActionListener {
	Button btn1, btn2;

	public ButtonEventTest() {
		setLayout(new FlowLayout());

		btn1 = new Button("¾È³ç?");
		btn2 = new Button("Àß°¡!");

		add(btn1);
		add(btn2);

		setSize(300, 300);
		setVisible(true);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	public static void main(String[] args) {
		new ButtonEventTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand());	//¾È³ç
		System.out.println(e.getSource());	//java.awt.Button[button0,104,43,45x23,label=¾È³ç?]

		if (btn1.hasFocus()) {
			System.out.println("¾È³ç ~~!!");
		} else if (btn2.hasFocus()) {
			System.out.println("Àß°¡ ~~!!");
		}

	}

}
