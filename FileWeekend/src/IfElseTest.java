
public class IfElseTest {
	public static void main(String[] args) {
		// compile을 통해서 .class --> .java로 변환
		int gender;
		gender = 2;
		if (gender % 2 != 0) {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}
	}
}
