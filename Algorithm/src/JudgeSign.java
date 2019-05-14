import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];

		for (int i = 0; i < num.length; i++) {

			System.out.print("정수를 입력하세요 : ");
			num[i] = scan.nextInt();

			if (num[i] > 0) {
				System.out.println("이 수의 값은 양수입니다.");
			} else if (num[i] == 0) {
				System.out.println("이 수의 값은 0입니다.");
			} else {
				System.out.println("이 수의 값은 음수입니다.");
			}
			System.out.println();
		}
	}
}
