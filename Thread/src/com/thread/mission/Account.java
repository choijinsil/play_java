package com.thread.mission;

// 모금하
public class Account {
	private int total;

	public synchronized void deposit(int account) {
		total += account;

		/*
		 * LOAD total 0 ADD account0+1000 SAVE total
		 */
		// 동기화 한다 (Synchronized)
		// 옷한번 입어봐도되요?

	}

	public int getTotal() {
		return total;
	}

}
