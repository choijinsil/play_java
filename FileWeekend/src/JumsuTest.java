public class JumsuTest {

	public static void main(String[] args) {
		
		BB bb=new BB();
		bb.bb();

		int jumsu1 = 0;

		// ------> 출력값: B학점입니다!
		// - 비교연산자가 들어갈 수 없다.
		// - 비교연산의 결과값이 boolean형으로 나오는데 jumsu자료형과 같은 자료가 아니기에 컴파일 에러가 뜬다.

		switch (jumsu1 / 10) {	// 조건문
		case 10: // <--- 100점의 경우 10의 케이스가 나오고 패스하면 case 9로 가게 된다.
					// 200점 이상의 경우 default로 넘어가게 되는데 이건 case문으로 교정할 수 없다. if문으로 감싸야 한다.
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
			break;
			
		}
	}
}

class BB {
	void bb() {
		int jumsu2 = 76;	// 조건문
		if (100 >= jumsu2 && jumsu2>= 90) {
			System.out.println("A학점입니다.");
		} else if (jumsu2 >= 80) {
			System.out.println("B학점입니다.");
		} else if (jumsu2 >= 70) {
			System.out.println("C학점입니다.");
		} else if (jumsu2 >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
	}
}


