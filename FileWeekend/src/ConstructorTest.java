class Abc
{

	int su; // �ɹ�����(�ʵ�) - ���� �޼ҵ尡 ������ �����͸� ǥ��, �⺻���� ����o
				// �⺻�� == ����: 0 �Ǽ�"0:0 ��: false Ŭ����: null

	Abc(){
		System.out.println("Abc�⺻������");
	}

	Abc(String name) {
		System.out.println("Abc�����ε�������");
	}

	void hello() {
		int min08; // ���� ���� - ���� �޼ҵ忡���� ����� �����͸� ǥ��, �⺻���� ����x
		// min=0; ������ �ݵ�� �ʱ�ȭ �ؼ� ���
		System.out.println("���ݸ� �ȳ�?" + su);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Abc a = new Abc();
		Abc a2 = new Abc("siri");
		// 1, �޸� �Ҵ� 2, ������ȣ��
		a.hello();
	}

}

