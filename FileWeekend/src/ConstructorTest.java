class Abc
{

	int su; // 맴버변수(필드) - 여러 메소드가 공유할 데이터를 표현, 기본값이 존재o
				// 기본값 == 정수: 0 실수"0:0 논리: false 클래스: null

	Abc(){
		System.out.println("Abc기본생성자");
	}

	Abc(String name) {
		System.out.println("Abc오버로딩생성자");
	}

	void hello() {
		int min08; // 지역 변수 - 현재 메소드에서만 사용할 데이터를 표현, 기본값이 존재x
		// min=0; 변수는 반드시 초기화 해서 사용
		System.out.println("초콜릿 안녕?" + su);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Abc a = new Abc();
		Abc a2 = new Abc("siri");
		// 1, 메모리 할당 2, 생성자호출
		a.hello();
	}

}

