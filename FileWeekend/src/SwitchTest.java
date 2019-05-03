
public class SwitchTest {

	public static void main(String[] args) {

		int su = 5;

		switch (su) { // 수식의 데이터 값: 정수(byte, short, int, long), 문자(char), 문자열(String)
		case 1:
			System.out.println("안녕?");
			break; // <--------- switch블럭, 반복문 블럭 안에서 사용.
					// break를 감싸는 블럭을 벗어나는 역할이다! 깨뜨리다의 뜻
		case 2:
			System.out.println("xinchao");
			break;
		case 3:
			System.out.println("Hello");
			break;
		default: // 일치하는 case값이 없을때 실행할 문장
			System.out.println("감사합니다.");
		}
	}
}
