
public class WhileTest {

	public static void main(String[] args) {

		// while���� ����ؼ� 1~10���� ���� ���� ȭ�鿡 ����ϼ���.
		int sum = 0; // ������ ����
		int su = 0; // 1������
		boolean flag = true; // ����

		while (flag) { // flag�� ������ true�� ��쿡�� ��������. false�� break
			sum = sum + su; // sum=0+1, sum=1+2, sum=3+4...

			su++; // 1�� �����ϱ� ������ su�� ���������ش�.
			// System.out.println(su); // su�� ����� �����ϴ��� ����

			if (su > 10) // ���� ���� 10�̻��̶�� flag�� false�� �ٲ۴�. �׷��ٸ� while�� ������ ���߰���?
				flag = false;

			// �̰��� System.out.println(sum)�� �ϸ� ���� �� 10�� ��������?

		} // while�� ������.

		System.out.println("sum��--->" + sum); // while���� ��ġ�� sum�� �������� ����Ѵ�.

	}
}
