package p1;

public class Other {

	// �ڽĿ��� �θ�Ŭ������ �޼ҵ� ȣ��
	void callTest() {
		// ���۷����� ���� ����� ȣ���ؾ� �Ѵ�.
		
		Parent p = new Parent();

		p.m1();
		p.m2();
		p.m3();
		// p.m4();<-- private�� �ڽĵ� ������谡 �ƴ� Ŭ������ ȣ�� �Ұ�
	}
}
