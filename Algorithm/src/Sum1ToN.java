import java.util.Scanner;

public class Sum1ToN {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int sum = 0;
		System.out.print("n�ǰ�: ");
		int n=scan.nextInt();

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1~"+n+"������ ����: " + sum);
	}
}
