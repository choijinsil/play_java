
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class JuminBunhoTest {

	public static void main(String[] args) throws Exception {
		// "920306-1012345"를 기준으로 나이를 구해보자
		// 080603-31012345
		// 2019 - (1900 + 92) + 1
		// ---> 전체문자열에서 "92"만 추출하기 : String
		// 자바 날짜 관련된 클래스: Date, Calendar

		Calendar cal = Calendar.getInstance(); // instance는 객체
		// cal이라는 참조변수 안에 현 시스템의 모든 날짜 관련 정보가 저장된다.
		// Date, Calendar는 java.util패키지 안에 존재한다.
		int year = cal.get(Calendar.YEAR);
		// System.out.println("year =" + year);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("주민번호를 정확히 입력하세요.('-')포함 ");
		String id = in.readLine(); //
		String birthYear = id.substring(0, 2);// "92"
		char ch = id.charAt(7); // ch <-- '1''2''3''4'

		int age;
		if (ch < '3') { // 아스키 코드 값으로 비교, 어차피 숫자는 순차적인 문자이니깐.
			age = year - (1900 + Integer.parseInt(birthYear)) + 1;
		} else {
			age = year - (2000 + Integer.parseInt(birthYear)) + 1;

		}
		System.out.println("당신의 나이는" + age);

	}

}
