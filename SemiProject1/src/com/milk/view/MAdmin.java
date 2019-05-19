package com.milk.view;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MAdmin extends JFrame {

	public JPanel contentPane;
	public JTextField pPriceField_1, pPriceField_2, pPriceField_3, pPriceField_4, pPriceField_5, pPriceField_6,
			pPriceField_7, pPriceField_8, pPriceField_9;
	public JTextField textField;
	public JTextField pStockField_1;
	public JTextField pStockField_2;
	public JTextField pStockField_3;
	public JTextField pStockField_4;
	public JTextField pStockField_5;
	public JTextField pStockField_6;
	public JTextField pStockField_7;
	public JTextField pStockField_8;
	public JTextField pStockField_9;
	public JButton changeSave,returnBtn, saveFileBtn;
	public JTextArea pSaleDisplayArea;
	public JTextArea tSaleDisplayArea;
	public JTextField coin100Field;
	public JTextField coin500Field;
	public JTextArea todaySaleDisplayArea;

	public MAdmin() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 700, 1000);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 1번
		JLabel pImgLabel_1 = new JLabel("");
		pImgLabel_1.setBounds(40, 90, 100, 140);
		pImgLabel_1.setIcon(new ImageIcon("src/image/milk/딸기우유.png"));
		contentPane.add(pImgLabel_1);

//		JButton pNumBtn_1 = new JButton();
//		pNumBtn_1.setBounds(40, 230, 30, 30);
//		contentPane.add(pNumBtn_1);

		JLabel pNameLabel_1 = new JLabel("딸기우유");
		pNameLabel_1.setBounds(80, 230, 70, 30);
		contentPane.add(pNameLabel_1);

		pPriceField_1 = new JTextField();
		pPriceField_1.setText("가격");
		pPriceField_1.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_1.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_1.setBounds(40, 260, 100, 20);
		contentPane.add(pPriceField_1);
		pPriceField_1.setColumns(10);

		pStockField_1 = new JTextField();
		pStockField_1.setText("재고수량");
		pStockField_1.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_1.setHorizontalAlignment(JTextField.CENTER);
		pStockField_1.setColumns(10);
		pStockField_1.setBounds(40, 283, 100, 20);
		contentPane.add(pStockField_1);
		// 2번
		JLabel pImgLabel_2 = new JLabel("");
		pImgLabel_2.setBounds(190, 90, 100, 140);
		pImgLabel_2.setIcon(new ImageIcon("src/image/milk/초코우유.png"));
		contentPane.add(pImgLabel_2);

//		JButton pNumBtn_2 = new JButton("2bun");
//		pNumBtn_2.setBounds(190, 230, 30, 30);
//		contentPane.add(pNumBtn_2);

		JLabel pNameLabel_2 = new JLabel("초코우유");
		pNameLabel_2.setBounds(230, 230, 70, 30);
		contentPane.add(pNameLabel_2);

		pPriceField_2 = new JTextField();
		pPriceField_2.setText("가격");
		pPriceField_2.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_2.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_2.setBounds(190, 260, 100, 20);
		contentPane.add(pPriceField_2);
		pPriceField_2.setColumns(10);

		pStockField_2 = new JTextField();
		pStockField_2.setText("재고수량");
		pStockField_2.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_2.setHorizontalAlignment(JTextField.CENTER);
		pStockField_2.setColumns(10);
		pStockField_2.setBounds(190, 283, 100, 20);
		contentPane.add(pStockField_2);

		// 3번
		JLabel pImgLabel_3 = new JLabel("");
		pImgLabel_3.setBounds(340, 90, 100, 140);
		pImgLabel_3.setIcon(new ImageIcon("src/image/milk/메론우유.png"));
		contentPane.add(pImgLabel_3);

//		JButton pNumBtn_3 = new JButton("2bun");
//		pNumBtn_3.setBounds(340, 230, 30, 30);
//		contentPane.add(pNumBtn_3);

		JLabel pNameLabel_3 = new JLabel("메론우유");
		pNameLabel_3.setBounds(380, 230, 70, 30);
		contentPane.add(pNameLabel_3);

		pPriceField_3 = new JTextField();
		pPriceField_3.setText("가격");
		pPriceField_3.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_3.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_3.setBounds(340, 260, 100, 20);
		contentPane.add(pPriceField_3);
		pPriceField_3.setColumns(10);

		pStockField_3 = new JTextField();
		pStockField_3.setText("재고수량");
		pStockField_3.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_3.setHorizontalAlignment(JTextField.CENTER);
		pStockField_3.setColumns(10);
		pStockField_3.setBounds(340, 283, 100, 20);
		contentPane.add(pStockField_3);

		// 4번
		JLabel pImgLabel_4 = new JLabel("");
		pImgLabel_4.setBounds(40, 330, 100, 140);
		pImgLabel_4.setIcon(new ImageIcon("src/image/milk/흰우유.png"));
		contentPane.add(pImgLabel_4);

