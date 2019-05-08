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
		setTitle("화살표움직이기");
		ImageIcon icon = new ImageIcon("image/right.gif");
		ImageIcon icon2 = new ImageIcon("image/rightDown.gif");

		bt_start = new JButton("시작");
		bt_stop = new JButton("정지");
		ybt_start = new JButton("노랑시작");
		ybt_stop = new JButton("노랑중지");

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
	}// 생성자

	public void run() {
		// 화살표라벨을 우측으로 이동(x값증가) 또는 아래로 이동(y값증가)
		// la.setBounds(x,y,width,height)
		// la.setBounds(0, 0, 56, 56);//기본값
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
			// 스레드 호출!!
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
