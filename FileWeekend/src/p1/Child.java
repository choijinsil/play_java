package p1;

public class Child extends Parent {

	// �ڽĿ��� �θ�Ŭ������ �޼ҵ� ȣ��
	void callTest() {
		m1();
		m2();
		m3();
		// m4();<--private���� ������ �־� �� �� ����.
	}
}
