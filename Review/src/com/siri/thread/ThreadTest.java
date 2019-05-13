package com.siri.thread;

import javax.swing.JFrame;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1; i < 11; i++) {
				Thread.sleep(1000);
				System.out.println("siri Thread: " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyThread2 extends JFrame implements Runnable {

	@Override
	public void run() {

		try {
			for (int i = 1; i < 11; i++) {
				Thread.sleep(1000);
				System.out.println("sani Thread: " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
