import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineInputText {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Ŭ���� ����
		// a(b(c())): �޼ҵ� ȣ���� �� �� �������ڸ��� �޼ҵ尡 �ִٴ� ���� ȣ���� �ؾ� ���� �������ִ�.
		// ���� ������ �о� �鿩 �ܾ���� �ϳ��� ���ڿ��� ���� �����Ѵ�.
	
		System.out.println("���ڸ� �Է��ϼ���: ");
		String str = br.readLine(); // ���ڿ� �Է�, �Է� ����
		System.out.println("str= " + str + 500); // <-- �ܼ� ���

		// ���ڿ��� ���ڷ� ��ȯ�ϰ� �ʹ�.
		int ssu = Integer.parseInt(str);
		System.out.print("�Է°��� 500�� ���ϸ�? -->");
		System.out.print(ssu + 500); // <-- ���ڿ� ���� ��Ģ����
		// Integer��� Ŭ���� �ȿ� �ִ� parseInt�� ���ڸ� ��ȯ�� �ش�.
	}
}
