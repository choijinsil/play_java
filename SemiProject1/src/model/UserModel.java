package model;

import java.util.Vector;

public class UserModel {
	
	int balance = 1000;
	public Vector<Milk> milkV;

	public UserModel() {
		milkV = new Vector<Milk>();
		// public Milk(int no, String name, int price, int stock, int sell, boolean
		// onSale)
		Milk m1 = new Milk(0, "초코", 1000, 1, 0, true);
		milkV.add(m1);
		Milk m2 = new Milk(1, "딸기", 800, 1, 0, true);
		milkV.add(m2);
		Milk m3 = new Milk(1, "딸기", 800, 1, 0, true);
	}

	// 돈(동전, 지폐) 넣는다. 넣으면 잔액이 카운팅 - 자바빈즈 저장
	public int insert(int money) {
		return balance += money;
	}

	// 잔액과 제품가격들과 비교 값 if 잔액<제품가격 개별제품의 판매중 false else 판매중 true
	public void compare(Milk m) {
		// boolean isOk=true;

		for (int i = 0; i < milkV.size(); i++) {
			Milk milk = milkV.get(i);
			if (balance < milk.getPrice()) {
				// 잔액<우유값
				// setOnsale이 false이면 개별 판매불 off
				milk.setOnSale(false);

			} else {
				// setOnsale이 true이면 개별 판매불 on
				milk.setOnSale(true);
			}
		}
	}

	public void select(int selNo) {
		System.out.println("select들어왔다.");

		 for (int i = 0; i < milkV.size(); i++) {
		//for (int i = 0; i < 2; i++) {
			Milk milk = milkV.get(i);
			System.out.println("for문");
			if (milk.getNo() == selNo) {
				System.out.println(milk.getNo() + "번 들어옴");
				// 우유가격보다 잔액이 많으면
				if (milk.getPrice() <= balance) {
					// 갯수가 0 보다 크면 구매
					System.out.println("if문 두번째" + balance);
					if (milk.getStock() > 0) {
						System.out.println("if문 세번째");
						balance -= milk.getPrice();
						milk.setStock(milk.getStock() - 1);

						if (milk.getStock() == 0) {
							milk.setOnSale(false);
						}
					}

				} else {
					// 컨트롤러로 보내기
					System.out.println("잔액이 부족합니다.");
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		UserModel user = new UserModel();
		user.select(1);
	}

}

/*
 * 제품 재고 == 0 판매중표시 비활성화 이상이면 활성화 <-- 제품이 투입구에 나오고 난후 표시
 * 
 * 제품선택! 제품가격<=잔액 확인, 제품재고유무 확인, 잔액-제품가격; 제품재고--1;
 * 
 */