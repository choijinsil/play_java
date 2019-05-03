package com.encore.j0424;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TextFieldAreaTest extends Frame {

	TextField tf1;
	TextField tf2;
	TextArea ta;
	Label la;
	Panel southp, northp;
	Button bt, bt2;

	public TextFieldAreaTest() {

		setTitle("TextFieldArea 테스트");

		bt = new Button("전송");
		bt2 = new Button("파일첨부");
		tf1 = new TextField("기본값", 10);
		ta = new TextArea();
		tf2 = new TextField(10);
		la = new Label("파일이름");
		la.setForeground(Color.RED);

		southp = new Panel();

		southp.setLayout(new FlowLayout());
		southp.add(la);
		southp.add(tf2);
		southp.add(bt2);

		northp = new Panel();
		northp.add(tf1);
		northp.add(bt);
		// setLayout(new BorderLayout()); <-- frame의 기본 레이아웃이라 생략 가능
		northp.setBackground(Color.GREEN);
		add("Center", ta);
		add("North", northp);
		add("South", southp);
		southp.setBackground(Color.pink);
//		add("South", tf2);
//		add("South", la);

		// bt클릭시 alert창 띄우기
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg) {
				JOptionPane.showMessageDialog(null, "전송버튼을 클릭했어요!", "알림메세지", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		// bt2를 클릭시 파일 첨부 창열리기
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg) {

				JFileChooser chooser = new JFileChooser(); // 객체 생성
				int ret = chooser.showOpenDialog(null); // 열기창 정의

				if (ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "경로를 선택하지않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
					return;
				}

				String filePath = chooser.getSelectedFile().getPath(); // 파일경로를 가져옴
				System.out.println(filePath); // 출력

				JOptionPane.showMessageDialog(null, "파일이 정상첨부되었어요!", "알림메세지", JOptionPane.INFORMATION_MESSAGE);

			}
		});

		// 마무리2개 (프레임 사이즈, 프레임보이기) <-- 프레임 = 윈도우창
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldAreaTest();
	}

}
