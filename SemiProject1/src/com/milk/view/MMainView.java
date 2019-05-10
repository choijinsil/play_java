package com.milk.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class MMainView extends JFrame
{

	public JPanel contentPane;
	public JTextField pPriceField_1, pPriceField_2, pPriceField_3, pPriceField_4, pPriceField_5, pPriceField_6, pPriceField_7, pPriceField_8, pPriceField_9;
	public JTextField textField;
	public JTextArea moneyDisplayArea;
	public MMainView()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 700, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 1번
		JLabel pImgLabel_1 = new JLabel("상품이미지(라벨)");
		pImgLabel_1.setBounds(40, 90, 100, 140);
		contentPane.add(pImgLabel_1);
		
		JButton pNumBtn_1 = new JButton("1번");
		pNumBtn_1.setBounds(40, 230, 30, 30);
		contentPane.add(pNumBtn_1);	
		
		JLabel pNameLabel_1 = new JLabel("제품명라벨");
		pNameLabel_1.setBounds(80, 230, 70, 30);
		contentPane.add(pNameLabel_1);
		
		pPriceField_1 = new JTextField();
		pPriceField_1.setText("가격표필드");
		pPriceField_1.setBounds(40, 260, 100, 20);
		contentPane.add(pPriceField_1);
		pPriceField_1.setColumns(10);
		
		//2번
		JLabel pImgLabel_2 = new JLabel("상품이미지(라벨)");
		pImgLabel_2.setBounds(190, 90, 100, 140);
		contentPane.add(pImgLabel_2);
		
		JButton pNumBtn_2 = new JButton("2번");
		pNumBtn_2.setBounds(190, 230, 30, 30);
		contentPane.add(pNumBtn_2);
		
		JLabel pNameLabel_2 = new JLabel("제품명라벨");
		pNameLabel_2.setBounds(230, 230, 70, 30);
		contentPane.add(pNameLabel_2);
		
		pPriceField_2 = new JTextField();
		pPriceField_2.setText("가격표필드");
		pPriceField_2.setBounds(190, 260, 100, 20);
		contentPane.add(pPriceField_2);
		pPriceField_2.setColumns(10);	
		
		//3번
		JLabel pImgLabel_3 = new JLabel("상품이미지(라벨)");
		pImgLabel_3.setBounds(340, 90, 100, 140);
		contentPane.add(pImgLabel_3);
		
		JButton pNumBtn_3 = new JButton("2번");
		pNumBtn_3.setBounds(340, 230, 30, 30);
		contentPane.add(pNumBtn_3);
		
		JLabel pNameLabel_3 = new JLabel("제품명라벨");
		pNameLabel_3.setBounds(380, 230, 70, 30);
		contentPane.add(pNameLabel_3);
		
		pPriceField_3 = new JTextField();
		pPriceField_3.setText("가격표필드");
		pPriceField_3.setBounds(340, 260, 100, 20);
		contentPane.add(pPriceField_3);
		pPriceField_3.setColumns(10);	
		
		//4번
		JLabel pImgLabel_4 = new JLabel("상품이미지(라벨)");
		pImgLabel_4.setBounds(40, 330, 100, 140);
		contentPane.add(pImgLabel_4);
		
		JButton pNumBtn_4 = new JButton("2번");
		pNumBtn_4.setBounds(40, 470, 30, 30);
		contentPane.add(pNumBtn_4);
		
		JLabel pNameLabel_4 = new JLabel("제품명라벨");
		pNameLabel_4.setBounds(80, 470, 70, 30);
		contentPane.add(pNameLabel_4);
		
		pPriceField_4 = new JTextField();
		pPriceField_4.setText("가격표필드");
		pPriceField_4.setBounds(40, 500, 100, 20);
		contentPane.add(pPriceField_4);
		pPriceField_4.setColumns(10);	
		
		//5번
		JLabel pImgLabel_5 = new JLabel("상품이미지(라벨)");
		pImgLabel_5.setBounds(190, 330, 100, 140);
		contentPane.add(pImgLabel_5);
		
		JButton pNumBtn_5 = new JButton("2번");
		pNumBtn_5.setBounds(190, 470, 30, 30);
		contentPane.add(pNumBtn_5);
		
		JLabel pNameLabel_5 = new JLabel("제품명라벨");
		pNameLabel_5.setBounds(230, 470, 70, 30);
		contentPane.add(pNameLabel_5);
		
		pPriceField_5 = new JTextField();
		pPriceField_5.setText("가격표필드");
		pPriceField_5.setBounds(190, 500, 100, 20);
		contentPane.add(pPriceField_5);
		pPriceField_5.setColumns(10);	
		
		//6번
		JLabel pImgLabel_6 = new JLabel("상품이미지(라벨)");
		pImgLabel_6.setBounds(340, 330, 100, 140);
		contentPane.add(pImgLabel_6);
		
		JButton pNumBtn_6 = new JButton("2번");
		pNumBtn_6.setBounds(340	, 470, 30, 30);
		contentPane.add(pNumBtn_6);
		
		JLabel pNameLabel_6 = new JLabel("제품명라벨");
		pNameLabel_6.setBounds(380, 470, 70, 30);
		contentPane.add(pNameLabel_6);
		
		pPriceField_6 = new JTextField();
		pPriceField_6.setText("가격표필드");
		pPriceField_6.setBounds(340, 500, 100, 20);
		contentPane.add(pPriceField_6);
		pPriceField_6.setColumns(10);	
		
		//7번
		JLabel pImgLabel_7 = new JLabel("상품이미지(라벨)");
		pImgLabel_7.setBounds(40, 570, 100, 140);
		contentPane.add(pImgLabel_7);
		
		JButton pNumBtn_7 = new JButton("2번");
		pNumBtn_7.setBounds(40, 710, 30, 30);
		contentPane.add(pNumBtn_7);
		
		JLabel pNameLabel_7 = new JLabel("제품명라벨");
		pNameLabel_7.setBounds(80, 710, 70, 30);
		contentPane.add(pNameLabel_7);
		
		pPriceField_7 = new JTextField();
		pPriceField_7.setText("가격표필드");
		pPriceField_7.setBounds(40, 740, 100, 20);
		contentPane.add(pPriceField_7);
		pPriceField_7.setColumns(10);	
		
		//8번
		JLabel pImgLabel_8 = new JLabel("상품이미지(라벨)");
		pImgLabel_8.setBounds(190, 570, 100, 140);
		contentPane.add(pImgLabel_8);
		
		JButton pNumBtn_8 = new JButton("2번");
		pNumBtn_8.setBounds(190, 710, 30, 30);
		contentPane.add(pNumBtn_8);
		
		JLabel pNameLabel_8 = new JLabel("제품명라벨");
		pNameLabel_8.setBounds(230, 710, 70, 30);
		contentPane.add(pNameLabel_8);
		
		pPriceField_8 = new JTextField();
		pPriceField_8.setText("가격표필드");
		pPriceField_8.setBounds(190, 740, 100, 20);
		contentPane.add(pPriceField_8);
		pPriceField_8.setColumns(10);	
		
		//9번
		JLabel pImgLabel_9 = new JLabel("상품이미지(라벨)");
		pImgLabel_9.setBounds(340, 570, 100, 140);
		contentPane.add(pImgLabel_9);
		
		JButton pNumBtn_9 = new JButton("2번");
		pNumBtn_9.setBounds(340, 710, 30, 30);
		contentPane.add(pNumBtn_9);
		
		JLabel pNameLabel_9 = new JLabel("제품명라벨");
		pNameLabel_9.setBounds(380, 710, 70, 30);
		contentPane.add(pNameLabel_9);
		
		pPriceField_9 = new JTextField();
		pPriceField_9.setText("가격표필드");
		pPriceField_9.setBounds(340, 740, 100, 20);
		contentPane.add(pPriceField_9);
		pPriceField_9.setColumns(10);		
		//==========================================상품정보 끝
		
		//자판기 로고
		JLabel logoLabel = new JLabel("자판기 로고");
		logoLabel.setBounds(463, 53, 167, 61);
		contentPane.add(logoLabel);
		
		//키패드 디스플레이
		JTextArea keyDisplayArea = new JTextArea();
		keyDisplayArea.setText("\uC785\uB825\uCC3D");
		keyDisplayArea.setBounds(462, 147, 170, 55);
		contentPane.add(keyDisplayArea);

		//키패드
		JButton keypadBtn_1 = new JButton("1");
		keypadBtn_1.setBounds(460, 220, 50, 50);
		contentPane.add(keypadBtn_1);
		
		JButton keypadBtn_2 = new JButton("2");
		keypadBtn_2.setBounds(520, 220, 50, 50);
		contentPane.add(keypadBtn_2);
		
		JButton keypadBtn_3 = new JButton("3");
		keypadBtn_3.setBounds(580, 220, 50, 50);
		contentPane.add(keypadBtn_3);
		
		JButton keypadBtn_4 = new JButton("4");
		keypadBtn_4.setBounds(460, 280, 50, 50);
		contentPane.add(keypadBtn_4);
		
		JButton keypadBtn_5 = new JButton("5");
		keypadBtn_5.setBounds(520, 280, 50, 50);
		contentPane.add(keypadBtn_5);
		
		JButton keypadBtn_6 = new JButton("6");
		keypadBtn_6.setBounds(580, 280, 50, 50);
		contentPane.add(keypadBtn_6);
		
		JButton keypadBtn_7 = new JButton("7");
		keypadBtn_7.setBounds(460, 340, 50, 50);
		contentPane.add(keypadBtn_7);
		
		JButton keypadBtn_8 = new JButton("8");
		keypadBtn_8.setBounds(520, 340, 50, 50);
		contentPane.add(keypadBtn_8);
		
		JButton keypadBtn_9 = new JButton("9");
		keypadBtn_9.setBounds(580, 340, 50, 50);
		contentPane.add(keypadBtn_9);
		
		JButton keypadBtn_OK = new JButton("확인");
		keypadBtn_OK.setBounds(460, 400, 50, 50);
		contentPane.add(keypadBtn_OK);
		
		JButton keypadBtn_0 = new JButton("0");
		keypadBtn_0.setBounds(520, 400, 50, 50);
		contentPane.add(keypadBtn_0);
		
		JButton keypadBtn_Cancel = new JButton("취소");
		keypadBtn_Cancel.setBounds(580, 400, 50, 50);
		contentPane.add(keypadBtn_Cancel);
		//=================================키패드 끝
		
		//판매가능,불가능 디스플레이 창
		JLabel saleLabel = new JLabel("판매가능 디스플레이 창");
		saleLabel.setForeground(Color.DARK_GRAY);
		saleLabel.setBackground(Color.DARK_GRAY);
		saleLabel.setBounds(460, 475, 170, 30);
		contentPane.add(saleLabel);
		
		//금액 디스플레이 창
		moneyDisplayArea = new JTextArea();
		moneyDisplayArea.setText("금액 디스플레이 창");
		moneyDisplayArea.setBounds(460, 515, 170, 33);
		contentPane.add(moneyDisplayArea);
		
		//투입구 버튼
		JButton moneyInputBtn = new JButton("투입구");
		moneyInputBtn.setBounds(456, 560, 178, 49);
		contentPane.add(moneyInputBtn);
		
		//열쇠 , 관리자 버튼
		JButton adminBtn = new JButton("열쇠(관리자 모드 진입)");
		adminBtn.setBounds(457, 619, 76, 122);
		contentPane.add(adminBtn);
		
		//반환구 버튼
		JButton returnBtn = new JButton("반환구 버튼");
		returnBtn.setBounds(545, 618, 89, 122);
		contentPane.add(returnBtn);
		
		//제품출구
		JButton productOutBtn = new JButton("제품 출구 버튼");
		productOutBtn.setBounds(39, 806, 597, 115);
		contentPane.add(productOutBtn);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
