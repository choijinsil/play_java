
public class InputTest {

	public static void main(String[] args) throws Exception { // �ᱹ�� ����ó���� ���� �ʰڴٴ� ���̴�.

		System.out.print("���ڸ� ���� �Է�==>");
		int input = System.in.read() - 48;// <-- �Է¹޴� ����, �����, ���ѷ���
											// <--3�Է¹ޱ� ���ؼ� Ŀ��� â�� ������� �Ѵ�.
		
		// ���� <-- 13, 10�� ó���Ѵ�. 
		System.in.read(); // 13ó��(�Ʒ���)
		System.in.read(); // 10ó��(��������)

		System.out.print("������ ���� �ٽ� �Է�: ");
		int input2 = System.in.read(); // <-- ���� read�� 13�̴�. �׷��� ��°��� �ȳ��´�.
		
		System.out.println("input=" + input);
		System.out.println("input2=" + input2);

	}
}
