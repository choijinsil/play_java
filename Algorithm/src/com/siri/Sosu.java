package com.siri;

public class Sosu {

	// 2~1000������ �Ҽ��� ȭ�鿡 ����ϱ�
	public static void main(String[] args) {
		for (int base = 2; base <= 1000; base++) {// ���ؼ�(�Ҽ����� Ȥ�� �ռ������� �ľ�)
			int j;
			for (j = 2; j < base; j++) {// ������
				if (base % j == 0) {// 1�� �ڽ��� ���� �����ϰ� ������ ���ٸ�
					break;
				}
			}
			// System.out.println("base="+base+", j="+j)
			/*
			 * base j 2 2 3 3 4 2 5 5 6 2 7 7 8 2
			 */
			if (base == j)
				System.out.print(base + "   ");
		} // �ٱ� for��
	}// main
}
