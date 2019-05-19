package com.milk.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
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
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 20, 350, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		
		inputLabel = new JLabel("원하시는 금액을 투입해 주세요");
		inputLabel.setBounds(14, 12, 404, 38);
		contentPane.add(inputLabel);

		input100Btn = new JButton("원 투입");
		input100Btn.setFont(new Font("고딕", Font.BOLD,30));
		input100Btn.setBounds(15, 60, 300, 100);
		input100Btn.setBackground(SystemColor.activeCaptionBorder);
		input100Btn.setIcon(new ImageIcon("src/image/100원.png"));
		input100Btn.setBorderPainted(false);
		input100Btn.setFocusPainted(false);
		input100Btn.setOpaque(false);
		contentPane.add(input100Btn);

		input500Btn = new JButton("원 투입");
		input500Btn.setFont(new Font("고딕", Font.BOLD,30));
		input500Btn.setBounds(15, 200, 300, 100);
		input500Btn.setBackground(SystemColor.activeCaptionBorder);
		input500Btn.setIcon(new ImageIcon("src/image/500원.png"));
		input500Btn.setBorderPainted(false);
		input500Btn.setFocusPainted(false);
		input500Btn.setOpaque(false);
		contentPane.add(input500Btn);

		input1000Btn = new JButton("원 투입");
		input1000Btn.setFont(new Font("고딕", Font.BOLD,30));
		input1000Btn.setBounds(15, 340, 300, 100);
		input1000Btn.setBackground(SystemColor.activeCaptionBorder);
		input1000Btn.setIcon(new ImageIcon("src/image/1000원.png"));
		input1000Btn.setBorderPainted(false);
		input1000Btn.setFocusPainted(false);
		input1000Btn.setOpaque(false);
		contentPane.add(input1000Btn);

//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
