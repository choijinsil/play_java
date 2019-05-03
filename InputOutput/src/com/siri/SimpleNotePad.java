package com.siri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SimpleNotePad extends JFrame implements ActionListener {

	// 메모장이라 텍스트 파일만 읽어온다.

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

	// FROM: 파일 --> to: TextArea FileReader 입력
	public void openFile() {
		chooser.showOpenDialog(this);

		try {
			FileReader fr = new FileReader(chooser.getSelectedFile());
//			BufferedReader br= new BufferedReader(fr);
//			ta.append(br.readLine());

			char[] ch = new char[512];
			// char로 하는게 속도가 빠르다. 방을 한번에 만들어서 1000개 글자의 경우 for문을 두번만 실행하면 되니까
			String change = "";

			int i;
			while ((i = fr.read()) != -1) {
				// String str= new String(ch,0,i);ch를 0번째 부터 i번째까지 돌자.
				change = change + Character.toString((char) i);
				ta.setText(change);
			}
			fr.close();

		} catch (Exception e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}
	}

	// FROM: TextArea --> to: 파일 FileWriter, area getText
	public void saveFile() {
		chooser.showSaveDialog(this);

		try {

			FileWriter fw = new FileWriter(chooser.getSelectedFile());
			fw.write(ta.getText());
			System.out.println("저장까지 ");
			fw.close();
		} catch (Exception e) {
			System.out.println("IO에러에용");
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
