import java.util.Scanner;

public class MaxValuePrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max;
		System.out.println("�� ������ �ִ��� ���մϴ�.");

		System.out.print("a�� ��: ");
		int num1 = scan.nextInt();
		max = num1;
		System.out.print("b�� ��: ");
		int num2 = scan.nextInt();
		System.out.print("c�� ��: ");
		int num3 = scan.nextInt();

//		if (num1 > num2 && num1 > num3) {
//			System.out.println("�ִ밪��" + num1 + "�Դϴ�.");
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println("�ִ밪��" + num2 + "�Դϴ�.");
//		} else if (num3 > num1 && num3 > num2) {
//			System.out.println("�ִ밪�� " + num3 + "�Դϴ�.");
//		}

		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;

		System.out.println("�ִ��� " + max + " �Դϴ�.");

		su2();
	}

	public static void su2() {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int max = 0;

		for (int i = 0; i < num.length; i++) {

			System.out.print((i + 1) + "��° �� �Է�:");
			num[i] = scan.nextInt();

			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}

	public int maxOf(int i, int j, int k) {
		int max = i;
		if (j > max)
			max = j;
		if (k > max)
			max = k;

		return max;
	}

}
