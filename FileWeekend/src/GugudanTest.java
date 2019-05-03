import java.io.IOException;
import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) throws Exception {

//		System.out.println("����� �� �Է�!");
//		int input3 = System.in.read() - 48;
//
//		for (int i = 1; i < 10; i++) {
//			System.out.println(input3 + "x" + i + "=" + input3 * i);
//		}
		gugu5();
	}

	public static void gugu() {
		for (int i = 2; i < 10; i++) { // ������ �Ǵ� ���ڴ� �ٱ� for���� ��ġ�ϴ°� ��κ�

			System.out.println();
			System.out.println("====" + i + "��====");
			for (int j = 1; j < 10; j++) { // ���� ������ �Ǵ� �迭

				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}

	public static void gugu2() throws Exception {

		System.out.print("������ �� �Է�: ");
		int rd1 = System.in.read() - 48;
		System.in.read();
		System.in.read(); // 3 �Է½� <-- 51,13,10

		System.out.print("���� �� �Է�: ");
		int rd2 = System.in.read() - 48; // ���� �Է¹����� ����.
		System.in.read();
		System.in.read();

		for (int i = rd1; i <= rd2; i++) { // ������ �Ǵ� ���ڴ� �ٱ� for���� ��ġ�ϴ°� ��κ�

			System.out.println();
			System.out.println("====" + i + "��====");
			for (int j = 1; j < 10; j++) { // ���� ������ �Ǵ� �迭

				System.out.println(i + "x" + j + "=" + i * j);

			}
		}
	}

	public static void gugu3() {
		// 2*1=2 3*1=3 ....9*1=9
		// 2*2=4 3*2=6 ....9*2=18
		// ���⸦ ���� - �����̽���

		for (int i = 1; i < 10; i++) {

			for (int j = 2; j < 10; j++) {
				if (i * j < 10) {
					System.out.printf(j + "x" + i + "=" + i * j);
					System.out.print("   ");
				} else {
					System.out.print(j + "x" + i + "=" + i * j);
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	public static void gugu4() {
		// 2*1=2 3*1=3 ....9*1=9
		// 2*2=4 3*2=6 ....9*2=18
		// ���⸦ ���� -
		// ����(WhiteSpace): �Ѱ� �̻��� �����̽�(�� ĭ), ��(��������), ������ ����
		// <Escape Character> Escape Sequence Ȯ�幮��

		for (int i = 1; i < 10; i++) {

			for (int j = 2; j < 10; j++) {

				System.out.print(j + "x" + i + "=" + i * j);
				System.out.print("  ");

			}
			System.out.println();

		}
	}

	public static void gugu5() {
		// 2*1=2 3*1=3 ....9*1=9
		// 2*2=4 3*2=6 ....9*2=18
		// ���⸦ ���� - �����̽���

		for (int i = 1; i < 10; i++) {

			for (int j = 2; j < 10; j++) {
				System.out.printf("%d*%d=%-5d", j, i, j * i);

			}
			System.out.println();
		}
	}
}
