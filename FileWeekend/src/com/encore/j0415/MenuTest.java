package com.encore.j0415;
import java.io.IOException;

// 패키지 선언
// 임포트 선언

public class MenuTest {

	// public, protected, default, private
	public static void main(String[] args) throws IOException {
		int num = 0; // 기본값을 반드시 넣어줘야 한다. 지역 변수이기 때문에

		do {
			System.out.println("<<메뉴>>");
			System.out.println("1.검색 2.증가 3.감소 4.종료");
			System.out.println("번호--->");
			num = System.in.read() - 48; // 번호 입력
			System.in.read();
			System.in.read();

			switch (num) {

			case 1:
				System.out.println("#검색결과: " + num);
				break;
			case 2:
				num++;
				System.out.println("1증가하였습니다.");
				break;
			case 3:
				num--;
				System.out.println("1감소하였습니다.");
				break;
			}
			System.out.println();

		} while (num != 4); // 반환할 조건
		System.out.println("--------END--------");

	}
}
