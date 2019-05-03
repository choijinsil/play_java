
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class JuminBunhoTest {

	public static void main(String[] args) throws Exception {
		// "920306-1012345"�� �������� ���̸� ���غ���
		// 080603-31012345
		// 2019 - (1900 + 92) + 1
		// ---> ��ü���ڿ����� "92"�� �����ϱ� : String
		// �ڹ� ��¥ ���õ� Ŭ����: Date, Calendar

		Calendar cal = Calendar.getInstance(); // instance�� ��ü
		// cal�̶�� �������� �ȿ� �� �ý����� ��� ��¥ ���� ������ ����ȴ�.
		// Date, Calendar�� java.util��Ű�� �ȿ� �����Ѵ�.
		int year = cal.get(Calendar.YEAR);
		// System.out.println("year =" + year);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�ֹι�ȣ�� ��Ȯ�� �Է��ϼ���.('-')���� ");
		String id = in.readLine(); //
		String birthYear = id.substring(0, 2);// "92"
		char ch = id.charAt(7); // ch <-- '1''2''3''4'

		int age;
		if (ch < '3') { // �ƽ�Ű �ڵ� ������ ��, ������ ���ڴ� �������� �����̴ϱ�.
			age = year - (1900 + Integer.parseInt(birthYear)) + 1;
		} else {
			age = year - (2000 + Integer.parseInt(birthYear)) + 1;

		}
		System.out.println("����� ���̴�" + age);

	}

}
