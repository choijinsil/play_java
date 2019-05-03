import java.util.Scanner;

public class ObjEx {

	public static void main(String[] args) {

		D d = new D();
		d.gildong();
		d.lime();

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String cola = d.jowon(input);
		System.out.println(cola);
	}

}

class D {
	int max = 100;
	int wallet = 10000;

	void gildong() {
		System.out.println("길동 시작이다!");
	}

	String lime() {
		System.out.println("라임 시작이다!");
		return "콜라 옜다!";
	}

	String jowon(int coin) {
		System.out.println("까칠한 주원이 나셨다!");
		wallet = wallet - coin;
		return coin + "짜리 톡 ~ 쏘는 콜라 \n" + "남은돈은" + wallet + "원";

	}
}