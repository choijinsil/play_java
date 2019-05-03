import java.io.BufferedReader;
// 임포트: 현재 클래스에서 사용하고자 하는 클래스의 위치(클래스가 들어간 패키지)를 표현
// 어떤 패키지에 속한 어떤 클래스를 사용하겠다.
// 형식) import 패키지명.클래스명;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 do ~while
 미션) 아래와 같은 실행을 할 수 있게 프로그램을 작성하시오.
     (do~while문 사용)

[실행결과]
===========================
<<메뉴>>
1.검색 2.증가 3.감소 4.종료
번호==> 1
#검색결과: 0

<<메뉴>>
1.검색 2.증가 3.감소 4.종료
번호==> 2
#1증가하였습니다.

<<메뉴>>
1.검색 2.증가 3.감소 4.종료
번호==> 1
#검색결과: 3

<<메뉴>>
1.검색 2.증가 3.감소 4.종료
번호==> 3
#1감소하였습니다.

<<메뉴>>
1.검색 2.증가 3.감소 4.종료
번호==> 1
#검색결과: 2

<<메뉴>>
1.검색 2.증가 3.감소 4.종료
번호==> 4

-- END --
 */

public class Homework_01 {

	// IoException과 Exception의 차이?
	// Exception은 상위 클래스이기 대문에 대신 사용해도 무방하다.
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int sum = 0;
		boolean isBreak = false;

		do {
			System.out.println();
			System.out.println("<<메뉴>>");
			System.out.println("1.검색 2.증가 3.감소 4.종료");
			System.out.print("번호");
			input = in.readLine();

			if ("1".equals(input)) {
				System.out.println("# 검색결과:" + sum);
			} else if ("2".equals(input)) {
				++sum;
				System.out.println("# 1 증가하였습니다.");

			} else if ("3".equals(input)) {
				// 0-1 =-1
				if (sum > 0) {
					sum--;
					System.out.println("# 1 감소하였습니다.");
				} else {
					System.out.println("※ 땡 틀렸습니다. ※");
					continue;
				}
			} else if ("4".equals(input)) {
				System.out.println("종료되었습니다.");
				isBreak = true;
			} else {
				System.out.println("숫자를 잘못 입력했어요. 다시 입력해주세요.");
				
				continue;
			}
		} while (!isBreak);
	}
}
