package com.encore.Ex0415;

public class HongKong implements Menu{	// �ֹ�
	// implements ������ ���
	// �������̽��� ����� ��ŭ ��ð� �Ǿ�� ������ �ȳ���..
	// �ֹ��Ѱ� �� ����� �ֹ��Դϴ�.
	
	public void Jambbong() {
		System.out.println("������ «�;�");
	}

	@Override
	// @ ������̼��� JDK5�������� �����ȴ�.
	// �մ°Ͱ� ���� ���� �������� �θ�� �ڽ��� ���ؼ�
	// �̸� ���ϰ��� üũ�� �ش�.
	// �������̵带 ���ϰ� �Ǹ� �̸����� �޶� üũ��
	// ���ϰ� �ȴ�
	public void Jajang() {
		System.out.println("¥���ϴ���?");
		
	}

	@Override
	public void rice() {
		System.out.println("���� ���̴ٿ�");
		// TODO Auto-generated method stub
		
	}
	
	
	

}
