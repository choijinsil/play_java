import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("키와 최댓값을 구합니다.");
//		System.out.print("사람수: ");
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
		System.out.println("키와 최댓값을 구합니다.");
		System.out.print("사람수: ");
		int pp = scan.nextInt();

		int[] height = new int[pp];

		for (int i = 0; i < pp; i++) {
			System.out.print("height[" + i + "]: ");
			height[i] = scan.nextInt();
		}

		// 메소드로 뺴봄 maxOfArray
//		int max = height[0];
//		for (int i = 1; i < height.length; i++) {
//
//			if (max < height[i]) {
//				max = height[i];
//			}
//		}

		System.out.println("최댓값 :" + maxOfArray(height));

	}

	// 최댓값 구하는 메소드
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
