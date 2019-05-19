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

	// ��(����, ����) �ִ´�. ������ �ܾ��� ī���� - �ڹٺ��� ����
	// insert( 100��Ŭ��Ƚ��, 500�� Ŭ��Ƚ��...)
	public void insert(int cnt100, int cnt500, int cnt1000) {
		money = db.moneyV.get(0);

		int don100 = cnt100 * 100;
		money.setMoney100(money.getMoney100() + cnt100);
		int don500 = cnt500 * 500;
		money.setMoney500(money.getMoney500() + cnt500);
		int don1000 = cnt1000 * 1000;

		db.balance += (don100 + don500 + don1000);
	}

	// ���Ե� �ݾװ� ��ǰ���� ��
	public boolean comparePrice(Milk sellM) {
		if (sellM.getPrice() <= db.balance) {
			return true; //�ܾ��� �� ������
		} else {
			// ��Ʈ�ѷ��� ������
			//System.out.println("�ܾ��� �����մϴ�.");
			return false;  //�ܾ��� �����ϸ�
		}
	}

	// �ܾ� ���� �޼ҵ�(������ ��ǰ�� ���ݸ�ŭ �ܾ׿��� ����)
	public int minusBalance(Milk sellM) {
		db.balance -= sellM.getPrice();
		return db.balance;
	}
	
	// ���� �ܾװ� ���ؼ� �ܾ׺��� ũ�� ���� onSale(true)�� �Һ� ������ �ϱ�
	// ����ڰ� ������ �ܾ�ǥ�õ �ִ� �ݾ��� �����ͼ� ��ǰ���ݰ� ���ؼ� �� �� ���� ��쿡 onSale�� true�� �ٲ��ֱ�
		public void compareAll(int money) {
			for (int i = 0; i < db.milkV.size(); i++) {
				if (db.milkV.get(i).getPrice() <= money) {
					db.milkV.get(i).setOnSale(true);
					//System.out.println((i +1)+ " �� ����־��!");
				}else {
					db.milkV.get(i).setOnSale(false);
				}
			}
			//System.out.println("----------------------");
		}
	

	// =====================================�Ǹ���


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
	
	// ���� ����
	public void sumSales() {
		todaySum=0; //�ʱ�ȭ��
		for (int i = 0; i < db.milkV.size(); i++) {
			todaySum += db.milkV.get(i).getPrice() * db.milkV.get(i).getSell();
		}
	}

	//�ܵ���ȯ ���
	public void returnBalance(int balance) {  //don : ���� , balOP:�ݾ�
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

		//System.out.println("500�� : " + don500 + "��, 100�� : " + don100 + "��");
		//System.out.println("�� �� : " + balance);
		//System.out.println("���� �ܾ� ���� [500�� : " + money.getMoney500() + "��, 100�� : " + money.getMoney100() + "��]");

	}

	
	// ��ü �ܵ����� Ȯ�� �޼ҵ�(�ܵ��� ��ȯ�� �� ���� ��찡 ����� true�� ��ȯ��)
		public boolean checkTotalBalance() {
			if(   ( (db.moneyV.get(0).getMoney500()==0) && (db.moneyV.get(0).getMoney100()<9) )     
				|| ( (db.moneyV.get(0).getMoney500()>0) && (db.moneyV.get(0).getMoney100()<4) )  )
				return true; //�ܵ��� ��ȯ�� �� ���� ��
			else return false; //�ܵ��� ��ȯ�� �� ���� ��
		}
	
//	// ������ ���� Ȯ��
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