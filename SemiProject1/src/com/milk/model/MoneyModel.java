package com.milk.model;

public class MoneyModel {

	private DatabaseIO db;
	private Money money;

	public int todaySum;// sumSalse
	public int don500 = 0, don100 = 0, don1000=0;

	public MoneyModel(DatabaseIO db) {
		this.db = db;
	}

	public MoneyModel() {

	}

	// 돈(동전, 지폐) 넣는다. 넣으면 잔액이 카운팅 - 자바빈즈 저장
	// insert( 100원클릭횟수, 500원 클릭횟수...)
	public void insert(int cnt100, int cnt500, int cnt1000) {
		money = db.moneyV.get(0);

		int don100 = cnt100 * 100;
		money.setMoney100(money.getMoney100() + cnt100);
		int don500 = cnt500 * 500;
		money.setMoney500(money.getMoney500() + cnt500);
		int don1000 = cnt1000 * 1000;

		db.balance += (don100 + don500 + don1000);
	}

	// 투입된 금액과 제품가격 비교
	public boolean comparePrice(Milk sellM) {
		if (sellM.getPrice() <= db.balance) {
			return true; //잔액이 더 많으면
		} else {
			// 컨트롤러로 보내기
			//System.out.println("잔액이 부족합니다.");
			return false;  //잔액이 부족하면
		}
	}

	// 잔액 차감 메소드(선택한 제품의 가격만큼 잔액에서 차감)
	public int minusBalance(Milk sellM) {
		db.balance -= sellM.getPrice();
		return db.balance;
	}
	
	// 넣은 잔액과 비교해서 잔액보다 크면 전부 onSale(true)로 불빛 들어오게 하기
	// 사용자가 투입한 잔액표시등에 있는 금액을 가져와서 제품가격과 비교해서 살 수 있을 경우에 onSale을 true로 바꿔주기
		public void compareAll(int money) {
			for (int i = 0; i < db.milkV.size(); i++) {
				if (db.milkV.get(i).getPrice() <= money) {
					db.milkV.get(i).setOnSale(true);
					//System.out.println((i +1)+ " 번 살수있어요!");
				}else {
					db.milkV.get(i).setOnSale(false);
				}
			}
			//System.out.println("----------------------");
		}
	

	// =====================================판매자


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
	
	// 금일 매출
	public void sumSales() {
		todaySum=0; //초기화용
		for (int i = 0; i < db.milkV.size(); i++) {
			todaySum += db.milkV.get(i).getPrice() * db.milkV.get(i).getSell();
		}
	}

	//잔돈반환 계산
	public void returnBalance(int balance) {  //don : 개수 , balOP:금액
		int balOp = balance;

		money = db.moneyV.get(0);

		don1000 = balOp / 1000;
		balOp = balOp - (don1000 * 1000);

		don500 = balOp / 500;
		balOp = balOp - (don500 * 500);
		money.setMoney500(money.getMoney500() - don500);

		don100 = balOp / 100;
		balOp = balOp - (don100 * 100);
		money.setMoney100(money.getMoney100() - don100);

		//System.out.println("500원 : " + don500 + "개, 100원 : " + don100 + "개");
		//System.out.println("총 액 : " + balance);
		//System.out.println("남은 잔액 개수 [500원 : " + money.getMoney500() + "개, 100원 : " + money.getMoney100() + "개]");

	}

	
	// 전체 잔돈유무 확인 메소드(잔돈을 반환할 수 없을 경우가 생기면 true를 반환함)
		public boolean checkTotalBalance() {
			if(   ( (db.moneyV.get(0).getMoney500()==0) && (db.moneyV.get(0).getMoney100()<9) )     
				|| ( (db.moneyV.get(0).getMoney500()>0) && (db.moneyV.get(0).getMoney100()<4) )  )
				return true; //잔돈을 반환할 수 없을 때
			else return false; //잔돈을 반환할 수 있을 때
		}
	
//	// 관리자 가격 확인
//	public Milk selectPrice(int no) {
//		for (int i = 0; i < db.milkV.size(); i++) {
//			int noV = db.milkV.get(i).getNo();
//			if (no == noV) {
//				Milk milk = db.milkV.get(i);
//				return milk;
//			}
//		}
//		return null;
//	}

}