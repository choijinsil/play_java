package com.thread.mission;

// ������
public class Customer extends Thread {
	Account account;

	public Customer(Account account) {
		this.account = account;
	}

	@Override
	public void run() {

		try {
			for (int i = 1; i < 200; i++) {

				Thread.sleep(50); // 1000�� �ָ� 1�� 40�� 0.05��
				account.deposit(1000);
				System.out.println(getName() + " : " + i + "ȸ");

				if (account.getTotal() >= 500000) { // ��ǥ��(���ʸ���) �޼�
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
