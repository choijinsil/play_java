package com.encore.j0415;

public class HongKong implements MenuPan { // �ֹ�
	// implements - ������ ���
	// �������̽��� ����� ��ŭ ��ð� �Ǿ�� ������ �ȳ���.
	// �ֹ��Ѱ� �� ��������! ���� �ֹ��̴�.

	public void Jambbong() {
		System.out.println("������ «�;�");
	}

	@Override // <--@ ������̼� JDK5�������� ����
				// �ִ� �Ͱ� ���� ���� �������� �θ�� �ڽ��� ���ؼ� �̸����� ���ϰ��� üũ
				// @Override�� ���ϰ� �Ǹ� �̸����� �޶� üũ�� ���ϰ� �ȴ�.
	public void Jajang() {
		System.out.println("�޴��� ¥���");
	}
	
	@Override
	public void rice() {
	}

	// �߰��Ǵ� ���� ��� ����. ����
	public void chobab() {
		System.out.println("�߰��� �ʹ�");
	}

}
