package com.thread.mission;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveThread extends JFrame implements ActionListener, Runnable {
	JLabel la, la2;
	JButton bt_start, bt_stop;
	JButton ybt_start, ybt_stop;
	boolean isOk;

	int x, y;
	int a, b;

	public MoveThread() {
		setTitle("ȭ��ǥ�����̱�");
		ImageIcon icon = new ImageIcon("image/right.gif");
		ImageIcon icon2 = new ImageIcon("image/rightDown.gif");

		bt_start = new JButton("����");
		bt_stop = new JButton("����");
		ybt_start = new JButton("�������");
		ybt_stop = new JButton("�������");

		la = new JLabel(icon);
		la2 = new JLabel(icon2);

		// bt_start.setBounds(x, y, width, height);
		bt_start.setBounds(20, 420, 80, 30);
		bt_stop.setBounds(120, 420, 80, 30);

		ybt_start.setBounds(20, 380, 100, 30);
		ybt_stop.setBounds(120, 380, 100, 30);

		la.setBounds(x, y, 56, 56);
		la2.setBounds(a, b, 56, 56);

		Thread t = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
		};

		setLayout(null);
		add(bt_start);
		add(bt_stop);
		add(ybt_start);
		add(ybt_stop);
		add(la);

		setBounds(200, 200, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		bt_start.addActionListener(this);
		bt_stop.addActionListener(this);
	}// ������

	public void run() {
		// ȭ��ǥ���� �������� �̵�(x������) �Ǵ� �Ʒ��� �̵�(y������)
		// la.setBounds(x,y,width,height)
		// la.setBounds(0, 0, 56, 56);//�⺻��
		// la.setLocation(x, y);
		try {
			isOk = true;
			while (isOk) {

				if (!isOk)
					break;

				Thread.sleep(50);
				if (x <= 425)
					x += 5; // x=x+5;
				else if (y <= 400)
					y += 5;
				// System.out.println("X="+x);
				la.setLocation(x, y);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}// run

	Thread t1;

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == bt_start) {
			isOk = true;
			// ������ ȣ��!!
			t1 = new Thread(this);
			t1.start();
		} else if (ob == bt_stop) {
			isOk = false;
		} else if (ob == ybt_start) {

		} else if (ob == ybt_stop) {

		}
	}

	public static void main(String[] args) {
		new MoveThread();
	}

}
