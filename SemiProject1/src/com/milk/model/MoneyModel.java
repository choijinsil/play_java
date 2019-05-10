package com.milk.model;

import java.util.Vector;

public class MoneyModel {
	int balance = 0;
	private DatabaseIO db;

	int sum; // sumSales

	public MoneyModel(DatabaseIO db) {
		this.db = db;
	}

	public MoneyModel() {

	}

	// 돈(동전, 지폐) 넣는다. 넣으면 잔액이 카운팅 - 자바빈즈 저장
	// insert( 100원클릭횟수, 500원 클릭횟수...)
	public int insert(int cnt100, int cnt500, int cnt1000) {

		
		int don100 = cnt100 * 100;
		int don500 = cnt500 * 500;
		int don1000 = cnt1000 * 1000;

		System.out.println("돈이다.");
		return balance += (don100 + don500 + don1000);
	}

	// 투입된 금액과 제품가격 비교
	public void priceCompare(int selNo) {
		for (int i = 0; i < db.milkV.size(); i++) {
			// 우유가격보다 잔액이 많으면
			Milk milk = db.milkV.get(i);
			if (milk.getPrice() <= balance) {
				balance -= milk.getPrice();

			} else {
				// 컨트롤러로 보내기
				System.out.println("잔액이 부족합니다.");
				return;
			}
		}
	}

	// =====================================판매자
	// 가격 확인
	public Milk selectPrice(int no) {

		for (int i = 0; i < db.milkV.size(); i++) {
			int vno = db.milkV.get(i).getNo();
			if (no == vno) {
				Milk milk = db.milkV.get(i);
				return milk;
			}
		}
		return null;
	}

	public void updatePrice(Milk milk) {
		for (int i = 0; i < db.milkV.size(); i++) {
			Milk oldmilk = db.milkV.get(i);
			if (oldmilk.getNo() == milk.getNo()) {
				oldmilk.setPrice(milk.getPrice());
				break;
			}
		}
	}

	// 총 판매액
	public void sumSales() {
		for (int i = 0; i < db.milkV.size(); i++) {
			sum += db.milkV.get(i).getPrice() * db.milkV.get(i).getSell();
		}
	}

}
