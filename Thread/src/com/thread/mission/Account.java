package com.thread.mission;

// �����
public class Account {
	private int total;

	public synchronized void deposit(int account) {
		total += account;

		/*
		 * LOAD total 0 ADD account0+1000 SAVE total
		 */
		// ����ȭ �Ѵ� (Synchronized)
		// ���ѹ� �Ծ�����ǿ�?

	}

	public int getTotal() {
		return total;
	}

}
