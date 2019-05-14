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

	// Ű�е� ǥ��â, Ű��ư, Ȯ��, ��ҹ�ư (0���� ���ſ���)
	public JTextArea keyDisplayArea;
	public JButton keypadBtn_1, keypadBtn_2, keypadBtn_3, keypadBtn_4, keypadBtn_5, keypadBtn_6, keypadBtn_7, keypadBtn_8, keypadBtn_9, keypadBtn_OK;

	// ��ǰ �̹��� ��
	public JLabel pImgLabel_1, pImgLabel_2, pImgLabel_3, pImgLabel_4, pImgLabel_5, pImgLabel_16;
	public JLabel pImgLabel_7, pImgLabel_8, pImgLabel_9;

	// ���Ա�
	public JButton moneyInputBtn;
	// ���� , ������ ��ư
	public JButton adminBtn;
	// ��ȯ�� ��ư
	public JButton returnBtn;
	// ��ǰ�ⱸ
	public JButton productOutBtn;
	// �ǸŰ���,�Ұ��� ���÷��� â
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
		


		// 1��
		
		pImgLabel_1 = new JLabel("");
		pImgLabel_1.setBounds(70, 140, 68, 84);
		pImgLabel_1.setOpaque(false);
		pImgLabel_1.setIcon(new ImageIcon("image/milk/�������.png"));
		contentPane.add(pImgLabel_1);

		JButton pNumBtn_1 = new JButton("");
		pNumBtn_1.setBounds(55, 225, 37, 33);
		pNumBtn_1.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ1.png"));
		pNumBtn_1.setBorderPainted(false);
		pNumBtn_1.setContentAreaFilled(false); //�갡 ��ư Ÿ�ݰ�
		pNumBtn_1.setFocusPainted(false); //�̰� �츱�� ����(������ �� �׵θ�)
		pNumBtn_1.setOpaque(false);
		pNumBtn_1.setVisible(true);
		contentPane.add(pNumBtn_1);

		JLabel pNameLabel_1 = new JLabel("");
		pNameLabel_1.setIcon(new ImageIcon("image/pNameLabel/�̸�����.png"));
		pNameLabel_1.setBounds(90, 225, 90, 33);
		contentPane.add(pNameLabel_1);

		pPriceField_1 = new JTextField();
		pPriceField_1.setText("����ǥ�ʵ�");
		pPriceField_1.setBounds(80, 270, 76, 20);
		pPriceField_1.setOpaque(false);
		pPriceField_1.setBorder(null);
		contentPane.add(pPriceField_1);
		pPriceField_1.setColumns(10);
		pPriceField_1.setEditable(false);

		// 2��
		JLabel pImgLabel_2 = new JLabel("��ǰ�̹���(��)");
		pImgLabel_2.setIcon(new ImageIcon("image/milk/���ڿ���.png"));
		pImgLabel_2.setBounds(205, 140, 68, 84);
		contentPane.add(pImgLabel_2);

		JButton pNumBtn_2 = new JButton("");
		pNumBtn_2.setBounds(181, 225, 30, 30);
		pNumBtn_2.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ2.png"));
		pNumBtn_2.setBorderPainted(false);
		pNumBtn_2.setContentAreaFilled(false);
		pNumBtn_2.setFocusPainted(false);
		pNumBtn_2.setOpaque(false);
		pNumBtn_2.setVisible(true);
		contentPane.add(pNumBtn_2);

		JLabel pNameLabel_2 = new JLabel("");
		pNameLabel_2.setIcon(new ImageIcon("image/pNameLabel/�̸�����.png"));
		pNameLabel_2.setBounds(217, 225, 90, 33);
		contentPane.add(pNameLabel_2);

		pPriceField_2 = new JTextField();
		pPriceField_2.setText("����ǥ�ʵ�");
		pPriceField_2.setBounds(200, 270, 76, 20);
		pPriceField_2.setOpaque(false);
		pPriceField_2.setBorder(null);
		contentPane.add(pPriceField_2);
		pPriceField_2.setColumns(10);
		pPriceField_2.setEditable(false);

		// 3��
		JLabel pImgLabel_3 = new JLabel("��ǰ�̹���(��)");
		pImgLabel_3.setIcon(new ImageIcon("image/milk/�޷п���.png"));
		pImgLabel_3.setBounds(340, 140, 68, 84);
		contentPane.add(pImgLabel_3);

		JButton pNumBtn_3 = new JButton("");
		pNumBtn_3.setBounds(308, 225, 30, 30);
		pNumBtn_3.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ3.png"));
		pNumBtn_3.setBorderPainted(false);
		pNumBtn_3.setContentAreaFilled(false);
		pNumBtn_3.setFocusPainted(false);
		pNumBtn_3.setOpaque(false);
		pNumBtn_3.setVisible(true);
		contentPane.add(pNumBtn_3);

		JLabel pNameLabel_3 = new JLabel("");
		pNameLabel_3.setIcon(new ImageIcon("image/pNameLabel/�̸��޷�.png"));
		pNameLabel_3.setBounds(335, 225, 90, 33);
		contentPane.add(pNameLabel_3);

		pPriceField_3 = new JTextField();
		pPriceField_3.setText("����ǥ�ʵ�");
		pPriceField_3.setBounds(325, 270, 76, 20);
		pPriceField_3.setOpaque(false);
		pPriceField_3.setBorder(null);
		contentPane.add(pPriceField_3);
		pPriceField_3.setColumns(10);
		pPriceField_3.setEditable(false);
		
		// 4��
		JLabel pImgLabel_4 = new JLabel("��ǰ�̹���(��)");
		pImgLabel_4.setIcon(new ImageIcon("image/milk/�����.png"));
		pImgLabel_4.setBounds(70, 320, 68, 84);
		contentPane.add(pImgLabel_4);

		JButton pNumBtn_4 = new JButton("");
		pNumBtn_4.setBounds(55, 405, 30, 30);
		pNumBtn_4.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ4.png"));
		pNumBtn_4.setBorderPainted(false);
		pNumBtn_4.setContentAreaFilled(false);
		pNumBtn_4.setFocusPainted(false);
		pNumBtn_4.setOpaque(false);
		pNumBtn_4.setVisible(true);
		contentPane.add(pNumBtn_4);

		JLabel pNameLabel_4 = new JLabel("");
		pNameLabel_4.setIcon(new ImageIcon("image/pNameLabel/�̸���.png"));
		pNameLabel_4.setBounds(90, 405, 90, 33);
		contentPane.add(pNameLabel_4);

		pPriceField_4 = new JTextField();
		pPriceField_4.setText("����ǥ�ʵ�");
		pPriceField_4.setBounds(80, 450, 76, 20);
		pPriceField_4.setOpaque(false);
		pPriceField_4.setBorder(null);
		contentPane.add(pPriceField_4);
		pPriceField_4.setColumns(10);
		pPriceField_4.setEditable(false);

		// 5��
		JLabel pImgLabel_5 = new JLabel("��ǰ�̹���(��)");
		pImgLabel_5.setIcon(new ImageIcon("image/milk/�ֿ���.png"));
		pImgLabel_5.setBounds(205, 320, 68, 84);
		contentPane.add(pImgLabel_5);

		JButton pNumBtn_5 = new JButton("");
		pNumBtn_5.setBounds(181, 405, 30, 30);
		pNumBtn_5.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ5.png"));
		pNumBtn_5.setBorderPainted(false);
		pNumBtn_5.setContentAreaFilled(false);
		pNumBtn_5.setFocusPainted(false);
		pNumBtn_5.setOpaque(false);
		pNumBtn_5.setVisible(true);
		contentPane.add(pNumBtn_5);

		JLabel pNameLabel_5 = new JLabel("");
		pNameLabel_5.setIcon(new ImageIcon("image/pNameLabel/�̸���.png"));
		pNameLabel_5.setBounds(215, 405, 90, 33);
		contentPane.add(pNameLabel_5);

		pPriceField_5 = new JTextField();
		pPriceField_5.setText("����ǥ�ʵ�");
		pPriceField_5.setBounds(205, 450, 76, 20);
		pPriceField_5.setOpaque(false);
		pPriceField_5.setBorder(null);
		contentPane.add(pPriceField_5);
		pPriceField_5.setColumns(10);
		pPriceField_5.setEditable(false);
		
		// 6��
		JLabel pImgLabel_6 = new JLabel("��ǰ�̹���(��)");
		pImgLabel_6.setIcon(new ImageIcon("image/milk/Ŀ�ǿ���.png"));
		pImgLabel_6.setBounds(340, 320, 68, 84);
		contentPane.add(pImgLabel_6);

		JButton pNumBtn_6 = new JButton("");
		pNumBtn_6.setBounds(308, 405, 30, 30);
		pNumBtn_6.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ6.png"));
		pNumBtn_6.setBorderPainted(false);
		pNumBtn_6.setContentAreaFilled(false);
		pNumBtn_6.setFocusPainted(false);
		pNumBtn_6.setOpaque(false);
		pNumBtn_6.setVisible(true);
		contentPane.add(pNumBtn_6);

		JLabel pNameLabel_6 = new JLabel("");
		pNameLabel_6.setIcon(new ImageIcon("image/pNameLabel/�̸�Ŀ��.png"));
		pNameLabel_6.setBounds(348, 405, 90, 33);
		contentPane.add(pNameLabel_6);

		pPriceField_6 = new JTextField();
		pPriceField_6.setText("����ǥ�ʵ�");
		pPriceField_6.setBounds(332, 450, 76, 20);
		pPriceField_6.setOpaque(false);
		pPriceField_6.setBorder(null);
		contentPane.add(pPriceField_6);
		pPriceField_6.setColumns(10);
		pPriceField_6.setEditable(false);

		// 7��
		JLabel pImgLabel_7 = new JLabel("��ǰ�̹���(��)");
		pImgLabel_7.setIcon(new ImageIcon("image/milk/�ٳ�������.png"));
		pImgLabel_7.setBounds(70, 500, 68, 84);
		contentPane.add(pImgLabel_7);

		JButton pNumBtn_7 = new JButton("");
		pNumBtn_7.setBounds(55, 585, 30, 30);
		pNumBtn_7.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ7.png"));
		pNumBtn_7.setBorderPainted(false);
		pNumBtn_7.setContentAreaFilled(false);
		pNumBtn_7.setFocusPainted(false);
		pNumBtn_7.setOpaque(false);
		pNumBtn_7.setVisible(true);
		contentPane.add(pNumBtn_7);

		JLabel pNameLabel_7 = new JLabel("");
		pNameLabel_7.setIcon(new ImageIcon("image/pNameLabel/�̸��ٳ���.png"));
		pNameLabel_7.setBounds(86, 582, 90, 33);
		contentPane.add(pNameLabel_7);

		pPriceField_7 = new JTextField();
		pPriceField_7.setText("����ǥ�ʵ�");
		pPriceField_7.setBounds(79, 627, 76, 20);
		pPriceField_7.setOpaque(false);
		pPriceField_7.setBorder(null);
		contentPane.add(pPriceField_7);
		pPriceField_7.setColumns(10);
		pPriceField_7.setEditable(false);
				
		// 8��
		JLabel pImgLabel_8 = new JLabel("��ǰ�̹���(��)");
		pImgLabel_8.setIcon(new ImageIcon("image/milk/�������.png"));
		pImgLabel_8.setBounds(205, 500, 68, 84);
		contentPane.add(pImgLabel_8);

		JButton pNumBtn_8 = new JButton("");
		pNumBtn_8.setBounds(181, 585, 30, 30);
		pNumBtn_8.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ8.png"));
		pNumBtn_8.setBorderPainted(false);
		pNumBtn_8.setContentAreaFilled(false);
		pNumBtn_8.setFocusPainted(false);
		pNumBtn_8.setOpaque(false);
		pNumBtn_8.setVisible(true);
		contentPane.add(pNumBtn_8);

		JLabel pNameLabel_8 = new JLabel("");
		pNameLabel_8.setIcon(new ImageIcon("image/pNameLabel/�̸�����.png"));
		pNameLabel_8.setBounds(215, 585, 90, 33);
		contentPane.add(pNameLabel_8);

		pPriceField_8 = new JTextField();
		pPriceField_8.setText("����ǥ�ʵ�");
		pPriceField_8.setBounds(205, 627, 76, 20);
		pPriceField_8.setOpaque(false);
		pPriceField_8.setBorder(null);
		contentPane.add(pPriceField_8);
		pPriceField_8.setColumns(10);
		pPriceField_8.setEditable(false);

		// 9��
		JLabel pImgLabel_9 = new JLabel("��ǰ�̹���(��)");
		pImgLabel_9.setIcon(new ImageIcon("image/milk/�����ƿ���.png"));
		pImgLabel_9.setBounds(340, 500, 68, 84);
		contentPane.add(pImgLabel_9);

		JButton pNumBtn_9 = new JButton("");
		pNumBtn_9.setBounds(308, 585, 30, 30);
		pNumBtn_9.setIcon(new ImageIcon("image/pNum/������_��ǰ��ȣ9.png"));
		pNumBtn_9.setBorderPainted(false);
		pNumBtn_9.setContentAreaFilled(false);
		pNumBtn_9.setFocusPainted(false);
		pNumBtn_9.setOpaque(false);
		pNumBtn_9.setVisible(true);
		contentPane.add(pNumBtn_9);

		JLabel pNameLabel_9 = new JLabel("");
		pNameLabel_9.setIcon(new ImageIcon("image/pNameLabel/�̸�������.png"));
		pNameLabel_9.setBounds(340, 585, 90, 33);
		contentPane.add(pNameLabel_9);

		pPriceField_9 = new JTextField();
		pPriceField_9.setText("����ǥ�ʵ�");
		pPriceField_9.setBounds(332, 627, 76, 20);
		pPriceField_9.setOpaque(false);
		pPriceField_9.setBorder(null);
		contentPane.add(pPriceField_9);
		pPriceField_9.setColumns(10);
		pPriceField_9.setEditable(false);
		
		// ==========================================��ǰ���� ��

		// ���Ǳ� �ΰ�
		JLabel logoLabel = new JLabel("���Ǳ� �ΰ�");
		logoLabel.setIcon(new ImageIcon("image/���̸�.png"));
		logoLabel.setBounds(463, 53, 178, 61);
		contentPane.add(logoLabel);

		// Ű�е� ���÷���
		keyDisplayArea = new JTextArea();
		//keyDisplayArea.setText("�Է�â"); // �Է�â
		keyDisplayArea.setBounds(500, 156, 76, 30);
		keyDisplayArea.setOpaque(false);
		keyDisplayArea.setBorder(null);
		contentPane.add(keyDisplayArea);
		keyDisplayArea.setEditable(false);

		// Ű�е�
		keypadBtn_1 = new JButton("");
		keypadBtn_1.setBounds(460, 220, 50, 50);
		keypadBtn_1.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_1.setIcon(new ImageIcon("image/button/��ư1.png"));
		keypadBtn_1.setBorderPainted(false);
		keypadBtn_1.setFocusPainted(false);
		keypadBtn_1.setOpaque(false);
		contentPane.add(keypadBtn_1);

		keypadBtn_2 = new JButton("");
		keypadBtn_2.setBounds(520, 220, 50, 50);
		keypadBtn_2.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_2.setIcon(new ImageIcon("image/button/��ư2.png"));
		keypadBtn_2.setBorderPainted(false);
		keypadBtn_2.setFocusPainted(false);
		keypadBtn_2.setOpaque(false);
		contentPane.add(keypadBtn_2);

		keypadBtn_3 = new JButton("");
		keypadBtn_3.setBounds(580, 220, 50, 50);
		keypadBtn_3.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_3.setIcon(new ImageIcon("image/button/��ư3.png"));
		keypadBtn_3.setBorderPainted(false);
		keypadBtn_3.setFocusPainted(false);
		keypadBtn_3.setOpaque(false);
		contentPane.add(keypadBtn_3);

		keypadBtn_4 = new JButton("");
		keypadBtn_4.setBounds(460, 280, 50, 50);
		keypadBtn_4.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_4.setIcon(new ImageIcon("image/button/��ư4.png"));
		keypadBtn_4.setBorderPainted(false);
		keypadBtn_4.setFocusPainted(false);
		keypadBtn_4.setOpaque(false);
		contentPane.add(keypadBtn_4);

		keypadBtn_5 = new JButton("");
		keypadBtn_5.setBounds(520, 280, 50, 50);
		keypadBtn_5.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_5.setIcon(new ImageIcon("image/button/��ư5.png"));
		keypadBtn_5.setBorderPainted(false);
		keypadBtn_5.setFocusPainted(false);
		keypadBtn_5.setOpaque(false);
		contentPane.add(keypadBtn_5);

		keypadBtn_6 = new JButton("");
		keypadBtn_6.setBounds(580, 280, 50, 50);
		keypadBtn_6.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_6.setIcon(new ImageIcon("image/button/��ư6.png"));
		keypadBtn_6.setBorderPainted(false);
		keypadBtn_6.setFocusPainted(false);
		keypadBtn_6.setOpaque(false);
		contentPane.add(keypadBtn_6);

		keypadBtn_7 = new JButton("");
		keypadBtn_7.setBounds(460, 340, 50, 50);
		keypadBtn_7.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_7.setIcon(new ImageIcon("image/button/��ư7.png"));
		keypadBtn_7.setBorderPainted(false);
		keypadBtn_7.setFocusPainted(false);
		keypadBtn_7.setOpaque(false);
		contentPane.add(keypadBtn_7);

		keypadBtn_8 = new JButton("");
		keypadBtn_8.setBounds(520, 340, 50, 58);
		keypadBtn_8.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_8.setIcon(new ImageIcon("image/button/��ư8.png"));
		keypadBtn_8.setBorderPainted(false);
		keypadBtn_8.setFocusPainted(false);
		keypadBtn_8.setOpaque(false);
		contentPane.add(keypadBtn_8);

		keypadBtn_9 = new JButton("");
		keypadBtn_9.setBounds(580, 340, 50, 50);
		keypadBtn_9.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_9.setIcon(new ImageIcon("image/button/��ư9.png"));
		keypadBtn_9.setBorderPainted(false);
		keypadBtn_9.setFocusPainted(false);
		keypadBtn_9.setOpaque(false);
		contentPane.add(keypadBtn_9);

		keypadBtn_OK = new JButton("");
		keypadBtn_OK.setBackground(SystemColor.activeCaptionBorder);
		keypadBtn_OK.setIcon(new ImageIcon("image/Ȯ��.png"));
		keypadBtn_OK.setBounds(483, 398, 108, 60);
		keypadBtn_OK.setBorderPainted(false);
		keypadBtn_OK.setFocusPainted(false);
		keypadBtn_OK.setOpaque(false);
		keypadBtn_OK.setEnabled(false);
		contentPane.add(keypadBtn_OK);
		
		// =================================Ű�е� ��

		// �ǸŰ���,�Ұ��� ���÷��� â
