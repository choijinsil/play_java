import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];

		for (int i = 0; i < num.length; i++) {

			System.out.print("������ �Է��ϼ��� : ");
			num[i] = scan.nextInt();

			if (num[i] > 0) {
				System.out.println("�� ���� ���� ����Դϴ�.");
			} else if (num[i] == 0) {
				System.out.println("�� ���� ���� 0�Դϴ�.");
			} else {
				System.out.println("�� ���� ���� �����Դϴ�.");
			}
			System.out.println();
		}
	}
}
