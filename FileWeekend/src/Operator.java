
public class Operator {

	public static void main(String[] args) {
		int su;
		su = 40;

		System.out.println(1 + 2 + "안녕"); // 연산을 마치고 문자열을 더하는것

		System.out.println("안녕" + 1 + 2); // 문자열을 먼저 넣어서 뒤에 숫자들이 문자로 인식이됨

		// 증감연산자
		int su1 = 300;
		su1 = su1 + 1;

		int su3 = 50;
		System.out.println(su3);
		su3++;
		System.out.println(su3);
		++su3;
		System.out.println(su3);
		System.out.println("su3++(후위연산자)==>" + su3++);
		System.out.println("++su3(전위연산자)==>" + ++su3);

		// 연산 잘 알아두기
		// ++ su3 은 전위 연산자로 타 연산과 같이 사용할경우 계산 먼저하고 다른 연산 사용할게 라는말
		// su3++은 후위 연산자로 타 연산과 같이 사용할 경우 다른연산을 먼저 사용하고 계산을 진행함
		// 다른 연산자에는 System.out.println이 있음

		// int형 한번에 선언 가능함
		int a = 3, b = 4;

		int x = 10;
		int y = 20;
		int z = 30;

		int year = 2019;

		if (year % 4 == 0 || year % 100 == 0) {
			System.out.println("윤년입니다.");
		} else if (year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}

	}
}
