package com.encore.j0416;

public class My {
	int su; // �ɹ� ����, �ʵ� --> Ŭ�������� ���� �ٸ� �޼ҵ���� ������ ������

	public My() {

	}

	public int juwon() {
		// �߻��Ǵ� ������ : 300
		su = 300;
		// �߻��� ������ �ֱ�
		return su;
	}

}

class You {
	public void lime(int su) {
		// �ֿ��޼ҵ��� 300�� ���
		// System.out.println(su); // Ŭ������ �ٸ��� �ɹ� ���� ����� �ȵ� ���ۿ�
		// �ܺο��� ������ �ޱ�

		System.out.println(su);
	}
}