import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("n의값: ");
		int n = scan.nextInt();

		do {

			if (n <= 0) {
				System.out.print("n의값을 양수로 입력해주세요: ");
				n = scan.nextInt();
			} else {
				break;
			}
			
		} while (true);

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1~" + n + "까지의 총합: " + sum);

	}
}
