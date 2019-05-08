package com.siri0508;

class MyThread extends Thread {

	public MyThread(String name) {// 부모클래스에 있는 생성자는 상속되지 않는다.
		super(name); // new Thread(String name)
		// 상속은 부모가 아낌없이 주는것 하지만 private과 생성자는 주지 못한다.
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

		MyThread t1 = new MyThread("길동스레드");
		MyThread t2 = new MyThread("라임스레드");
		MyThread t3 = new MyThread("주원스레드");

		// 숫자가 높을수록 가중치가 높다는 개념
		t1.setPriority(Thread.MAX_PRIORITY); // 10
		t2.setPriority(Thread.MIN_PRIORITY); // 1
		t3.setPriority(Thread.NORM_PRIORITY); // 5

		t1.start();
		t2.start();
		t3.start();
	}

}
