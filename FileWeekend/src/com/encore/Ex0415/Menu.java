package com.encore.Ex0415;

public interface Menu { // �޴���
	
	/*public static final*/ int COIN=500;
	// final�� ������ �������� ����ؾ� �Ѵ�.
	//public�Ⱦ���. ����Ʈ �ε�
	// �̸��� ���� �Ǿ� �ִ� �޼ҵ� - Abstract method
	/*public abstract ����*/void Jajang();
	// ���� public�� �����ϴ�. �޴��� private�ϸ� �ȵǴϱ�

	/*public ����*/ abstract void Jambbong();
	// ����� �޼ҵ�: abstract method, abstract�� ���� �����ϴ�.
	
	public abstract void rice();
	
}
