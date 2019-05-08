package com.thread.mission;

// 방송국
public class TVContribution {

	public static void main(String[] args) {

		TVContribution tv = new TVContribution();
		Account account = new Account();

		Customer[] customers = new Customer[5];
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer(account); // 스레드 객체 다섯개
		}

		// 모금 시작
		for (int i = 0; i < customers.length; i++) {
			customers[i].start();
		}

		// 실행한 스레드가 종료할 때(return;) 까지 기다리자
		try {
			for (int i = 0; i < customers.length; i++) {
				customers[i].join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("총 모금액 : " + account.getTotal());

//		Customer c1= new Customer(account);
//		Customer c2= new Customer(account);

		// c1~c5 Thread객체

	}

}