//		JButton pNumBtn_4 = new JButton("2bun");
//		pNumBtn_4.setBounds(40, 470, 30, 30);
//		contentPane.add(pNumBtn_4);

		JLabel pNameLabel_4 = new JLabel("흰우유");
		pNameLabel_4.setBounds(80, 470, 70, 30);
		contentPane.add(pNameLabel_4);

		pPriceField_4 = new JTextField();
		pPriceField_4.setText("가격");
		pPriceField_4.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_4.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_4.setBounds(40, 500, 100, 20);
		contentPane.add(pPriceField_4);
		pPriceField_4.setColumns(10);

		pStockField_4 = new JTextField();
		pStockField_4.setText("재고수량");
		pStockField_4.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_4.setHorizontalAlignment(JTextField.CENTER);
		pStockField_4.setColumns(10);
		pStockField_4.setBounds(40, 523, 100, 20);
		contentPane.add(pStockField_4);

		// 5번
		JLabel pImgLabel_5 = new JLabel("");
		pImgLabel_5.setBounds(190, 330, 100, 140);
		pImgLabel_5.setIcon(new ImageIcon("src/image/milk/귤우유.png"));
		contentPane.add(pImgLabel_5);

//		JButton pNumBtn_5 = new JButton("2bun");
//		pNumBtn_5.setBounds(190, 470, 30, 30);
//		contentPane.add(pNumBtn_5);

		JLabel pNameLabel_5 = new JLabel("귤우유");
		pNameLabel_5.setBounds(230, 470, 70, 30);
		contentPane.add(pNameLabel_5);

		pPriceField_5 = new JTextField();
		pPriceField_5.setText("가격");
		pPriceField_5.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_5.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_5.setBounds(190, 500, 100, 20);
		contentPane.add(pPriceField_5);
		pPriceField_5.setColumns(10);

		pStockField_5 = new JTextField();
		pStockField_5.setText("재고수량");
		pStockField_5.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_5.setHorizontalAlignment(JTextField.CENTER);
		pStockField_5.setColumns(10);
		pStockField_5.setBounds(190, 523, 100, 20);
		contentPane.add(pStockField_5);

		// 6번
		JLabel pImgLabel_6 = new JLabel("");
		pImgLabel_6.setBounds(340, 330, 100, 140);
		pImgLabel_6.setIcon(new ImageIcon("src/image/milk/커피우유.png"));
		contentPane.add(pImgLabel_6);

//		JButton pNumBtn_6 = new JButton("2bun");
//		pNumBtn_6.setBounds(340, 470, 30, 30);
//		contentPane.add(pNumBtn_6);

		JLabel pNameLabel_6 = new JLabel("커피우유");
		pNameLabel_6.setBounds(380, 470, 70, 30);
		contentPane.add(pNameLabel_6);

		pPriceField_6 = new JTextField();
		pPriceField_6.setText("가격");
		pPriceField_6.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_6.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_6.setBounds(340, 500, 100, 20);
		contentPane.add(pPriceField_6);
		pPriceField_6.setColumns(10);

		pStockField_6 = new JTextField();
		pStockField_6.setText("재고수량");
		pStockField_6.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_6.setHorizontalAlignment(JTextField.CENTER);
		pStockField_6.setColumns(10);
		pStockField_6.setBounds(340, 523, 100, 20);
		contentPane.add(pStockField_6);

		// 7번
		JLabel pImgLabel_7 = new JLabel("");
		pImgLabel_7.setBounds(40, 570, 100, 140);
		pImgLabel_7.setIcon(new ImageIcon("src/image/milk/바나나우유.png"));
		contentPane.add(pImgLabel_7);

