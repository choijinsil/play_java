public class ForTest {
	public static void main(String[] args) {

		Z1 z1 = new Z1();
		z1.op();
		
	}
}

class Z1 {
	void op() {

		System.out.println("======1부터 5까지 출력======");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1); // <-- println은 line new(개행), 줄바꿈을 실행한다.
		}

		// 1 2 3 4 5
		System.out.println("======1 2 3 4 5 를 출력======");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + " "); // <--print는 데이터 출력만한다.
		}

		System.out.println();// 띄어쓰기

		System.out.println("======5 4 3 2 1 를 출력======");
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println(); // 띄어쓰기
		System.out.println("======3 6 9 12 를 출력======");
		System.out.print("[");
		for (int i = 3; i < 13; i += 3) {
			// i+=3;
			System.out.print(i); // 4회
			if (i < 12) {
				System.out.print(",  "); // 3회
			}
		}
		System.out.println("]");
		//
	}
}