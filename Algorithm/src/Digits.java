import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.println("2�ڸ��� ������ �Է��ϼ��� !");
		do {
			System.out.print("�Է�: ");
			input = scan.nextInt();

			// } while (!(input >= 10) && (input <= 99));
		} while ((input < 10) || (input > 99));	
		// (iput<10) || input(>99)
		System.out.println("���� no�� ���� " + input + " �� �Ǿ����ϴ�.");
	}
}
