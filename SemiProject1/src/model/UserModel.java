package model;

import java.util.Vector;

public class UserModel {
	
	int balance = 1000;
	public Vector<Milk> milkV;

	public UserModel() {
		milkV = new Vector<Milk>();
		// public Milk(int no, String name, int price, int stock, int sell, boolean
		// onSale)
		Milk m1 = new Milk(0, "����", 1000, 1, 0, true);
		milkV.add(m1);
		Milk m2 = new Milk(1, "����", 800, 1, 0, true);
		milkV.add(m2);
		Milk m3 = new Milk(1, "����", 800, 1, 0, true);
	}

	// ��(����, ����) �ִ´�. ������ �ܾ��� ī���� - �ڹٺ��� ����
	public int insert(int money) {
		return balance += money;
	}

	// �ܾװ� ��ǰ���ݵ�� �� �� if �ܾ�<��ǰ���� ������ǰ�� �Ǹ��� false else �Ǹ��� true
	public void compare(Milk m) {
		// boolean isOk=true;

		for (int i = 0; i < milkV.size(); i++) {
			Milk milk = milkV.get(i);
			if (balance < milk.getPrice()) {
				// �ܾ�<������
				// setOnsale�� false�̸� ���� �Ǹź� off
				milk.setOnSale(false);

			} else {
				// setOnsale�� true�̸� ���� �Ǹź� on
				milk.setOnSale(true);
			}
		}
	}

	public void select(int selNo) {
		System.out.println("select���Դ�.");

		 for (int i = 0; i < milkV.size(); i++) {
		//for (int i = 0; i < 2; i++) {
			Milk milk = milkV.get(i);
			System.out.println("for��");
			if (milk.getNo() == selNo) {
				System.out.println(milk.getNo() + "�� ����");
				// �������ݺ��� �ܾ��� ������
				if (milk.getPrice() <= balance) {
					// ������ 0 ���� ũ�� ����
					System.out.println("if�� �ι�°" + balance);
					if (milk.getStock() > 0) {
						System.out.println("if�� ����°");
						balance -= milk.getPrice();
						milk.setStock(milk.getStock() - 1);

						if (milk.getStock() == 0) {
							milk.setOnSale(false);
						}
					}

				} else {
					// ��Ʈ�ѷ��� ������
					System.out.println("�ܾ��� �����մϴ�.");
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
 * ��ǰ ��� == 0 �Ǹ���ǥ�� ��Ȱ��ȭ �̻��̸� Ȱ��ȭ <-- ��ǰ�� ���Ա��� ������ ���� ǥ��
 * 
 * ��ǰ����! ��ǰ����<=�ܾ� Ȯ��, ��ǰ������� Ȯ��, �ܾ�-��ǰ����; ��ǰ���--1;
 * 
 */