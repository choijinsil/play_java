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
		System.out.println("�浿 �����̴�!");
	}

	String lime() {
		System.out.println("���� �����̴�!");
		return "�ݶ� ����!";
	}

	String jowon(int coin) {
		System.out.println("��ĥ�� �ֿ��� ���̴�!");
		wallet = wallet - coin;
		return coin + "¥�� �� ~ ��� �ݶ� \n" + "��������" + wallet + "��";

	}
}