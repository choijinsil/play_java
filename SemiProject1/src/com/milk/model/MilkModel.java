package com.milk.model;

import javax.swing.ImageIcon;

public class MilkModel {

	private DatabaseIO db;

	public MilkModel(DatabaseIO db) {
		this.db = db;
	}

	// ���õ� ��ǰ Ȯ��
	public Milk selectStock(int no) {
		for (int i = 0; i < db.milkV.size(); i++) {
			Milk oldm = db.milkV.get(i);
			if (oldm.getNo() == no) {
				return oldm;
			}
		}
		return null;
	}

	// ��� ���� ����
	public void updateStock(Milk newm) {
		for (int i = 0; i < db.milkV.size(); i++) {
			Milk oldm = db.milkV.get(i);
			if (oldm.getNo() == newm.getNo()) {
				oldm.setStock(newm.getStock());
				break;
			}
		}
	}

	// �������Ȯ��
	public boolean checkStock(Milk sellM) {
		if (sellM.getStock() > 0) {
			return true; //��� ������
		} else {
			return false; //��� ������
		}
	}

	// �ȸ� ��ǰ ��� ����, �Ǹŷ� ����
	public void sellMilk(Milk sellM) {
		sellM.setStock(sellM.getStock() - 1);
		sellM.setSell(sellM.getSell() + 1);
	}
	
	//���� ������� Ȯ�� �޼ҵ�
	public boolean checkTotalStock() {
			int totalStock = 0;
				for (int i = 0; i < db.milkV.size(); i++) {
					totalStock += db.milkV.get(i).getStock();
				}
				if (totalStock==0) return true; //����� ������
				else return false; //����� ������
	}

}// class