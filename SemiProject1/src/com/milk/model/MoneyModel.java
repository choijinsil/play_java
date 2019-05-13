package com.milk.model;

import java.util.Vector;

public class MoneyModel {

	private DatabaseIO db;

	public int sum;// sumSalse

	// public Vector<Milk> milkV;

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

		return db.balance += (don100 + don500 + don1000);
	}

	// 투입된 금액과 선택된 제품가격 비교
	public boolean comparePrice(Milk sellM) {
		if (sellM.getPrice() <= db.balance) {
			return true;
		} else {
			// 컨트롤러로 보내기
			System.out.println("잔액이 부족합니다.");
			return false;
		}
	}

	// 잔액 차감 메소드
	public int minusBalance(Milk sellM) {
		db.balance -= sellM.getPrice();
		return db.balance;
	}

	// 넣은 잔액과 비교해서 잔액보다 크면 전부 true로 불빛 들어오게 하기 siri수정
	public void compareAll(int money) {

		for (int i = 0; i < db.milkV.size(); i++) {

			if (db.milkV.get(i).getPrice() <= money) {
				db.milkV.get(i).setOnSale(true);
				System.out.println((i +1)+ " 번 살수있어요!");
				
			}else {
				db.milkV.get(i).setOnSale(false);
			}
		}
		System.out.println("----------------------");
	}
	// =====================================판매자

	// 관리자 가격 확인
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

	// 제품 가격 변경
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