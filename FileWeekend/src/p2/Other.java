package p2;

import p1.Parent;

public class Other {

	// �ڽĿ��� �θ�Ŭ������ �޼ҵ� ȣ��
	void callTest() {
		// ���۷����� ���� ����� ȣ���ؾ� �Ѵ�.
		
		Parent p = new Parent();

		p.m1();
		//p.m2(); <--����: protected�� ���� ��Ű������ ���� ����
		//p.m3();<-- ����: ����Ʈ(����)�� ���� ��Ű�������� ���� ����
		// p.m4();<-- private�� �ڽĵ� ������谡 �ƴ� Ŭ������ ȣ�� �Ұ�
	}
}
