import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineInputText {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 클래스 생성
		// a(b(c())): 메소드 호출을 할 때 데이터자리에 메소드가 있다는 것은 호출을 해야 값을 받을수있다.
		// 엔터 전까지 읽어 들여 단어들을 하나의 문자열로 만들어서 전달한다.
	
		System.out.println("숫자를 입력하세요: ");
		String str = br.readLine(); // 문자열 입력, 입력 시점
		System.out.println("str= " + str + 500); // <-- 단순 출력

		// 문자열을 숫자로 변환하고 싶다.
		int ssu = Integer.parseInt(str);
		System.out.print("입력값에 500을 더하면? -->");
		System.out.print(ssu + 500); // <-- 숫자에 대한 사칙연산
		// Integer라는 클래스 안에 있는 parseInt로 분자를 변환해 준다.
	}
}
