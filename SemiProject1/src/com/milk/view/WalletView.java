package com.milk.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WalletView extends JFrame {
	int intervalY = 140; // Y축 간격
	public JPanel contentPane;
	public JLabel inputLabel;
	public JButton input100Btn;
	public JButton input500Btn;
	public JButton input1000Btn;

	public WalletView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 20, 350, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		inputLabel = new JLabel("원하시는 금액을 투입해 주세요");
		inputLabel.setBounds(14, 12, 404, 38);
		contentPane.add(inputLabel);

		input100Btn = new JButton("100원 투입");
		input100Btn.setBounds(15, 60, 300, 100);
		contentPane.add(input100Btn);

		input500Btn = new JButton("500원 투입");
		input500Btn.setBounds(15, 200, 300, 100);
		contentPane.add(input500Btn);

		input1000Btn = new JButton("1000원 투입");
		input1000Btn.setBounds(15, 340, 300, 100);
		contentPane.add(input1000Btn);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
