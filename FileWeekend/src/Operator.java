
public class Operator {

	public static void main(String[] args) {
		int su;
		su = 40;

		System.out.println(1 + 2 + "�ȳ�"); // ������ ��ġ�� ���ڿ��� ���ϴ°�

		System.out.println("�ȳ�" + 1 + 2); // ���ڿ��� ���� �־ �ڿ� ���ڵ��� ���ڷ� �ν��̵�

		// ����������
		int su1 = 300;
		su1 = su1 + 1;

		int su3 = 50;
		System.out.println(su3);
		su3++;
		System.out.println(su3);
		++su3;
		System.out.println(su3);
		System.out.println("su3++(����������)==>" + su3++);
		System.out.println("++su3(����������)==>" + ++su3);

		// ���� �� �˾Ƶα�
		// ++ su3 �� ���� �����ڷ� Ÿ ����� ���� ����Ұ�� ��� �����ϰ� �ٸ� ���� ����Ұ� ��¸�
		// su3++�� ���� �����ڷ� Ÿ ����� ���� ����� ��� �ٸ������� ���� ����ϰ� ����� ������
		// �ٸ� �����ڿ��� System.out.println�� ����

		// int�� �ѹ��� ���� ������
		int a = 3, b = 4;

		int x = 10;
		int y = 20;
		int z = 30;

		int year = 2019;

		if (year % 4 == 0 || year % 100 == 0) {
			System.out.println("�����Դϴ�.");
		} else if (year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}

	}
}
