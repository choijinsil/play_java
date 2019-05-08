package com.thread.mission;

// ��۱�
public class TVContribution {

	public static void main(String[] args) {

		TVContribution tv = new TVContribution();
		Account account = new Account();

		Customer[] customers = new Customer[5];
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer(account); // ������ ��ü �ټ���
		}

		// ��� ����
		for (int i = 0; i < customers.length; i++) {
			customers[i].start();
		}

		// ������ �����尡 ������ ��(return;) ���� ��ٸ���
		try {
			for (int i = 0; i < customers.length; i++) {
				customers[i].join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("�� ��ݾ� : " + account.getTotal());

//		Customer c1= new Customer(account);
//		Customer c2= new Customer(account);

		// c1~c5 Thread��ü

	}

}
