
package com.milk.model;

public class MilkModel {

	private DatabaseIO db;

	public MilkModel(DatabaseIO db) {
		this.db = db;
	}

	// int 값을 받아와서 no리턴
	public Milk selectStock(int no) {
		for (int i = 0; i < db.milkV.size(); i++) {
			Milk oldm = db.milkV.get(i);
			if (oldm.getNo() == no) {
				return oldm;
			}
		}
		return null;
	}// selectStock

	// 재고 갯수수정
	public void updateStock(Milk newm) {
		for (int i = 0; i < db.milkV.size(); i++) {
			Milk oldm = db.milkV.get(i);
			if (oldm.getNo() == newm.getNo()) {
				oldm.setStock(newm.getStock());
				break;
			}
		}
	}// updateStock

	// 판매량 더하기 + 개수 -1
	public void selectMilk(int no) {
		for (int i = 0; i < db.milkV.size(); i++) {
			Milk oldm = db.milkV.get(i);
			if (oldm.getNo() == no) {
				if (oldm.getStock() > 0) {
					oldm.setStock(oldm.getStock() - 1);
					if (oldm.getStock() == 0) {
						oldm.setOnSale(false);
					}
				}
			}

		}
	}

}// class