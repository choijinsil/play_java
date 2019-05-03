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

	// �޸����̶� �ؽ�Ʈ ���ϸ� �о�´�.

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
		setTitle("�ڹٸ޸���");

		chooser = new JFileChooser();

		bar = new JMenuBar();
		menu_file = new JMenu("File");
		item_open = new JMenuItem("����");
		item_save = new JMenuItem("����");
		item_exit = new JMenuItem("����");

		menu_help = new JMenu("Help");

		menu_file.add(item_open);
		menu_file.add(item_save);
		menu_file.addSeparator();// ���м� �߰�
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
	}// ������

	// FROM: ���� --> to: TextArea FileReader �Է�
	public void openFile() {
		chooser.showOpenDialog(this);

		try {
			FileReader fr = new FileReader(chooser.getSelectedFile());
//			BufferedReader br= new BufferedReader(fr);
//			ta.append(br.readLine());

			char[] ch = new char[512];
			// char�� �ϴ°� �ӵ��� ������. ���� �ѹ��� ���� 1000�� ������ ��� for���� �ι��� �����ϸ� �Ǵϱ�
			String change = "";

			int i;
			while ((i = fr.read()) != -1) {
				// String str= new String(ch,0,i);ch�� 0��° ���� i��°���� ����.
				change = change + Character.toString((char) i);
				ta.setText(change);
			}
			fr.close();

		} catch (Exception e) {
			System.out.println("������ �����ϴ�.");
			e.printStackTrace();
		}
	}

	// FROM: TextArea --> to: ���� FileWriter, area getText
	public void saveFile() {
		chooser.showSaveDialog(this);

		try {

			FileWriter fw = new FileWriter(chooser.getSelectedFile());
			fw.write(ta.getText());
			System.out.println("������� ");
			fw.close();
		} catch (Exception e) {
			System.out.println("IO��������");
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