//		saleLabel = new JLabel("");
//		saleLabel.setIcon(new ImageIcon("image/\uD310\uB9E4\uAC00\uB2A5.png"));
//		saleLabel.setForeground(Color.DARK_GRAY);
//		saleLabel.setBackground(Color.DARK_GRAY);
//		saleLabel.setBounds(483, 460, 135, 45);
//		contentPane.add(saleLabel);

		// �ǸŰ���,�Ұ��� ���÷��� â
		saleOkLabel = new JLabel(new ImageIcon("image/�ǸŰ���.png"));
		saleOkLabel.setIcon(new ImageIcon("image/�ǸŰ���.png"));
		saleOkLabel.setForeground(Color.DARK_GRAY);
		saleOkLabel.setBackground(Color.DARK_GRAY);
		saleOkLabel.setBounds(460, 460, 170, 40);
		contentPane.add(saleOkLabel);
		
		saleNoLabel = new JLabel(new ImageIcon("image/�ǸźҰ�.png"));
		saleNoLabel.setIcon(new ImageIcon("image/�ǸźҰ�.png"));
		saleNoLabel.setForeground(Color.DARK_GRAY);
		saleNoLabel.setBackground(Color.DARK_GRAY);
		saleNoLabel.setBounds(460, 460, 170, 40);
		contentPane.add(saleNoLabel);
		
		// �ݾ� ���÷��� â
		moneyDisplayArea = new JTextArea();
		//moneyDisplayArea.setText("�ݾ� ���÷��� â");
		moneyDisplayArea.setBounds(483, 525, 135, 33);
		moneyDisplayArea.setOpaque(false);
		moneyDisplayArea.setBorder(null);
		contentPane.add(moneyDisplayArea);
		moneyDisplayArea.setEditable(false);

		
		// ���Ա� ��ư
		moneyInputBtn = new JButton("");
		moneyInputBtn.setBackground(SystemColor.activeCaptionBorder);
		moneyInputBtn.setIcon(new ImageIcon("image/������.png"));
		moneyInputBtn.setBounds(463, 574, 178, 49);
		moneyInputBtn.setBorderPainted(false);
		moneyInputBtn.setFocusPainted(false);
		moneyInputBtn.setOpaque(false);
		contentPane.add(moneyInputBtn);

		// ���� , ������ ��ư
		adminBtn = new JButton("");
		adminBtn.setBackground(SystemColor.activeCaptionBorder);
		adminBtn.setIcon(new ImageIcon("image/�����ڸ��.png"));
		adminBtn.setBounds(463, 627, 50, 122);
		adminBtn.setOpaque(false);
		adminBtn.setBorder(null);
		contentPane.add(adminBtn);

		// ��ȯ�� ��ư
		returnBtn = new JButton("");
		returnBtn.setBackground(SystemColor.activeCaptionBorder);
		returnBtn.setIcon(new ImageIcon("image/�ܵ���ȯ.png"));
		returnBtn.setBounds(519, 626, 121, 122);
		returnBtn.setOpaque(false);
		returnBtn.setBorder(null);
		contentPane.add(returnBtn);

		
		
		// ��ǰ�ⱸ
		  JLabel outLabel = new JLabel();
		  JPanel outPanel = new JPanel();
		  outPanel.setLayout(null);
		  outPanel.setOpaque(false);
		  outPanel.setBounds(39, 751, 597, 170);
		  outLabel.setBounds(0, 0, 597, 170);
		  outLabel.setIcon(new ImageIcon("image/��ǰ�ⱸ.png"));
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
		priceTagLabel1.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel1.setBounds(65, 260, 100, 45);
		contentPane.add(priceTagLabel1);
		
		priceTagLabel2 = new JLabel("");
		priceTagLabel2.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel2.setBounds(190, 260, 100, 45);
		contentPane.add(priceTagLabel2);
		
		priceTagLabel3 = new JLabel("");
		priceTagLabel3.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel3.setBounds(315, 260, 100, 45);
		contentPane.add(priceTagLabel3);
		

		priceTagLabel4 = new JLabel("");
		priceTagLabel4.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel4.setBounds(70, 440, 100, 45);
		contentPane.add(priceTagLabel4);
		
		priceTagLabel5 = new JLabel("");
		priceTagLabel5.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel5.setBounds(195, 440, 100, 45);
		contentPane.add(priceTagLabel5);
		
		priceTagLabel6 = new JLabel("");
		priceTagLabel6.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel6.setBounds(320, 440, 100, 45);
		contentPane.add(priceTagLabel6);
		
		priceTagLabel7 = new JLabel("");
		priceTagLabel7.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel7.setBounds(70, 615, 100, 45);
		contentPane.add(priceTagLabel7);
		
		priceTagLabel8 = new JLabel("");
		priceTagLabel8.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel8.setBounds(195, 615, 100, 45);
		contentPane.add(priceTagLabel8);
		
		priceTagLabel9 = new JLabel("");
		priceTagLabel9.setIcon(new ImageIcon("image/��ǰ����.png"));
		priceTagLabel9.setBounds(320, 615, 100, 45);
		contentPane.add(priceTagLabel9);
		

		//������ ��ǰ
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("image/��������ǰ.png"));
		label_4.setBounds(467, 126, 170, 84);
		contentPane.add(label_4);
		
		//������ �ݾ�
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("image/�����ѱݾ�.png"));
		label_5.setBounds(452, 495, 200, 80);
		contentPane.add(label_5);

		
		//�����ǳ� �̹��� ������ �׻� �� �ؿ� �Ѱ� !!!!!!!!!!!!!
		lblPaneimg = new JLabel("paneImg");
		lblPaneimg.setBackground(SystemColor.activeCaption);
		lblPaneimg.setIcon(new ImageIcon("image/mainPane.png"));
		lblPaneimg.setBounds(0, 10, 684, 961);
		contentPane.add(lblPaneimg);
		

		
		setVisible(true);
	}
}