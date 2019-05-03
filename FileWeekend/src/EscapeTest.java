
public class EscapeTest {

	public static void main(String[] args) {
		System.out.println("Hello \nWor\tld!");
		System.out.println("Hello \"World!\"");

	}

	class Parent extends Object {
		// extends Object생략되어있음
	}

	class child extends Parent {
		// 기존 + 확장
	}

}
