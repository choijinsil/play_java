package com.siri;

import javax.swing.JFrame;

class MyThread extends Thread {

	// ������ Ư���� ���� �޼ҵ�(���ý���)
	@Override
	public void run() {
		// ���� ������(��ٸ��� �ʴ�) �����
		try {
			for (int i = 1; i < 11; i++) {// 1~10
				// Thread.sleep(long millis); millis : �и�������
				Thread.sleep(500); // 1�ʰ� delay, 0.5�ʰ� delay
				System.out.println("�浿������: " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}// run

}// MyThread

class MyThread2 extends JFrame implements Runnable {

	@Override
	public void run() {
		// ���� ������(��ٸ��� �ʴ�) �����
		try {
			for (int i = 1; i < 11; i++) {// 1~10
				// Thread.sleep(long millis); millis : �и�������
				Thread.sleep(500); // 1�ʰ� delay ---> 0.5��
				System.out.println("���ӽ�����: " + i);			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}// run
}

public class ThreadTest {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		// t�� ������ ��ü? (O)
		// t.run(); //run()�޼ҵ带 ���� ȣ���ϸ� �Ϲݸ޼ҵ�� ���� ������ �Ѵ�.
		t.start(); // start()�޼ҵ�� '������ �۾� �����ٷ�'!!
					// start()�޼ҵ忡�� run()�޼ҵ带 �����ϸ� ���ý����� �����ϰ� ��.
		MyThread2 r = new MyThread2();
		// r.run();//r�� ������ ��ü? (X) ---> r�� Runnable��ü!!
		// Runnable��ü�� ��� Thread��ü�� ���� �����ϰ�, �Ű������� ����ؼ� run()�޼ҵ��� ��ġ�� ǥ��.
		Thread t2 = new Thread(r);
		t2.start();
	}
}
