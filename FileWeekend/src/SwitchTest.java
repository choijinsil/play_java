
public class SwitchTest {

	public static void main(String[] args) {

		int su = 5;

		switch (su) { // ������ ������ ��: ����(byte, short, int, long), ����(char), ���ڿ�(String)
		case 1:
			System.out.println("�ȳ�?");
			break; // <--------- switch��, �ݺ��� �� �ȿ��� ���.
					// break�� ���δ� ���� ����� �����̴�! ���߸����� ��
		case 2:
			System.out.println("xinchao");
			break;
		case 3:
			System.out.println("Hello");
			break;
		default: // ��ġ�ϴ� case���� ������ ������ ����
			System.out.println("�����մϴ�.");
		}
	}
}
