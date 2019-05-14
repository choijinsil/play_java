package com.milk.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MMainView extends JFrame {

	public JPanel contentPane;
	public JTextField pPriceField_1, pPriceField_2, pPriceField_3, pPriceField_4, pPriceField_5, pPriceField_6, pPriceField_7, pPriceField_8, pPriceField_9;

	public JTextField textField;
	public JTextArea moneyDisplayArea;

	// 키패드 표시창, 키버튼, 확인, 취소버튼 (0번은 제거예정)
	public JTextArea keyDisplayArea;
	public JButton keypadBtn_1, keypadBtn_2, keypadBtn_3, keypadBtn_4, keypadBtn_5, keypadBtn_6, keypadBtn_7, keypadBtn_8, keypadBtn_9, keypadBtn_OK;

	// 상품 이미지 라벨
	public JLabel pImgLabel_1, pImgLabel_2, pImgLabel_3, pImgLabel_4, pImgLabel_5, pImgLabel_16;
	public JLabel pImgLabel_7, pImgLabel_8, pImgLabel_9;

	// 투입구
	public JButton moneyInputBtn;
	// 열쇠 , 관리자 버튼
	public JButton adminBtn;
	// 반환구 버튼
	public JButton returnBtn;
	// 제품출구
	public JButton productOutBtn;
	// 판매가능,불가능 디스플레이 창
	public JLabel saleOkLabel, saleNoLabel;
	
	public JPanel productOutPanel;
	public JScrollPane scrollP;
	
	public JLabel lblPaneimg;
	public JLabel priceTagLabel1, priceTagLabel2, priceTagLabel3, priceTagLabel4, priceTagLabel5, priceTagLabel6, priceTagLabel7, priceTagLabel8, priceTagLabel9;
	public JLabel label_4;
	public JLabel label_5;

	public MMainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 700, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		


		// 1번
		
		pImgLabel_1 = new JLabel("");
		pImgLabel_1.setBounds(70, 140, 68, 84);
		pImgLabel_1.setOpaque(false);
		pImgLabel_1.setIcon(new ImageIcon("image/milk/딸기우유.png"));
		contentPane.add(pImgLabel_1);

		JButton pNumBtn_1 = new JButton("");
		pNumBtn_1.setBounds(55, 225, 37, 33);
		pNumBtn_1.setIcon(new ImageIcon("image/pNum/수정됨_제품번호1.png"));
		pNumBtn_1.setBorderPainted(false);
		pNumBtn_1.setContentAreaFilled(false); //얘가 버튼 타격감
		pNumBtn_1.setFocusPainted(false); //이거 살릴지 말지(눌렀을 때 테두리)
		pNumBtn_1.setOpaque(false);
		pNumBtn_1.setVisible(true);
		contentPane.add(pNumBtn_1);

		JLabel pNameLabel_1 = new JLabel("");
		pNameLabel_1.setIcon(new ImageIcon("image/pNameLabel/이름딸기.png"));
		pNameLabel_1.setBounds(90, 225, 90, 33);
		contentPane.add(pNameLabel_1);

		pPriceField_1 = new JTextField();
		pPriceField_1.setText("가격표필드");
		pPriceField_1.setBounds(80, 270, 76, 20);
		pPriceField_1.setOpaque(false);
		pPriceField_1.setBorder(null);
		contentPane.add(pPriceField_1);
		pPriceField_1.setColumns(10);
		pPriceField_1.setEditable(false);

		// 2번
		JLabel pImgLabel_2 = new JLabel("상품이미지(라벨)");
		pImgLabel_2.setIcon(new ImageIcon("image/milk/초코우유.png"));
		pImgLabel_2.setBounds(205, 140, 68, 84);
		contentPane.add(pImgLabel_2);

		JButton pNumBtn_2 = new JButton("");
		pNumBtn_2.setBounds(181, 225, 30, 30);
		pNumBtn_2.setIcon(new ImageIcon("image/pNum/수정됨_제품번호2.png"));
		pNumBtn_2.setBorderPainted(false);
		pNumBtn_2.setContentAreaFilled(false);
		pNumBtn_2.setFocusPainted(false);
		pNumBtn_2.setOpaque(false);
		pNumBtn_2.setVisible(true);
		contentPane.add(pNumBtn_2);

		JLabel pNameLabel_2 = new JLabel("");
		pNameLabel_2.setIcon(new ImageIcon("image/pNameLabel/이름초코.png"));
		pNameLabel_2.setBounds(217, 225, 90, 33);
		contentPane.add(pNameLabel_2);

		pPriceField_2 = new JTextField();
		pPriceField_2.setText("가격표필드");
		pPriceField_2.setBounds(200, 270, 76, 20);
		pPriceField_2.setOpaque(false);
		pPriceField_2.setBorder(null);
		contentPane.add(pPriceField_2);
		pPriceField_2.setColumns(10);
		pPriceField_2.setEditable(false);

		// 3번
		JLabel pImgLabel_3 = new JLabel("상품이미지(라벨)");
		pImgLabel_3.setIcon(new ImageIcon("image/milk/메론우유.png"));
		pImgLabel_3.setBounds(340, 140, 68, 84);
		contentPane.add(pImgLabel_3);

		JButton pNumBtn_3 = new JButton("");
		pNumBtn_3.setBounds(308, 225, 30, 30);
		pNumBtn_3.setIcon(new ImageIcon("image/pNum/수정됨_제품번호3.png"));
		pNumBtn_3.setBorderPainted(false);
		pNumBtn_3.setContentAreaFilled(false);
		pNumBtn_3.setFocusPainted(false);
		pNumBtn_3.setOpaque(false);
		pNumBtn_3.setVisible(true);
		contentPane.add(pNumBtn_3);

		JLabel pNameLabel_3 = new JLabel("");
		pNameLabel_3.setIcon(new ImageIcon("image/pNameLabel/이름메론.png"));
		pNameLabel_3.setBounds(335, 225, 90, 33);
		contentPane.add(pNameLabel_3);

		pPriceField_3 = new JTextField();
		pPriceField_3.setText("가격표필드");
		pPriceField_3.setBounds(325, 270, 76, 20);
		pPriceField_3.setOpaque(false);
		pPriceField_3.setBorder(null);
		contentPane.add(pPriceField_3);
		pPriceField_3.setColumns(10);
		pPriceField_3.setEditable(false);
		
		// 4번
		JLabel pImgLabel_4 = new JLabel("상품이미지(라벨)");
		pImgLabel_4.setIcon(new ImageIcon("image/milk/흰우유.png"));
		pImgLabel_4.setBounds(70, 320, 68, 84);
		contentPane.add(pImgLabel_4);

		JButton pNumBtn_4 = new JButton("");
		pNumBtn_4.setBounds(55, 405, 30, 30);
		pNumBtn_4.setIcon(new ImageIcon("image/pNum/수정됨_제품번호4.png"));
		pNumBtn_4.setBorderPainted(false);
		pNumBtn_4.setContentAreaFilled(false);
		pNumBtn_4.setFocusPainted(false);
		pNumBtn_4.setOpaque(false);
		pNumBtn_4.setVisible(true);
		contentPane.add(pNumBtn_4);

		JLabel pNameLabel_4 = new JLabel("");
		pNameLabel_4.setIcon(new ImageIcon("image/pNameLabel/이름흰.png"));
		pNameLabel_4.setBounds(90, 405, 90, 33);
		contentPane.add(pNameLabel_4);

		pPriceField_4 = new JTextField();
		pPriceField_4.setText("가격표필드");
		pPriceField_4.setBounds(80, 450, 76, 20);
		pPriceField_4.setOpaque(false);
		pPriceField_4.setBorder(null);
		contentPane.add(pPriceField_4);
		pPriceField_4.setColumns(10);
		pPriceField_4.setEditable(false);

		// 5번
		JLabel pImgLabel_5 = new JLabel("상품이미지(라벨)");
		pImgLabel_5.setIcon(new ImageIcon("image/milk/귤우유.png"));
		pImgLabel_5.setBounds(205, 320, 68, 84);
		contentPane.add(pImgLabel_5);

		JButton pNumBtn_5 = new JButton("");
		pNumBtn_5.setBounds(181, 405, 30, 30);
		pNumBtn_5.setIcon(new ImageIcon("image/pNum/수정됨_제품번호5.png"));
		pNumBtn_5.setBorderPainted(false);
		pNumBtn_5.setContentAreaFilled(false);
		pNumBtn_5.setFocusPainted(false);
		pNumBtn_5.setOpaque(false);
		pNumBtn_5.setVisible(true);
		contentPane.add(pNumBtn_5);

		JLabel pNameLabel_5 = new JLabel("");
		pNameLabel_5.setIcon(new ImageIcon("image/pNameLabel/이름귤.png"));
		pNameLabel_5.setBounds(215, 405, 90, 33);
		contentPane.add(pNameLabel_5);

		pPriceField_5 = new JTextField();
		pPriceField_5.setText("가격표필드");
		pPriceField_5.setBounds(205, 450, 76, 20);
		pPriceField_5.setOpaque(false);
		pPriceField_5.setBorder(null);
		contentPane.add(pPriceField_5);
		pPriceField_5.setColumns(10);
		pPriceField_5.setEditable(false);
		
		// 6번
		JLabel pImgLabel_6 = new JLabel("상품이미지(라벨)");
		pImgLabel_6.setIcon(new ImageIcon("image/milk/커피우유.png"));
		pImgLabel_6.setBounds(340, 320, 68, 84);
		contentPane.add(pImgLabel_6);

		JButton pNumBtn_6 = new JButton("");
		pNumBtn_6.setBounds(308, 405, 30, 30);
		pNumBtn_6.setIcon(new ImageIcon("image/pNum/수정됨_제품번호6.png"));
		pNumBtn_6.setBorderPainted(false);
		pNumBtn_6.setContentAreaFilled(false);
		pNumBtn_6.setFocusPainted(false);
		pNumBtn_6.setOpaque(false);
		pNumBtn_6.setVisible(true);
		contentPane.add(pNumBtn_6);

		JLabel pNameLabel_6 = new JLabel("");
		pNameLabel_6.setIcon(new ImageIcon("image/pNameLabel/이름커피.png"));
		pNameLabel_6.setBounds(348, 405, 90, 33);
		contentPane.add(pNameLabel_6);

		pPriceField_6 = new JTextField();
		pPriceField_6.setText("가격표필드");
		pPriceField_6.setBounds(332, 450, 76, 20);
		pPriceField_6.setOpaque(false);
		pPriceField_6.setBorder(null);
		contentPane.add(pPriceField_6);
		pPriceField_6.setColumns(10);
		pPriceField_6.setEditable(false);

		// 7번
		JLabel pImgLabel_7 = new JLabel("상품이미지(라벨)");
		pImgLabel_7.setIcon(new ImageIcon("image/milk/바나나우유.png"));
		pImgLabel_7.setBounds(70, 500, 68, 84);
		contentPane.add(pImgLabel_7);

		JButton pNumBtn_7 = new JButton("");
		pNumBtn_7.setBounds(55, 585, 30, 30);
		pNumBtn_7.setIcon(new ImageIcon("image/pNum/수정됨_제품번호7.png"));
		pNumBtn_7.setBorderPainted(false);
		pNumBtn_7.setContentAreaFilled(false);
		pNumBtn_7.setFocusPainted(false);
		pNumBtn_7.setOpaque(false);
		pNumBtn_7.setVisible(true);
		contentPane.add(pNumBtn_7);

		JLabel pNameLabel_7 = new JLabel("");
		pNameLabel_7.setIcon(new ImageIcon("image/pNameLabel/이름바나나.png"));
		pNameLabel_7.setBounds(86, 582, 90, 33);
		contentPane.add(pNameLabel_7);

		pPriceField_7 = new JTextField();
		pPriceField_7.setText("가격표필드");
		pPriceField_7.setBounds(79, 627, 76, 20);
		pPriceField_7.setOpaque(false);
		pPriceField_7.setBorder(null);
		contentPane.add(pPriceField_7);
		pPriceField_7.setColumns(10);
		pPriceField_7.setEditable(false);
				
		// 8번
		JLabel pImgLabel_8 = new JLabel("상품이미지(라벨)");
		pImgLabel_8.setIcon(new ImageIcon("image/milk/오디우유.png"));
		pImgLabel_8.setBounds(205, 500, 68, 84);
		contentPane.add(pImgLabel_8);

		JButton pNumBtn_8 = new JButton("");
		pNumBtn_8.setBounds(181, 585, 30, 30);
		pNumBtn_8.setIcon(new ImageIcon("image/pNum/수정됨_제품번호8.png"));
		pNumBtn_8.setBorderPainted(false);
		pNumBtn_8.setContentAreaFilled(false);
		pNumBtn_8.setFocusPainted(false);
		pNumBtn_8.setOpaque(false);
		pNumBtn_8.setVisible(true);
		contentPane.add(pNumBtn_8);

		JLabel pNameLabel_8 = new JLabel("");
		pNameLabel_8.setIcon(new ImageIcon("image/pNameLabel/이름오디.png"));
		pNameLabel_8.setBounds(215, 585, 90, 33);
		contentPane.add(pNameLabel_8);

		pPriceField_8 = new JTextField();
		pPriceField_8.setText("가격표필드");
		pPriceField_8.setBounds(205, 627, 76, 20);
		pPriceField_8.setOpaque(false);
		pPriceField_8.setBorder(null);
		contentPane.add(pPriceField_8);
		pPriceField_8.setColumns(10);
		pPriceField_8.setEditable(false);

		// 9번
		JLabel pImgLabel_9 = new JLabel("상품이미지(라벨)");
		pImgLabel_9.setIcon(new ImageIcon("image/milk/복숭아우유.png"));
		pImgLabel_9.setBounds(340, 500, 68, 84);
		contentPane.add(pImgLabel_9);

		JButton pNumBtn_9 = new JButton("");
		pNumBtn_9.setBounds(308, 585, 30, 30);
		pNumBtn_9.setIcon(new ImageIcon("image/pNum/수정됨_제품번호9.png"));
		pNumBtn_9.setBorderPainted(false);
		pNumBtn_9.setContentAreaFilled(false);
		pNumBtn_9.setFocusPainted(false);
		pNumBtn_9.setOpaque(false);
		pNumBtn_9.setVisible(true);
		contentPane.add(pNumBtn_9);

		JLabel pNameLabel_9 = new JLabel("");
		pNameLabel_9.setIcon(new ImageIcon("image/pNameLabel/이름복숭아.png"));
		pNameLabel_9.setBounds(340, 585, 90, 33);
		contentPane.add(pNameLabel_9);

		pPriceField_9 = new JTextField();
		pPriceField_9.setText("가격표필드");
		pPriceField_9.setBounds(332, 627, 76, 20);
		pPriceField_9.setOpaque(false);
		pPriceField_9.setBorder(null);
		contentPane.add(pPriceField_9);
		pPriceField_9.setColumns(10);
		pPriceField_9.setEditable(false);
		
		// ==========================================상품정보 끝

		// 자판기 로고
		JLabel logoLabel = new JLabel("자판기 로고");
		logoLabel.setIcon(new ImageIcon("image/조이름.png"));
		logoLabel.setBounds(463, 53, 178, 61);
		contentPane.add(logoLabel);

		// 키패드 디스플레이
		keyDisplayArea = new JTextArea();
		//keyDisplayArea.setText("입력창"); // 입력창
		keyDisplayArea.setBounds(500, 156, 76, 30);
		keyDisplayArea.setOpaque(false);
		keyDisplayArea.setBorder(null);
		contentPane.add(keyDisplayArea);
		keyDisplayArea.setEditable(false);

		// 키패드
		keypadBtn_1 = new JButton("");
		keypadBtn_1.setBounds(460, 220, 50, 50);
		keypadBtn_1.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_1.setIcon(new ImageIcon("image/button/버튼1.png"));
		keypadBtn_1.setBorderPainted(false);
		keypadBtn_1.setFocusPainted(false);
		keypadBtn_1.setOpaque(false);
		contentPane.add(keypadBtn_1);

		keypadBtn_2 = new JButton("");
		keypadBtn_2.setBounds(520, 220, 50, 50);
		keypadBtn_2.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_2.setIcon(new ImageIcon("image/button/버튼2.png"));
		keypadBtn_2.setBorderPainted(false);
		keypadBtn_2.setFocusPainted(false);
		keypadBtn_2.setOpaque(false);
		contentPane.add(keypadBtn_2);

		keypadBtn_3 = new JButton("");
		keypadBtn_3.setBounds(580, 220, 50, 50);
		keypadBtn_3.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_3.setIcon(new ImageIcon("image/button/버튼3.png"));
		keypadBtn_3.setBorderPainted(false);
		keypadBtn_3.setFocusPainted(false);
		keypadBtn_3.setOpaque(false);
		contentPane.add(keypadBtn_3);

		keypadBtn_4 = new JButton("");
		keypadBtn_4.setBounds(460, 280, 50, 50);
		keypadBtn_4.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_4.setIcon(new ImageIcon("image/button/버튼4.png"));
		keypadBtn_4.setBorderPainted(false);
		keypadBtn_4.setFocusPainted(false);
		keypadBtn_4.setOpaque(false);
		contentPane.add(keypadBtn_4);

		keypadBtn_5 = new JButton("");
		keypadBtn_5.setBounds(520, 280, 50, 50);
		keypadBtn_5.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_5.setIcon(new ImageIcon("image/button/버튼5.png"));
		keypadBtn_5.setBorderPainted(false);
		keypadBtn_5.setFocusPainted(false);
		keypadBtn_5.setOpaque(false);
		contentPane.add(keypadBtn_5);

		keypadBtn_6 = new JButton("");
		keypadBtn_6.setBounds(580, 280, 50, 50);
		keypadBtn_6.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_6.setIcon(new ImageIcon("image/button/버튼6.png"));
		keypadBtn_6.setBorderPainted(false);
		keypadBtn_6.setFocusPainted(false);
		keypadBtn_6.setOpaque(false);
		contentPane.add(keypadBtn_6);

		keypadBtn_7 = new JButton("");
		keypadBtn_7.setBounds(460, 340, 50, 50);
		keypadBtn_7.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_7.setIcon(new ImageIcon("image/button/버튼7.png"));
		keypadBtn_7.setBorderPainted(false);
		keypadBtn_7.setFocusPainted(false);
		keypadBtn_7.setOpaque(false);
		contentPane.add(keypadBtn_7);

		keypadBtn_8 = new JButton("");
		keypadBtn_8.setBounds(520, 340, 50, 58);
		keypadBtn_8.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_8.setIcon(new ImageIcon("image/button/버튼8.png"));
		keypadBtn_8.setBorderPainted(false);
		keypadBtn_8.setFocusPainted(false);
		keypadBtn_8.setOpaque(false);
		contentPane.add(keypadBtn_8);

		keypadBtn_9 = new JButton("");
		keypadBtn_9.setBounds(580, 340, 50, 50);
		keypadBtn_9.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_9.setIcon(new ImageIcon("image/button/버튼9.png"));
		keypadBtn_9.setBorderPainted(false);
		keypadBtn_9.setFocusPainted(false);
		keypadBtn_9.setOpaque(false);
		contentPane.add(keypadBtn_9);

		keypadBtn_OK = new JButton("");
		keypadBtn_OK.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_OK.setIcon(new ImageIcon("image/확인.png"));
		keypadBtn_OK.setBounds(483, 398, 108, 60);
		keypadBtn_OK.setBorderPainted(false);
		keypadBtn_OK.setFocusPainted(false);
		keypadBtn_OK.setOpaque(false);
		keypadBtn_OK.setEnabled(false);
		contentPane.add(keypadBtn_OK);
		
		// =================================키패드 끝

		// 판매가능,불가능 디스플레이 창
//		saleLabel = new JLabel("");
//		saleLabel.setIcon(new ImageIcon("image/\uD310\uB9E4\uAC00\uB2A5.png"));
//		saleLabel.setForeground(Color.DARK_GRAY);
//		saleLabel.setBackground(Color.DARK_GRAY);
//		saleLabel.setBounds(483, 460, 135, 45);
//		contentPane.add(saleLabel);

		// 판매가능,불가능 디스플레이 창
		saleOkLabel = new JLabel(new ImageIcon("image/판매가능.png"));
		saleOkLabel.setIcon(new ImageIcon("image/판매가능.png"));
		saleOkLabel.setForeground(Color.DARK_GRAY);
		saleOkLabel.setBackground(Color.DARK_GRAY);
		saleOkLabel.setBounds(460, 460, 170, 40);
		contentPane.add(saleOkLabel);
		
		saleNoLabel = new JLabel(new ImageIcon("image/판매불가.png"));
		saleNoLabel.setIcon(new ImageIcon("image/판매불가.png"));
		saleNoLabel.setForeground(Color.DARK_GRAY);
		saleNoLabel.setBackground(Color.DARK_GRAY);
		saleNoLabel.setBounds(460, 460, 170, 40);
		contentPane.add(saleNoLabel);
		
		// 금액 디스플레이 창
		moneyDisplayArea = new JTextArea();
		//moneyDisplayArea.setText("금액 디스플레이 창");
		moneyDisplayArea.setBounds(483, 525, 135, 33);
		moneyDisplayArea.setOpaque(false);
		moneyDisplayArea.setBorder(null);
		contentPane.add(moneyDisplayArea);
		moneyDisplayArea.setEditable(false);

		
		// 투입구 버튼
		moneyInputBtn = new JButton("");
		moneyInputBtn.setBackground(SystemColor.activeCaptionBorder);
		moneyInputBtn.setIcon(new ImageIcon("image/돈투입.png"));
		moneyInputBtn.setBounds(463, 574, 178, 49);
		moneyInputBtn.setBorderPainted(false);
		moneyInputBtn.setFocusPainted(false);
		moneyInputBtn.setOpaque(false);
		contentPane.add(moneyInputBtn);

		// 열쇠 , 관리자 버튼
		adminBtn = new JButton("");
		adminBtn.setBackground(SystemColor.activeCaptionBorder);
		adminBtn.setIcon(new ImageIcon("image/관리자모드.png"));
		adminBtn.setBounds(463, 627, 50, 122);
		adminBtn.setOpaque(false);
		adminBtn.setBorder(null);
		contentPane.add(adminBtn);

		// 반환구 버튼
		returnBtn = new JButton("");
		returnBtn.setBackground(SystemColor.activeCaptionBorder);
		returnBtn.setIcon(new ImageIcon("image/잔돈반환.png"));
		returnBtn.setBounds(519, 626, 121, 122);
		returnBtn.setOpaque(false);
		returnBtn.setBorder(null);
		contentPane.add(returnBtn);

		
		
		// 제품출구
		  JLabel outLabel = new JLabel();
		  JPanel outPanel = new JPanel();
		  outPanel.setLayout(null);
		  outPanel.setOpaque(false);
		  outPanel.setBounds(39, 751, 597, 170);
		  outLabel.setBounds(0, 0, 597, 170);
		  outLabel.setIcon(new ImageIcon("image/제품출구.png"));
		  outLabel.setOpaque(false);
		  
		  
		  productOutPanel = new JPanel();
		  productOutPanel.setLayout(new FlowLayout(0));
		  productOutPanel.setVisible(false);
		  productOutPanel.setSize(597, 170);
		  productOutPanel.setOpaque(false);
		  scrollP = new JScrollPane(productOutPanel);
		  
		  scrollP.setOpaque(false);
		  scrollP.setBorder(BorderFactory.createEmptyBorder());
		  scrollP.getViewport().setOpaque(false);
		  scrollP.setVisible(true);
		  scrollP.setBounds(0, 40, 400, 140);
		  outPanel.add(outLabel,1,0);
		  outPanel.add(scrollP,2,0);
		  contentPane.add(outPanel);
  
		
		
		priceTagLabel1 = new JLabel("");
		priceTagLabel1.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel1.setBounds(65, 260, 100, 45);
		contentPane.add(priceTagLabel1);
		
		priceTagLabel2 = new JLabel("");
		priceTagLabel2.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel2.setBounds(190, 260, 100, 45);
		contentPane.add(priceTagLabel2);
		
		priceTagLabel3 = new JLabel("");
		priceTagLabel3.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel3.setBounds(315, 260, 100, 45);
		contentPane.add(priceTagLabel3);
		

		priceTagLabel4 = new JLabel("");
		priceTagLabel4.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel4.setBounds(70, 440, 100, 45);
		contentPane.add(priceTagLabel4);
		
		priceTagLabel5 = new JLabel("");
		priceTagLabel5.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel5.setBounds(195, 440, 100, 45);
		contentPane.add(priceTagLabel5);
		
		priceTagLabel6 = new JLabel("");
		priceTagLabel6.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel6.setBounds(320, 440, 100, 45);
		contentPane.add(priceTagLabel6);
		
		priceTagLabel7 = new JLabel("");
		priceTagLabel7.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel7.setBounds(70, 615, 100, 45);
		contentPane.add(priceTagLabel7);
		
		priceTagLabel8 = new JLabel("");
		priceTagLabel8.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel8.setBounds(195, 615, 100, 45);
		contentPane.add(priceTagLabel8);
		
		priceTagLabel9 = new JLabel("");
		priceTagLabel9.setIcon(new ImageIcon("image/제품가격.png"));
		priceTagLabel9.setBounds(320, 615, 100, 45);
		contentPane.add(priceTagLabel9);
		

		//선택한 제품
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("image/선택한제품.png"));
		label_4.setBounds(467, 126, 170, 84);
		contentPane.add(label_4);
		
		//투입한 금액
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("image/투입한금액.png"));
		label_5.setBounds(452, 495, 200, 80);
		contentPane.add(label_5);

		
		//메인판넬 이미지 넣은것 항상 맨 밑에 둘것 !!!!!!!!!!!!!
		lblPaneimg = new JLabel("paneImg");
		lblPaneimg.setBackground(SystemColor.activeCaption);
		lblPaneimg.setIcon(new ImageIcon("image/mainPane.png"));
		lblPaneimg.setBounds(0, 10, 684, 961);
		contentPane.add(lblPaneimg);
		

		
		setVisible(true);
	}
}