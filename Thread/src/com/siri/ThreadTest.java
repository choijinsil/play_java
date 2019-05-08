package com.siri;

import javax.swing.JFrame;

class MyThread extends Thread {

	// 스레드 특성을 갖는 메소드(동시실행)
	@Override
	public void run() {
		// 동시 실행할(기다리지 않는) 문장들
		try {
			for (int i = 1; i < 11; i++) {// 1~10
				// Thread.sleep(long millis); millis : 밀리세컨드
				Thread.sleep(500); // 1초간 delay, 0.5초가 delay
				System.out.println("길동스레드: " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}// run

}// MyThread

class MyThread2 extends JFrame implements Runnable {

	@Override
	public void run() {
		// 동시 실행할(기다리지 않는) 문장들
		try {
			for (int i = 1; i < 11; i++) {// 1~10
				// Thread.sleep(long millis); millis : 밀리세컨드
				Thread.sleep(500); // 1초간 delay ---> 0.5초
				System.out.println("라임스레드: " + i);			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}// run
}

public class ThreadTest {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		// t는 스레드 객체? (O)
		// t.run(); //run()메소드를 직접 호출하면 일반메소드와 같은 실행을 한다.
		t.start(); // start()메소드는 '스레드 작업 스케줄러'!!
					// start()메소드에게 run()메소드를 위임하면 동시실행을 가능하게 함.
		MyThread2 r = new MyThread2();
		// r.run();//r은 스레드 객체? (X) ---> r은 Runnable객체!!
		// Runnable객체의 경우 Thread객체를 따로 생성하고, 매개변수를 사용해서 run()메소드의 위치를 표시.
		Thread t2 = new Thread(r);
		t2.start();
	}
}
