import java.io.BufferedReader;
// ����Ʈ: ���� Ŭ�������� ����ϰ��� �ϴ� Ŭ������ ��ġ(Ŭ������ �� ��Ű��)�� ǥ��
// � ��Ű���� ���� � Ŭ������ ����ϰڴ�.
// ����) import ��Ű����.Ŭ������;

import java.io.IOException;
import java.io.InputStreamReader;

/*
 do ~while
 �̼�) �Ʒ��� ���� ������ �� �� �ְ� ���α׷��� �ۼ��Ͻÿ�.
     (do~while�� ���)

[������]
===========================
<<�޴�>>
1.�˻� 2.���� 3.���� 4.����
��ȣ==> 1
#�˻����: 0

<<�޴�>>
1.�˻� 2.���� 3.���� 4.����
��ȣ==> 2
#1�����Ͽ����ϴ�.

<<�޴�>>
1.�˻� 2.���� 3.���� 4.����
��ȣ==> 1
#�˻����: 3

<<�޴�>>
1.�˻� 2.���� 3.���� 4.����
��ȣ==> 3
#1�����Ͽ����ϴ�.

<<�޴�>>
1.�˻� 2.���� 3.���� 4.����
��ȣ==> 1
#�˻����: 2

<<�޴�>>
1.�˻� 2.���� 3.���� 4.����
��ȣ==> 4

-- END --
 */

public class Homework_01 {

	// IoException�� Exception�� ����?
	// Exception�� ���� Ŭ�����̱� �빮�� ��� ����ص� �����ϴ�.
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int sum = 0;
		boolean isBreak = false;

		do {
			System.out.println();
			System.out.println("<<�޴�>>");
			System.out.println("1.�˻� 2.���� 3.���� 4.����");
			System.out.print("��ȣ");
			input = in.readLine();

			if ("1".equals(input)) {
				System.out.println("# �˻����:" + sum);
			} else if ("2".equals(input)) {
				++sum;
				System.out.println("# 1 �����Ͽ����ϴ�.");

			} else if ("3".equals(input)) {
				// 0-1 =-1
				if (sum > 0) {
					sum--;
					System.out.println("# 1 �����Ͽ����ϴ�.");
				} else {
					System.out.println("�� �� Ʋ�Ƚ��ϴ�. ��");
					continue;
				}
			} else if ("4".equals(input)) {
				System.out.println("����Ǿ����ϴ�.");
				isBreak = true;
			} else {
				System.out.println("���ڸ� �߸� �Է��߾��. �ٽ� �Է����ּ���.");
				
				continue;
			}
		} while (!isBreak);
	}
}
