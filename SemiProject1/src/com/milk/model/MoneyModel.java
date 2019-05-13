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

	// ��(����, ����) �ִ´�. ������ �ܾ��� ī���� - �ڹٺ��� ����
	// insert( 100��Ŭ��Ƚ��, 500�� Ŭ��Ƚ��...)
	public int insert(int cnt100, int cnt500, int cnt1000) {

		int don100 = cnt100 * 100;
		int don500 = cnt500 * 500;
		int don1000 = cnt1000 * 1000;

		return db.balance += (don100 + don500 + don1000);
	}

	// ���Ե� �ݾװ� ���õ� ��ǰ���� ��
	public boolean comparePrice(Milk sellM) {
		if (sellM.getPrice() <= db.balance) {
			return true;
		} else {
			// ��Ʈ�ѷ��� ������
			System.out.println("�ܾ��� �����մϴ�.");
			return false;
		}
	}

	// �ܾ� ���� �޼ҵ�
	public int minusBalance(Milk sellM) {
		db.balance -= sellM.getPrice();
		return db.balance;
	}

	// ���� �ܾװ� ���ؼ� �ܾ׺��� ũ�� ���� true�� �Һ� ������ �ϱ� siri����
	public void compareAll(int money) {

		for (int i = 0; i < db.milkV.size(); i++) {

			if (db.milkV.get(i).getPrice() <= money) {
				db.milkV.get(i).setOnSale(true);
				System.out.println((i +1)+ " �� ����־��!");
				
			}else {
				db.milkV.get(i).setOnSale(false);
			}
		}
		System.out.println("----------------------");
	}
	// =====================================�Ǹ���

	// ������ ���� Ȯ��
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

	// ��ǰ ���� ����
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