public class ForTest {
	public static void main(String[] args) {

		Z1 z1 = new Z1();
		z1.op();
		
	}
}

class Z1 {
	void op() {

		System.out.println("======1���� 5���� ���======");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1); // <-- println�� line new(����), �ٹٲ��� �����Ѵ�.
		}

		// 1 2 3 4 5
		System.out.println("======1 2 3 4 5 �� ���======");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + " "); // <--print�� ������ ��¸��Ѵ�.
		}

		System.out.println();// ����

		System.out.println("======5 4 3 2 1 �� ���======");
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println(); // ����
		System.out.println("======3 6 9 12 �� ���======");
		System.out.print("[");
		for (int i = 3; i < 13; i += 3) {
			// i+=3;
			System.out.print(i); // 4ȸ
			if (i < 12) {
				System.out.print(",  "); // 3ȸ
			}
		}
		System.out.println("]");
		//
	}
}