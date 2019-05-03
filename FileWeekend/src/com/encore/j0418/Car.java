package com.encore.j0418;

// CarŬ���� ��ü�� ��
public class Car {
// �ɹ������� �⺻��: 
	String carName;
	int wheelNum;
	int velocity;

	// public Car(){} �����Ϸ��� �⺻���� �������� �μ����� ������ �ȵȴ�.
	public Car(String carName, int wheelNum, int velocity) {
		super();
		this.carName = carName;
		this.wheelNum = wheelNum;
		this.velocity = velocity;
	}

	public boolean equals(Car c) {

		// ** ���ڿ� ���� ��
		// s1==s2 : �޸� ��
		// s1.equals(s2): ��(����) ��
		// int su<-- �⺻�ڷ����̶� �Ӽ��ڷ���

		if (carName == c.carName && wheelNum == c.wheelNum && velocity == c.velocity) {
			return true;
		} else {
			return false;
		}
	}

//	public String toString() { // to~�޼ҵ�: ��ȯ�޼ҵ�
//		// <-- ��ü�� ���¸� Ȯ���ϴ� �޼ҵ�(�ʵ��� ���� ���������� ǥ��)
//		String str = "�� ���� " + carName + "�̰� ������ ���� " + wheelNum + ", �ӵ��� " + velocity + "�Դϴ�.";
//		return str;
//	}
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", wheelNum=" + wheelNum + ", velocity=" + velocity + "]";
	}
	

	// ���δٸ� �� �ΰ����� ���ϴ� ���
	public static void main(String[] args) {

		Car c1 = new Car("�ҳ�Ÿ", 4, 100); // new������ �׻� ������ ȣ���� �´�.
		Car c2 = new Car("�׷���", 4, 200);
		// ** c1�� c2�� ��
		// 1. ���۷��� ��(����==�޸�) �� <- �������(��ȣ)�� ���� ��
		// c1==c2; // ����, �� �� <- false�� ���´�. ��? new�� �ι� �������ŵ�! �ּҰ��� ���ϱ� �����̾�.
		// �޸� �ּҰ� 2���ϱ� �翬 false�� ���� ���ۿ�

		// WapperŬ����
		// ���� �ڷ��� , �⺻�ڷ��� 8��,
		if (c1 == c2) {
			System.out.println("���۷��� ����!!");
		} else {
			System.out.println("���۷��� �ٸ�!!");
		}
		// 2. ���� ��
		String result = (c1 == c2) ? "���۷�������" : "���۷��� �ٸ�";
		System.out.println("��� : " + result);

		System.out.println(c1.toString());
		System.out.println(c2.equals(c1));

//		// ���� ����
//		System.out.println("�ȳ�");
//
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
//		System.out.println(args.getClass().getTypeName());
//		System.out.println(args[2] + 300);
//		System.out.println(Integer.parseInt(args[2]) + 300);
	}

	

}
