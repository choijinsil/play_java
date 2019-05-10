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

	public MAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 20, 700, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 1��
		JLabel pImgLabel_1 = new JLabel("��ǰ�̹���");
		pImgLabel_1.setBounds(40, 90, 100, 140);
		contentPane.add(pImgLabel_1);

		JButton pNumBtn_1 = new JButton("1bun");
		pNumBtn_1.setBounds(40, 230, 30, 30);
		contentPane.add(pNumBtn_1);

		JLabel pNameLabel_1 = new JLabel("��ǰ��");
		pNameLabel_1.setBounds(80, 230, 70, 30);
		contentPane.add(pNameLabel_1);

		pPriceField_1 = new JTextField();
		pPriceField_1.setText("����");
		pPriceField_1.setBounds(40, 260, 100, 20);
		contentPane.add(pPriceField_1);
		pPriceField_1.setColumns(10);

		pStockField_1 = new JTextField();
		pStockField_1.setText("������");
		pStockField_1.setColumns(10);
		pStockField_1.setBounds(40, 283, 100, 20);
		contentPane.add(pStockField_1);
		// 2��
		JLabel pImgLabel_2 = new JLabel("��ǰ�̹���");
		pImgLabel_2.setBounds(190, 90, 100, 140);
		contentPane.add(pImgLabel_2);

		JButton pNumBtn_2 = new JButton("2bun");
		pNumBtn_2.setBounds(190, 230, 30, 30);
		contentPane.add(pNumBtn_2);

		JLabel pNameLabel_2 = new JLabel("��ǰ��");
		pNameLabel_2.setBounds(230, 230, 70, 30);
		contentPane.add(pNameLabel_2);

		pPriceField_2 = new JTextField();
		pPriceField_2.setText("����");
		pPriceField_2.setBounds(190, 260, 100, 20);
		contentPane.add(pPriceField_2);
		pPriceField_2.setColumns(10);

		pStockField_2 = new JTextField();
		pStockField_2.setText("������");
		pStockField_2.setColumns(10);
		pStockField_2.setBounds(190, 283, 100, 20);
		contentPane.add(pStockField_2);

		// 3��
		JLabel pImgLabel_3 = new JLabel("��ǰ�̹���");
		pImgLabel_3.setBounds(340, 90, 100, 140);
		contentPane.add(pImgLabel_3);

		JButton pNumBtn_3 = new JButton("2bun");
		pNumBtn_3.setBounds(340, 230, 30, 30);
		contentPane.add(pNumBtn_3);

		JLabel pNameLabel_3 = new JLabel("��ǰ��");
		pNameLabel_3.setBounds(380, 230, 70, 30);
		contentPane.add(pNameLabel_3);

		pPriceField_3 = new JTextField();
		pPriceField_3.setText("����");
		pPriceField_3.setBounds(340, 260, 100, 20);
		contentPane.add(pPriceField_3);
		pPriceField_3.setColumns(10);

		pStockField_3 = new JTextField();
		pStockField_3.setText("������");
		pStockField_3.setColumns(10);
		pStockField_3.setBounds(340, 283, 100, 20);
		contentPane.add(pStockField_3);

		// 4��
		JLabel pImgLabel_4 = new JLabel("��ǰ�̹���");
		pImgLabel_4.setBounds(40, 330, 100, 140);
		contentPane.add(pImgLabel_4);

		JButton pNumBtn_4 = new JButton("2bun");
		pNumBtn_4.setBounds(40, 470, 30, 30);
		contentPane.add(pNumBtn_4);

		JLabel pNameLabel_4 = new JLabel("��ǰ��");
		pNameLabel_4.setBounds(80, 470, 70, 30);
		contentPane.add(pNameLabel_4);

		pPriceField_4 = new JTextField();
		pPriceField_4.setText("����");
		pPriceField_4.setBounds(40, 500, 100, 20);
		contentPane.add(pPriceField_4);
		pPriceField_4.setColumns(10);

		pStockField_4 = new JTextField();
		pStockField_4.setText("������");
		pStockField_4.setColumns(10);
		pStockField_4.setBounds(40, 523, 100, 20);
		contentPane.add(pStockField_4);

		// 5��
		JLabel pImgLabel_5 = new JLabel("��ǰ�̹���");
		pImgLabel_5.setBounds(190, 330, 100, 140);
		contentPane.add(pImgLabel_5);

		JButton pNumBtn_5 = new JButton("2bun");
		pNumBtn_5.setBounds(190, 470, 30, 30);
		contentPane.add(pNumBtn_5);

		JLabel pNameLabel_5 = new JLabel("��ǰ��");
		pNameLabel_5.setBounds(230, 470, 70, 30);
		contentPane.add(pNameLabel_5);

		pPriceField_5 = new JTextField();
		pPriceField_5.setText("����");
		pPriceField_5.setBounds(190, 500, 100, 20);
		contentPane.add(pPriceField_5);
		pPriceField_5.setColumns(10);

		pStockField_5 = new JTextField();
		pStockField_5.setText("������");
		pStockField_5.setColumns(10);
		pStockField_5.setBounds(190, 523, 100, 20);
		contentPane.add(pStockField_5);

		// 6��
		JLabel pImgLabel_6 = new JLabel("��ǰ�̹���");
		pImgLabel_6.setBounds(340, 330, 100, 140);
		contentPane.add(pImgLabel_6);

		JButton pNumBtn_6 = new JButton("2bun");
		pNumBtn_6.setBounds(340, 470, 30, 30);
		contentPane.add(pNumBtn_6);

		JLabel pNameLabel_6 = new JLabel("��ǰ��");
		pNameLabel_6.setBounds(380, 470, 70, 30);
		contentPane.add(pNameLabel_6);

		pPriceField_6 = new JTextField();
		pPriceField_6.setText("����");
		pPriceField_6.setBounds(340, 500, 100, 20);
		contentPane.add(pPriceField_6);
		pPriceField_6.setColumns(10);

		pStockField_6 = new JTextField();
		pStockField_6.setText("������");
		pStockField_6.setColumns(10);
		pStockField_6.setBounds(340, 523, 100, 20);
		contentPane.add(pStockField_6);

		// 7��
		JLabel pImgLabel_7 = new JLabel("��ǰ�̹���");
		pImgLabel_7.setBounds(40, 570, 100, 140);
		contentPane.add(pImgLabel_7);

		JButton pNumBtn_7 = new JButton("2bun");
		pNumBtn_7.setBounds(40, 710, 30, 30);
		contentPane.add(pNumBtn_7);

		JLabel pNameLabel_7 = new JLabel("��ǰ��");
		pNameLabel_7.setBounds(80, 710, 70, 30);
		contentPane.add(pNameLabel_7);

		pPriceField_7 = new JTextField();
		pPriceField_7.setText("����");
		pPriceField_7.setBounds(40, 740, 100, 20);
		contentPane.add(pPriceField_7);
		pPriceField_7.setColumns(10);

		pStockField_7 = new JTextField();
		pStockField_7.setText("������");
		pStockField_7.setColumns(10);
		pStockField_7.setBounds(40, 763, 100, 20);
		contentPane.add(pStockField_7);

		// 8��
		JLabel pImgLabel_8 = new JLabel("��ǰ�̹���");
		pImgLabel_8.setBounds(190, 570, 100, 140);
		contentPane.add(pImgLabel_8);

		JButton pNumBtn_8 = new JButton("2bun");
		pNumBtn_8.setBounds(190, 710, 30, 30);
		contentPane.add(pNumBtn_8);

		JLabel pNameLabel_8 = new JLabel("��ǰ��");
		pNameLabel_8.setBounds(230, 710, 70, 30);
		contentPane.add(pNameLabel_8);

		pPriceField_8 = new JTextField();
		pPriceField_8.setText("����");
		pPriceField_8.setBounds(190, 740, 100, 20);
		contentPane.add(pPriceField_8);
		pPriceField_8.setColumns(10);

		pStockField_8 = new JTextField();
		pStockField_8.setText("������");
		pStockField_8.setColumns(10);
		pStockField_8.setBounds(190, 763, 100, 20);
		contentPane.add(pStockField_8);

		// 9��
		JLabel pImgLabel_9 = new JLabel("��ǰ�̹���");
		pImgLabel_9.setBounds(340, 570, 100, 140);
		contentPane.add(pImgLabel_9);

		JButton pNumBtn_9 = new JButton("2bun");
		pNumBtn_9.setBounds(340, 710, 30, 30);
		contentPane.add(pNumBtn_9);

		JLabel pNameLabel_9 = new JLabel("��ǰ��");
		pNameLabel_9.setBounds(380, 710, 70, 30);
		contentPane.add(pNameLabel_9);

		pPriceField_9 = new JTextField();
		pPriceField_9.setText("����");
		pPriceField_9.setBounds(340, 740, 100, 20);
		contentPane.add(pPriceField_9);
		pPriceField_9.setColumns(10);

		pStockField_9 = new JTextField();
		pStockField_9.setText("������");
		pStockField_9.setColumns(10);
		pStockField_9.setBounds(340, 763, 100, 20);
		contentPane.add(pStockField_9);
		// ==========================================��ǰ���� ��

		// ���Ǳ� �ΰ�
		JLabel logoLabel = new JLabel("�ΰ�");
		logoLabel.setBounds(460, 50, 170, 60);
		contentPane.add(logoLabel);

		// ���ϸ���
		JLabel todaySaleLabel = new JLabel("���ϸ���");
		todaySaleLabel.setBounds(460, 100, 170, 30);
		contentPane.add(todaySaleLabel);

		// ���ϸ��� ���÷���
		JTextArea todaySaleDisplayArea = new JTextArea();
		todaySaleDisplayArea.setText("���ϸ��� ���÷���");
		todaySaleDisplayArea.setBounds(460, 140, 170, 55);
		contentPane.add(todaySaleDisplayArea);

		// �Ѹ���
		JLabel tSaleLabel = new JLabel("�Ѹ���");
		tSaleLabel.setBounds(460, 200, 170, 30);
		contentPane.add(tSaleLabel);

		// �Ѹ��� ���÷���
		JTextArea tSaleDisplayArea = new JTextArea();
		tSaleDisplayArea.setText("�Ѹ��� ���÷���");
		tSaleDisplayArea.setBounds(460, 240, 170, 55);
		contentPane.add(tSaleDisplayArea);

		// ��ǰ�� �Ǹŷ�
		JLabel pSaleLabel = new JLabel("��ǰ�� �Ǹŷ�");
		pSaleLabel.setBounds(460, 298, 170, 30);
		contentPane.add(pSaleLabel);

		// ��ǰ�� �Ǹŷ� ���÷���
		JTextArea pSaleDisplayArea = new JTextArea();
		pSaleDisplayArea.setText("��ǰ�� �Ǹŷ� ���÷���");
		pSaleDisplayArea.setBounds(460, 330, 170, 237);
		contentPane.add(pSaleDisplayArea);

		// �ǸŰ���,�Ұ��� ���÷��� â
		JLabel stopSaleLabel = new JLabel("�Ǹ�����");
		stopSaleLabel.setForeground(Color.DARK_GRAY);
		stopSaleLabel.setBackground(Color.DARK_GRAY);
		stopSaleLabel.setBounds(460, 579, 170, 30);
		contentPane.add(stopSaleLabel);

		// ��α��� ��ư
		JButton saveFileBtn = new JButton("��α���(���Ϸ�����)");
		saveFileBtn.setBounds(460, 621, 170, 73);
		contentPane.add(saveFileBtn);

		// ���Ǳ� ��ǰ ���ŷ� ���ư���
		JButton returnBtn = new JButton("���Ǳ� ���ŷ� ���ư���");
		returnBtn.setBounds(460, 710, 170, 73);
		contentPane.add(returnBtn);

		// ������� ����
		JButton changeSave = new JButton("������� ����");
		changeSave.setBounds(39, 806, 597, 115);
		contentPane.add(changeSave);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