//		JButton pNumBtn_7 = new JButton("2bun");
//		pNumBtn_7.setBounds(40, 710, 30, 30);
//		contentPane.add(pNumBtn_7);

		JLabel pNameLabel_7 = new JLabel("바나나우유");
		pNameLabel_7.setBounds(80, 710, 70, 30);
		contentPane.add(pNameLabel_7);

		pPriceField_7 = new JTextField();
		pPriceField_7.setText("가격");
		pPriceField_7.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_7.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_7.setBounds(40, 740, 100, 20);
		contentPane.add(pPriceField_7);
		pPriceField_7.setColumns(10);

		pStockField_7 = new JTextField();
		pStockField_7.setText("재고수량");
		pStockField_7.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_7.setHorizontalAlignment(JTextField.CENTER);
		pStockField_7.setColumns(10);
		pStockField_7.setBounds(40, 763, 100, 20);
		contentPane.add(pStockField_7);

		// 8번
		JLabel pImgLabel_8 = new JLabel("");
		pImgLabel_8.setBounds(190, 570, 100, 140);
		pImgLabel_8.setIcon(new ImageIcon("src/image/milk/오디우유.png"));
		contentPane.add(pImgLabel_8);

//		JButton pNumBtn_8 = new JButton("2bun");
//		pNumBtn_8.setBounds(190, 710, 30, 30);
//		contentPane.add(pNumBtn_8);

		JLabel pNameLabel_8 = new JLabel("오디우유");
		pNameLabel_8.setBounds(230, 710, 70, 30);
		contentPane.add(pNameLabel_8);

		pPriceField_8 = new JTextField();
		pPriceField_8.setText("가격");
		pPriceField_8.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_8.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_8.setBounds(190, 740, 100, 20);
		contentPane.add(pPriceField_8);
		pPriceField_8.setColumns(10);

		pStockField_8 = new JTextField();
		pStockField_8.setText("재고수량");
		pStockField_8.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_8.setHorizontalAlignment(JTextField.CENTER);
		pStockField_8.setColumns(10);
		pStockField_8.setBounds(190, 763, 100, 20);
		contentPane.add(pStockField_8);

		// 9번
		JLabel pImgLabel_9 = new JLabel("");
		pImgLabel_9.setBounds(340, 570, 100, 140);
		pImgLabel_9.setIcon(new ImageIcon("src/image/milk/복숭아우유.png"));
		contentPane.add(pImgLabel_9);

//		JButton pNumBtn_9 = new JButton("2bun");
//		pNumBtn_9.setBounds(340, 710, 30, 30);
//		pNumBtn_9.setIcon(new ImageIcon("src/image/pNum/수정됨_제품번호9.png"));
//		contentPane.add(pNumBtn_9);

		JLabel pNameLabel_9 = new JLabel("복숭아우유");
		pNameLabel_9.setBounds(380, 710, 70, 30);
		contentPane.add(pNameLabel_9);

		pPriceField_9 = new JTextField();
		pPriceField_9.setText("가격");
		pPriceField_9.setFont(new Font("고딕", Font.BOLD,18));
		pPriceField_9.setHorizontalAlignment(JTextField.CENTER);
		pPriceField_9.setBounds(340, 740, 100, 20);
		contentPane.add(pPriceField_9);
		pPriceField_9.setColumns(10);

		pStockField_9 = new JTextField();
		pStockField_9.setText("재고수량");
		pStockField_9.setFont(new Font("고딕", Font.BOLD,18));
		pStockField_9.setHorizontalAlignment(JTextField.CENTER);
		pStockField_9.setColumns(10);
		pStockField_9.setBounds(340, 763, 100, 20);
		contentPane.add(pStockField_9);
		// ==========================================상품정보 끝

		// 자판기 로고
		JLabel logoLabel = new JLabel("자판기 로고");
		logoLabel.setIcon(new ImageIcon("src/image/조이름.png"));
		logoLabel.setBounds(463, 33, 178, 61);
		contentPane.add(logoLabel);

		// 정산전 매출
		JLabel todaySaleLabel = new JLabel("정산전 매출");
		todaySaleLabel.setFont(new Font("고딕",Font.BOLD,23));
		todaySaleLabel.setBounds(460, 100, 170, 30);
		contentPane.add(todaySaleLabel);

		// 정산전 매출 디스플레이
		todaySaleDisplayArea = new JTextArea();
		todaySaleDisplayArea.setText("정산전 매출 디스플레이");
		todaySaleDisplayArea.setFont(new Font("고딕",Font.BOLD,18));
		todaySaleDisplayArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		todaySaleDisplayArea.setBounds(460, 140, 170, 55);
		contentPane.add(todaySaleDisplayArea);
		todaySaleDisplayArea.setEditable(false);

		// 총매출
		JLabel tSaleLabel = new JLabel("총매출");
		tSaleLabel.setFont(new Font("고딕",Font.BOLD,23));
		tSaleLabel.setBounds(460, 210, 170, 30);
		contentPane.add(tSaleLabel);

		// 총매출 디스플레이
		tSaleDisplayArea = new JTextArea();
		tSaleDisplayArea.setText("총매출 디스플레이");
		tSaleDisplayArea.setFont(new Font("고딕",Font.BOLD,18));
		tSaleDisplayArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		tSaleDisplayArea.setBounds(460, 250, 170, 55);
		contentPane.add(tSaleDisplayArea);
		tSaleDisplayArea.setEditable(false);

		// 상품별 판매량
		JLabel pSaleLabel = new JLabel("상품별 판매량");
		pSaleLabel.setFont(new Font("고딕",Font.BOLD,23));
		pSaleLabel.setBounds(460, 318, 170, 30);
		contentPane.add(pSaleLabel);
		
		// 상품별 판매량 디스플레이
		pSaleDisplayArea = new JTextArea();
		pSaleDisplayArea.setText("상품별 판매량 디스플레이");
		pSaleDisplayArea.setFont(new Font("고딕",Font.BOLD,18));
		pSaleDisplayArea.setBounds(460, 350, 170, 237);
		contentPane.add(pSaleDisplayArea);
		pSaleDisplayArea.setEditable(false);

