public class JumsuTest {

	public static void main(String[] args) {
		
		BB bb=new BB();
		bb.bb();

		int jumsu1 = 0;

		// ------> ��°�: B�����Դϴ�!
		// - �񱳿����ڰ� �� �� ����.
		// - �񱳿����� ������� boolean������ �����µ� jumsu�ڷ����� ���� �ڷᰡ �ƴϱ⿡ ������ ������ ���.

		switch (jumsu1 / 10) {	// ���ǹ�
		case 10: // <--- 100���� ��� 10�� ���̽��� ������ �н��ϸ� case 9�� ���� �ȴ�.
					// 200�� �̻��� ��� default�� �Ѿ�� �Ǵµ� �̰� case������ ������ �� ����. if������ ���ξ� �Ѵ�.
		case 9:
			System.out.println("A�����Դϴ�.");
			break;
		case 8:
			System.out.println("B�����Դϴ�.");
			break;
		case 7:
			System.out.println("C�����Դϴ�.");
			break;
		case 6:
			System.out.println("D�����Դϴ�.");
			break;
		default:
			System.out.println("F�����Դϴ�.");
			break;
			
		}
	}
}

class BB {
	void bb() {
		int jumsu2 = 76;	// ���ǹ�
		if (100 >= jumsu2 && jumsu2>= 90) {
			System.out.println("A�����Դϴ�.");
		} else if (jumsu2 >= 80) {
			System.out.println("B�����Դϴ�.");
		} else if (jumsu2 >= 70) {
			System.out.println("C�����Դϴ�.");
		} else if (jumsu2 >= 60) {
			System.out.println("D�����Դϴ�.");
		} else {
			System.out.println("F�����Դϴ�.");
		}
	}
}


