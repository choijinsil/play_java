// 상속
// 가급적 클래스는 내용이 적더라도 따로 만들기
// 생략하는 것을 default라고 한다. 
// 컴파일러가 import java.lang.*;을 자동 추가해준다. 
class Parent { // 컴파일러가 extends Object를 자동으로 추가해준다.
	int i = 11;

	void hello() {
		System.out.println("안녕?");
	}

	void hello(String name) { // <--오버로딩: 위의 메소드와 같아도 인자값을 다르게 주는 것
								// 자료형이 달라야 한다!
		System.out.println("안녕," + name);
	}

	void hello(int age) { // <-- 오버로딩 메소드
		System.out.println("안녕," + age);
	}

	void print() {
		System.out.println("부모프린트 ~!");
	}
}

class Child extends Parent {
	// is a <-- 자식은 부모다!
	// 자식클래스는 부모클래스로 형변환이 가능하다.
	int j = 22;

	void goodBye() {
		System.out.println("안녕히가세요~!");
	}

	void print() { // <-- 오버라이딩: 무조건 상속개념이 들어간다. (재정의 메소드)! 자식쪽을 뜻함
		System.out.println("자식프린트 ~!!");
	}
}

public class InheritanceTest { // 주 클래스

	public static void main(String[] args) {

		Child c = new Child(); // <-- 메모리: Object, Parent, Child
		// 자식의 자원
		System.out.println("---자식의 자원---");
		System.out.println("J=" + c.j);
		c.goodBye();
		c.print();

		// 부모의 자원
		System.out.println("---부모의 자원---");
		c.hello();
		// c.abc(); <-- 존재하지 않아서 에러!
		c.toString();// <--컴파일이 잘되는 이유는? object(상위)클래스에 toString()메소드가 정의되어 있기 때문이다.

		System.out.println("=============");
		Parent p = new Parent(); // 메모리 할당: Object, Parent

		p.hello();
		p.print();

		/*
		 * 자식의 자원 기본: 부모참조변수(p)를 통해 자식 접근 불가능!
		 */
		System.out.println("=============");
		Parent p2 = new Child(); // 메모리 할당: O P C
		p2.hello();
		p2.print(); // <-- 기본원칙: 부모참조 통해 자식 호출 불가
					// ★ 예외: 오버라이딩 메소드는 호출 가능!
					// 정확히 오버라이딩 메소드가 존재한다면 부모의 메소드는 은폐되고 자식의 메소드로 대체가 된다.

		// cannot find symbol <-- 정의된 메소드가 없다.
		// Parent p2= new Child(); <-- 에러 incompatible type: 호환이 되지 않는 자료형을 가졌습니다.
		// Child를 Parent로 변환 할 수 없다.
		// Object p2=new Child(); //부, 모 <--가능

	}
}
