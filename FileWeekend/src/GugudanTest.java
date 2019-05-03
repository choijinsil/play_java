import java.io.IOException;
import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) throws Exception {

//		System.out.println("출력할 단 입력!");
//		int input3 = System.in.read() - 48;
//
//		for (int i = 1; i < 10; i++) {
//			System.out.println(input3 + "x" + i + "=" + input3 * i);
//		}
		gugu5();
	}

	public static void gugu() {
		for (int i = 2; i < 10; i++) { // 기준이 되는 숫자는 바깥 for문에 위치하는게 대부분

			System.out.println();
			System.out.println("====" + i + "단====");
			for (int j = 1; j < 10; j++) { // 자주 변경이 되는 배열

				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}

	public static void gugu2() throws Exception {

		System.out.print("시작할 단 입력: ");
		int rd1 = System.in.read() - 48;
		System.in.read();
		System.in.read(); // 3 입력시 <-- 51,13,10

		System.out.print("끝날 단 입력: ");
		int rd2 = System.in.read() - 48; // 다음 입력받을게 없다.
		System.in.read();
		System.in.read();

		for (int i = rd1; i <= rd2; i++) { // 기준이 되는 숫자는 바깥 for문에 위치하는게 대부분

			System.out.println();
			System.out.println("====" + i + "단====");
			for (int j = 1; j < 10; j++) { // 자주 변경이 되는 배열

				System.out.println(i + "x" + j + "=" + i * j);

			}
		}
	}

	public static void gugu3() {
		// 2*1=2 3*1=3 ....9*1=9
		// 2*2=4 3*2=6 ....9*2=18
		// 띄어쓰기를 정렬 - 스페이스바

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
		// 띄어쓰기를 정렬 -
		// 공백(WhiteSpace): 한개 이상의 스페이스(한 칸), 탭(일정간격), 엔터의 조합
		// <Escape Character> Escape Sequence 확장문자

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
		// 띄어쓰기를 정렬 - 스페이스바

		for (int i = 1; i < 10; i++) {

			for (int j = 2; j < 10; j++) {
				System.out.printf("%d*%d=%-5d", j, i, j * i);

			}
			System.out.println();
		}
	}
}
