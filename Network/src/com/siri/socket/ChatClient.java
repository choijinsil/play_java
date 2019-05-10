package com.siri.socket;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable {
	// Center -> JTextArea( ������ ���� �޼����� ���)
	// South -> JTextField( �������� ���� �޼���)

	JTextArea ta;

	JTextField tf_send;
	JButton bt_change; // ��ȭ�� ����

	JPanel southp;

	JScrollPane scroll_ta;

	OutputStream out; // ���� ����
	BufferedReader in; // ���� �б�
	
	public ChatClient() {
		setTitle("��ȭ��");
		// ��ũ���� �ʿ��� ������Ʈ�� �Ű������� �ִ´�.
		southp = new JPanel();
		ta = new JTextArea();
		ta.setFont(new Font("����ü", Font.BOLD, 20));
		ta.setLineWrap(true); // �ʺ� �Ѿ�� �ؽ��� �ִٸ� �ڵ� �ٹٲ�

		scroll_ta = new JScrollPane(ta);
		tf_send = new JTextField(15);
		tf_send.setFont(new Font("����ü", Font.BOLD, 20));
		bt_change = new JButton("��ȭ�� ����");

		southp.add(tf_send);
		southp.add(bt_change);

		add("Center", scroll_ta);
		add("South", southp);

		setBounds(300, 200, 300, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		connectProcess(); // in, out��ü ����

		new Thread(this).start(); // in��ü ���

		String nickName = JOptionPane.showInputDialog(this, "��ȭ��: ");
		toServer("100|" + nickName);
		
		tf_send.addActionListener(this);
		bt_change.addActionListener(this);
	}

	// �����ȭ�� �Է� - > ���� ��ȭ������ �ٲ�Բ�
	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		if (ob == tf_send) {// �ؽ�Ʈ�ʵ忡 ���Ͱ� �ԷµǾ�����

			String msg = tf_send.getText();
			if (msg.length() == 0) {
				return;
			}
			// ���ʴ�ȭ�� ����
			toServer("200|" + msg);// "200|�ȳ��ϼ���??"
			tf_send.setText("");
			
		} else if (ob == bt_change) {// ��ȭ���� ��ư Ŭ����
			String cNickName = JOptionPane.showInputDialog(this, "�����ȭ��:");
			// �����ȭ�� ����
			toServer("150|" + cNickName);
			
		}
	}

	public void connectProcess() { // �������ϰ� �����ϴ� �۾�
		try {
			Socket s = new Socket("192.168.0.90", 3000); // 3. �������� ����
			// 4. ���� ����� ��ü ����
			out = s.getOutputStream();
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// �������� �޼��� ������
	public void toServer(String msg) {
		try {
			System.out.println(msg);
			out.write((msg + "\n").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() { // �������� ������ ���!
		try {
			while (true) {
				// �ּ��� connect���μ��� ������ ȣ��Ǿ�� �Ѵ�.
				String msg = in.readLine(); // 8. ������ ���� �޼��� �б�
				ta.append(msg + "\n");
				ta.setCaretPosition(ta.getText().length());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatClient();
	}

}
