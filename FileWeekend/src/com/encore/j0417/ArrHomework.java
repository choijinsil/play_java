package com.encore.j0417;

public class ArrHomework {
	public static void main(String[] args) {
		mission1();
		mission2();
		mission3();
		mission4();
		mission5();
		mission6();
		mission7();
	}

	public static void mission1() {
		// [����] int []su={ 1, 2, 3, 4, 5}; //���� [0] [1] [2] [3] [4]
		int[] su = { 1, 2, 3, 4, 5 };
		System.out.println("���� 1. ������� ���! \n ���� ���� for���� �̿�������");
		for (int i : su) { // for(����Ÿ�� �����̸� : �迭�̸�) --> ���� �̸��� ��½� �迭���� ������ ��Ƽ� ����
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
	}

	public static void mission2() {
		// ����2) �� �迭�� �����͸� �������� ����Ͻÿ�. (4����~0����)
		int[] su = { 1, 2, 3, 4, 5 };
		System.out.println("����2. �������� ���!");
		// for (int i = 4; i < 0; i--) {
		for (int i = su.length - 1; i > -1; i--) {
			System.out.print(su[i]);
			if (i > 0)
				System.out.print(",");
		}
		System.out.println();
	}

	public static void mission3() {
		// ����3) int su2[][]={ {1}, {1,2}, {1,2,3}}; su2�迭�� �����͸� �������� �Բ� ����Ͻÿ�. ---> ��)
		// su2[0][0]���� = 1 �� ��
		System.out.println(" ����3. 2�߹迭 �����͸� �������� �԰� ����ϱ�!");
		int su2[][] = { { 1 }, { 1, 2 }, { 1, 2, 3 } };

		for (int i = 0; i < su2.length; i++) {
			for (int j = 0; j < su2[i].length; j++) {
				System.out.println("su2[" + i + "][" + j + "]=" + su2[i][j]);
			}
		}
	}

	public static void mission4() {
		System.out.println("����4.");
		// ����4) su3 �̶�� �迭�� ���Ӱ� ���� [����]su�迭�� ���� �����Ͻÿ�. su3 = su;
		// (X) su3[2]=33; System.out.println(su[2]); // 3 ���
		int[] su = { 1, 2, 3, 4, 5 };
		int[] su3 = new int[su.length];
		// su3 = su; // su�� �ּҰ� su3���� ������ �ȴ�. <-- ���� �޸𸮸� �����ϴ� ���̶� ���� �ٲ�
		// ���� ��3�� ������ �޸𸮸� ����

		for (int i = 0; i < su.length; i++) {
			su3[i] = su[i]; // ������
		}

		// su3�� su�� ���� ���� �����ϱ� ������ ���� �ϳ��� ���� �ٲ�� �Ѵ� �ٲ��.
		su3[2] = 33;

		for (int i = 0; i < su3.length; i++) {
			System.out.println("su3[" + i + "]=" + su3[i]);
		}

		System.out.println();
		System.out.println("���� su���");
		for (int i = 0; i < su.length; i++) {
			System.out.println("su[" + i + "]=" + su[i]);
		}
	}

	public static void mission5() {
		System.out.println();
		System.out.println("���� 5. ");
		// ����5) [����]su�迭�� ----> for���� ���� [0]����~[4]�������� ����� ������ 5 4 3 2 1 �� ���� ��µǵ��� �Ͻÿ�.
		// [0]������ [4]���� ������ ��ȯ [1]������ [3]���� ������ ��ȯ �� ���!!
		int[] su = { 1, 2, 3, 4, 5 };

		// j: ��ȯ�� ������ ������ �ε��� 4,3
		int temp;
		for (int i = 0, j = su.length - 1; i < su.length / 2; i++, j--) {
			temp = su[i];
			su[i] = su[j];
			su[j] = temp;
		}

		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + "  ");
		}

//		for (int i = 0; i < su.length; i++) {
//			for (int j = i + 1; j < su.length; j++) {
//				temp = su[i];
//				su[i] = su[j];
//				su[j] = temp;
//			}
//			System.out.print(su[i] + "  ");
//		}
		System.out.println();
	}

	public static void mission6() {
		// ����6) su�迭�� Ȧ�������� ����Ͻÿ�.
		System.out.println();
		System.out.println("Ȧ������ ���");
		int[] su = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < su.length; i++) {
			if (su[i] % 2 == 0) {
				System.out.println("su[" + i + "]");
			}
		}
	}

	public static void mission7() {
		// ����7) su�迭�� Ȧ������ ����Ͻÿ�.
		System.out.println();
		System.out.println("Ȧ���� ���");
		int[] su = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < su.length; i++) {
			if (su[i] % 2 == 1) {
				System.out.print(su[i] + "  ");
			}
		}
	}
}
