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

	// ��(����, ����) �ִ´�. ������ �ܾ��� ī���� - �ڹٺ��� ����
	// insert( 100��Ŭ��Ƚ��, 500�� Ŭ��Ƚ��...)
	public int insert(int cnt100, int cnt500, int cnt1000) {

		
		int don100 = cnt100 * 100;
		int don500 = cnt500 * 500;
		int don1000 = cnt1000 * 1000;

		System.out.println("���̴�.");
		return balance += (don100 + don500 + don1000);
	}

	// ���Ե� �ݾװ� ��ǰ���� ��
	public void priceCompare(int selNo) {
		for (int i = 0; i < db.milkV.size(); i++) {
			// �������ݺ��� �ܾ��� ������
			Milk milk = db.milkV.get(i);
			if (milk.getPrice() <= balance) {
				balance -= milk.getPrice();

			} else {
				// ��Ʈ�ѷ��� ������
				System.out.println("�ܾ��� �����մϴ�.");
				return;
			}
		}
	}

	// =====================================�Ǹ���
	// ���� Ȯ��
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

	// �� �Ǹž�
	public void sumSales() {
		for (int i = 0; i < db.milkV.size(); i++) {
			sum += db.milkV.get(i).getPrice() * db.milkV.get(i).getSell();
		}
	}

}
