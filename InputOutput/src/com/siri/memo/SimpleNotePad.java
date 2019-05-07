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

	// FROM(�бⰴü): ���� ------> TO : TextArea
	public void openFile() {
		// chooser.showOpenDialog(Component parent)
		// parent: ��ȭ���ڸ� ���� ������ ������!!
		int t = chooser.showOpenDialog(this);// ���� ��ȭ����
		// ��Ʈ: 1. showOpenDialog()�޼ҵ��� ���� Ȯ��
		// 2. chooser.getSelectedFile()�޼ҵ� ���
		try {
			if (t == JFileChooser.APPROVE_OPTION) {
				// �б�
				File f = chooser.getSelectedFile();
				FileReader fr = new FileReader(chooser.getSelectedFile());
				BufferedReader br = new BufferedReader(fr);
				String rl = br.readLine();

				// ����
				// readLine�� ���� ������ ���ٸ� null
				// read() ���� ���ڰ� ���ٸ� -1�� ����
				String fileName = f.getName();
				setTitle("�ڹٸ޸��� -[" + fileName + "]");
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

	// FROM: TextArea ta ----> TO(���ⰴü) : ����
	// FileOutputStream, FileWriter fw
	// Ư¡: ������ ���Ӱ� �����Ѵ�.

	// String str = ta.getText()
	public void saveFile() {
		// chooser.showSaveDialog(Component parent)
		int t = chooser.showSaveDialog(this);// ���� ��ȭ����
		// 0�� ��������, 1�� ��ҹ�ư
		try {
			if (t == JFileChooser.APPROVE_OPTION) {

				// ������ ���
				String str = ta.getText();

				// ����� ��ο� ���ϸ� ���
				File f = chooser.getSelectedFile();// ���� ��ȭ���ڿ� ���õ� ��ο� ���ϸ��� ���
				FileWriter fw = new FileWriter(f);

				// ������ ����
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
