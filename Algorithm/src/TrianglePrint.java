import java.util.Scanner;

public class TrianglePrint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;

		do {
			System.out.print("�� �� �ﰢ�� �Դϱ�?");
			num = scan.nextInt();

		} while (num <= 0);

		for (int dan = 0; dan <= num; dan++) {

			for (int i = 0; i < dan; i++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	
}
