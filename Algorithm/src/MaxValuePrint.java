import java.util.Scanner;

public class MaxValuePrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max;
		System.out.println("세 정수의 최댓값을 구합니다.");

		System.out.print("a의 값: ");
		int num1 = scan.nextInt();
		max = num1;
		System.out.print("b의 값: ");
		int num2 = scan.nextInt();
		System.out.print("c의 값: ");
		int num3 = scan.nextInt();

//		if (num1 > num2 && num1 > num3) {
//			System.out.println("최대값은" + num1 + "입니다.");
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println("최대값은" + num2 + "입니다.");
//		} else if (num3 > num1 && num3 > num2) {
//			System.out.println("최대값은 " + num3 + "입니다.");
//		}

		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;

		System.out.println("최댓값은 " + max + " 입니다.");

		su2();
	}

	public static void su2() {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int max = 0;

		for (int i = 0; i < num.length; i++) {

			System.out.print((i + 1) + "번째 값 입력:");
			num[i] = scan.nextInt();

			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("최댓값은 " + max + "입니다.");
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
