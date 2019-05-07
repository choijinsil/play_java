package com.siri.memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SimpleNotePad extends JFrame implements ActionListener {

	JTextArea ta;
	JScrollPane scroll_ta;

	JMenuBar bar;
	JMenu menu_file;
	JMenuItem item_open;
	JMenuItem item_save;
	JMenuItem item_exit;
	JMenu menu_help;

	JFileChooser chooser;

	public SimpleNotePad() {
		setTitle("자바메모장");

		chooser = new JFileChooser();

		bar = new JMenuBar();
		menu_file = new JMenu("File");
		item_open = new JMenuItem("열기");
		item_save = new JMenuItem("저장");
		item_exit = new JMenuItem("종료");

		menu_help = new JMenu("Help");

		menu_file.add(item_open);
		menu_file.add(item_save);
		menu_file.addSeparator();// 구분선 추가
		menu_file.add(item_exit);

		bar.add(menu_file);
		bar.add(menu_help);

		setJMenuBar(bar);

		ta = new JTextArea();
		scroll_ta = new JScrollPane(ta);

		add("Center", scroll_ta);

		setBounds(400, 300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		item_open.addActionListener(this);
		item_save.addActionListener(this);
		item_exit.addActionListener(this);
	}// 생성자

	// FROM(읽기객체): 파일 ------> TO : TextArea
	public void openFile() {
		// chooser.showOpenDialog(Component parent)
		// parent: 대화상자를 누구 위에서 보일지!!
		int t = chooser.showOpenDialog(this);// 열기 대화상자
		// 힌트: 1. showOpenDialog()메소드의 리턴 확인
		// 2. chooser.getSelectedFile()메소드 사용
		try {
			if (t == JFileChooser.APPROVE_OPTION) {
				// 읽기
				File f = chooser.getSelectedFile();
				FileReader fr = new FileReader(chooser.getSelectedFile());
				BufferedReader br = new BufferedReader(fr);
				String rl = br.readLine();

				// 쓰기
				// readLine은 읽을 라인이 없다면 null
				// read() 읽을 문자가 없다면 -1을 리턴
				String fileName = f.getName();
				setTitle("자바메모장 -[" + fileName + "]");
				ta.append("");
				while (rl != null) {
					ta.append(br.readLine() + "\n");
				}
				br.close();
				fr.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// FROM: TextArea ta ----> TO(쓰기객체) : 파일
	// FileOutputStream, FileWriter fw
	// 특징: 파일을 새롭게 생성한다.

	// String str = ta.getText()
	public void saveFile() {
		// chooser.showSaveDialog(Component parent)
		int t = chooser.showSaveDialog(this);// 저장 대화상자
		// 0은 파일저장, 1은 취소버튼
		try {
			if (t == JFileChooser.APPROVE_OPTION) {

				// 데이터 얻기
				String str = ta.getText();

				// 저장된 경로와 파일명 얻기
				File f = chooser.getSelectedFile();// 저장 대화상자에 선택된 경로와 파일명을 얻기
				FileWriter fw = new FileWriter(f);

				// 데이터 쓰기
				fw.write(str);
				fw.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == item_open) {
			openFile();
		} else if (ob == item_save) {
			saveFile();
		} else if (ob == item_exit) {
			System.exit(0);
		}

	}// actionPerformed

	public static void main(String[] args) {
		new SimpleNotePad();
	}

}
