package com.milk.model;

import javax.swing.ImageIcon;

public class MilkModel {

	private DatabaseIO db;

	public MilkModel(DatabaseIO db) {
		this.db = db;
	}

	// 선택된 제품 확인
	public Milk selectStock(int no) {
		for (int i = 0; i < db.milkV.size(); i++) {
			Milk oldm = db.milkV.get(i);
			if (oldm.getNo() == no) {
				return oldm;
			}
		}
		return null;
	}

	// 재고 개수 수정
	public void updateStock(Milk newm) {
		for (int i = 0; i < db.milkV.size(); i++) {
			Milk oldm = db.milkV.get(i);
			if (oldm.getNo() == newm.getNo()) {
				oldm.setStock(newm.getStock());
				break;
			}
		}
	}

	// 재고유무확인
	public boolean checkStock(Milk sellM) {
		if (sellM.getStock() > 0) {
			return true; //재고가 있으면
		} else {
			return false; //재고가 없으면
		}
	}

	// 팔린 제품 재고 감소, 판매량 증가
	public void sellMilk(Milk sellM) {
		sellM.setStock(sellM.getStock() - 1);
		sellM.setSell(sellM.getSell() + 1);
	}
	
	//전제 재고유뮤 확인 메소드
	public boolean checkTotalStock() {
			int totalStock = 0;
				for (int i = 0; i < db.milkV.size(); i++) {
					totalStock += db.milkV.get(i).getStock();
				}
				if (totalStock==0) return true; //총재고가 없으면
				else return false; //총재고가 있으면
	}

}// class