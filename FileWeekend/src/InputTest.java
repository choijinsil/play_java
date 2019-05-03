
public class InputTest {

	public static void main(String[] args) throws Exception { // 결국은 예외처리를 하지 않겠다는 말이다.

		System.out.print("한자리 수를 입력==>");
		int input = System.in.read() - 48;// <-- 입력받는 시점, 대기모드, 무한루프
											// <--3입력받기 위해선 커멘드 창을 열어줘야 한다.
		
		// 엔터 <-- 13, 10을 처리한다. 
		System.in.read(); // 13처리(아래로)
		System.in.read(); // 10처리(왼쪽으로)

		System.out.print("동일한 수를 다시 입력: ");
		int input2 = System.in.read(); // <-- 현재 read는 13이다. 그래서 출력값이 안나온다.
		
		System.out.println("input=" + input);
		System.out.println("input2=" + input2);

	}
}
