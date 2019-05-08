package com.thread.mission;

// 스레드
public class Customer extends Thread {
	Account account;

	public Customer(Account account) {
		this.account = account;
	}

	@Override
	public void run() {

		try {
			for (int i = 1; i < 200; i++) {

				Thread.sleep(50); // 1000을 주면 1초 40은 0.05초
				account.deposit(1000);
				System.out.println(getName() + " : " + i + "회");

				if (account.getTotal() >= 500000) { // 목표액(오십만원) 달성
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
