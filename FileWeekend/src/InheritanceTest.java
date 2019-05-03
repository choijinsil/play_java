// ���
// ������ Ŭ������ ������ ������ ���� �����
// �����ϴ� ���� default��� �Ѵ�. 
// �����Ϸ��� import java.lang.*;�� �ڵ� �߰����ش�. 
class Parent { // �����Ϸ��� extends Object�� �ڵ����� �߰����ش�.
	int i = 11;

	void hello() {
		System.out.println("�ȳ�?");
	}

	void hello(String name) { // <--�����ε�: ���� �޼ҵ�� ���Ƶ� ���ڰ��� �ٸ��� �ִ� ��
								// �ڷ����� �޶�� �Ѵ�!
		System.out.println("�ȳ�," + name);
	}

	void hello(int age) { // <-- �����ε� �޼ҵ�
		System.out.println("�ȳ�," + age);
	}

	void print() {
		System.out.println("�θ�����Ʈ ~!");
	}
}

class Child extends Parent {
	// is a <-- �ڽ��� �θ��!
	// �ڽ�Ŭ������ �θ�Ŭ������ ����ȯ�� �����ϴ�.
	int j = 22;

	void goodBye() {
		System.out.println("�ȳ���������~!");
	}

	void print() { // <-- �������̵�: ������ ��Ӱ����� ����. (������ �޼ҵ�)! �ڽ����� ����
		System.out.println("�ڽ�����Ʈ ~!!");
	}
}

public class InheritanceTest { // �� Ŭ����

	public static void main(String[] args) {

		Child c = new Child(); // <-- �޸�: Object, Parent, Child
		// �ڽ��� �ڿ�
		System.out.println("---�ڽ��� �ڿ�---");
		System.out.println("J=" + c.j);
		c.goodBye();
		c.print();

		// �θ��� �ڿ�
		System.out.println("---�θ��� �ڿ�---");
		c.hello();
		// c.abc(); <-- �������� �ʾƼ� ����!
		c.toString();// <--�������� �ߵǴ� ������? object(����)Ŭ������ toString()�޼ҵ尡 ���ǵǾ� �ֱ� �����̴�.

		System.out.println("=============");
		Parent p = new Parent(); // �޸� �Ҵ�: Object, Parent

		p.hello();
		p.print();

		/*
		 * �ڽ��� �ڿ� �⺻: �θ���������(p)�� ���� �ڽ� ���� �Ұ���!
		 */
		System.out.println("=============");
		Parent p2 = new Child(); // �޸� �Ҵ�: O P C
		p2.hello();
		p2.print(); // <-- �⺻��Ģ: �θ����� ���� �ڽ� ȣ�� �Ұ�
					// �� ����: �������̵� �޼ҵ�� ȣ�� ����!
					// ��Ȯ�� �������̵� �޼ҵ尡 �����Ѵٸ� �θ��� �޼ҵ�� ����ǰ� �ڽ��� �޼ҵ�� ��ü�� �ȴ�.

		// cannot find symbol <-- ���ǵ� �޼ҵ尡 ����.
		// Parent p2= new Child(); <-- ���� incompatible type: ȣȯ�� ���� �ʴ� �ڷ����� �������ϴ�.
		// Child�� Parent�� ��ȯ �� �� ����.
		// Object p2=new Child(); //��, �� <--����

	}
}