//		// 판매가능,불가능 디스플레이 창
//		JLabel stopSaleLabel = new JLabel("판매중지");
//		stopSaleLabel.setForeground(Color.DARK_GRAY);
//		stopSaleLabel.setBackground(Color.DARK_GRAY);
//		stopSaleLabel.setBounds(460, 579, 170, 30);
//		contentPane.add(stopSaleLabel);

		// 장부기재 버튼=정산(파일로 저장하기)
		saveFileBtn = new JButton("정산 (파일로저장)");
		saveFileBtn.setFont(new Font("고딕",Font.BOLD,13));
		saveFileBtn.setBounds(460, 621, 170, 73);
		contentPane.add(saveFileBtn);

		// 자판기 제품 구매로 돌아가기
		returnBtn = new JButton("자판기로 돌아가기");
		returnBtn.setFont(new Font("고딕",Font.BOLD,13));
		returnBtn.setBounds(460, 710, 170, 73);
		contentPane.add(returnBtn);

		
		//100원
		JLabel label_100 = new JLabel("");
		label_100.setIcon(new ImageIcon("src/image/100원.png"));
		label_100.setOpaque(false);
		label_100.setBounds(40, 793, 84, 68);
		contentPane.add(label_100);
		
		//----------------------동전 재고량
		//100원 재고량 TextField
		coin100Field = new JTextField();
		coin100Field.setText("100원 재고량");
		coin100Field.setFont(new Font("고딕",Font.BOLD,18));
		coin100Field.setHorizontalAlignment(JTextField.CENTER);
		coin100Field.setColumns(10);
		coin100Field.setBounds(120, 793, 100, 60);
		contentPane.add(coin100Field);
		
		//500원 재고
		JLabel label_500 = new JLabel("");
		label_500.setIcon(new ImageIcon("src/image/500원.png"));
		label_500.setOpaque(false);
		label_500.setBounds(40, 866, 84, 68);
		contentPane.add(label_500);
		
		//500원 재고량 TextField
		coin500Field = new JTextField();
		coin500Field.setText("500원 재고량");
		coin500Field.setFont(new Font("고딕",Font.BOLD,18));
		coin500Field.setHorizontalAlignment(JTextField.CENTER);
		coin500Field.setColumns(10);
		coin500Field.setBounds(120, 871, 100, 60);
		contentPane.add(coin500Field);
		
		//-------------------------------
		// 변경사항 저장
		changeSave = new JButton("변경사항 저장");
		changeSave.setFont(new Font("고딕",Font.BOLD,18));
		changeSave.setBounds(229, 793, 401, 141);
		contentPane.add(changeSave);


//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}