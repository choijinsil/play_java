import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		System.out.println("2자리의 정수를 입력하세요 !");
		do {
			System.out.print("입력: ");
			input = scan.nextInt();

			// } while (!(input >= 10) && (input <= 99));
		} while ((input < 10) || (input > 99));	
		// (iput<10) || input(>99)
		System.out.println("변수 no의 값은 " + input + " 이 되었습니다.");
	}
}
