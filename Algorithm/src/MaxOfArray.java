import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Ű�� �ִ��� ���մϴ�.");
//		System.out.print("�����: ");
//		int peopele = scan.nextInt();
//
//		int[] height = new int[peopele];
//		int max = 0;
//
//		for (int i = 0; i < peopele; i++) {
//			System.out.print("height[" + i + "]: ");
//			height[i] = scan.nextInt();
//
//			if (i == 0) {
//				max = height[0];
//			}
//
//			if (max < height[i]) {
//				max = height[i];
//			}
//		}
//		System.out.println(max);
		
		ex();
	}

	public static void ex() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("�����: ");
		int pp = scan.nextInt();

		int[] height = new int[pp];

		for (int i = 0; i < pp; i++) {
			System.out.print("height[" + i + "]: ");
			height[i] = scan.nextInt();
		}

		// �޼ҵ�� ���� maxOfArray
//		int max = height[0];
//		for (int i = 1; i < height.length; i++) {
//
//			if (max < height[i]) {
//				max = height[i];
//			}
//		}

		System.out.println("�ִ� :" + maxOfArray(height));

	}

	// �ִ� ���ϴ� �޼ҵ�
	public static int maxOfArray(int[] height) {
		int max = height[0];
		for (int i = 1; i < height.length; i++) {

			if (max < height[i]) {
				max = height[i];
			}
		}
		return max;
	}
}
