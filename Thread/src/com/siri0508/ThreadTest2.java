package com.siri0508;

class MyThread extends Thread {

	public MyThread(String name) {// �θ�Ŭ������ �ִ� �����ڴ� ��ӵ��� �ʴ´�.
		super(name); // new Thread(String name)
		// ����� �θ� �Ƴ����� �ִ°� ������ private�� �����ڴ� ���� ���Ѵ�.
	}

	@Override
	public void run() {

		try {
			for (int i = 1; i < 11; i++) {
				Thread.sleep(500);
				System.out.println(getName() + " : " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		// new Thread(String name);

		MyThread t1 = new MyThread("�浿������");
		MyThread t2 = new MyThread("���ӽ�����");
		MyThread t3 = new MyThread("�ֿ�������");

		// ���ڰ� �������� ����ġ�� ���ٴ� ����
		t1.setPriority(Thread.MAX_PRIORITY); // 10
		t2.setPriority(Thread.MIN_PRIORITY); // 1
		t3.setPriority(Thread.NORM_PRIORITY); // 5

		t1.start();
		t2.start();
		t3.start();
	}

}
