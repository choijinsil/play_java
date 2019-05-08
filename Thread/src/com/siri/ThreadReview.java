package com.siri;

import javax.swing.JFrame;

class MyThread33 extends Thread {

	public void member() {

		start();
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i < 11; i++) {
				Thread.sleep(500);
				System.out.println("�浿������: " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyThread22 extends JFrame implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 1; i < 11; i++) {// 1~10
				Thread.sleep(500); // 1�ʰ� delay ---> 0.5��
				System.out.println("���ӽ�����: " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Runnalbe�� member�޼ҵ�ȿ��� run()ȣ���ϴ� ���
	public void member() {
		new Thread(this).start();
	}
}

public class ThreadReview {
	public static void main(String[] args) {
		MyThread33 t33 = new MyThread33();
		t33.start();
		MyThread22 t22 = new MyThread22();
		Thread t2 = new Thread(t22);
		t2.start();
	}
}
