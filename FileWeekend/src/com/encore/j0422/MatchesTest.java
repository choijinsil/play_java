package com.encore.j0422;

public class MatchesTest {

	// StringŬ���� --> boolean str.matches(String regex);
	// regex ----> regular expression (���� ǥ����, ���Խ�)
	// regex�� ���� ���޵Ǵ� ���Ͽ� str�� ����(match)�ȴٸ� true�� ����.
	// ����(�߻�)Ƚ���� ���õ� ��ȣ: ?(0,1) , *(0~ ���Ѵ�), +(1~���Ѵ�)
	// ��ȣ���� <-- 1�� ����
	public static void main(String[] args) {
		String str = "";
		str = "a";
		str = "aaaa";
		str = "aaaaaaaaaaa";

		// matches(���Ϲ��ڿ�)
		System.out.println("��ȣ����: " + str.matches("[a]")); // a����: �ѹ�
		System.out.println("?��ȣ: " + str.matches("[a]?")); // a����: 0,1 <-- ������ true�� ��
		System.out.println("*��ȣ : " + str.matches("[a]*")); // a����: 0 ~ ���Ѵ�
		System.out.println("+��ȣ : " + str.matches("[a]+"));// a����: 1~���Ѵ�
		System.out.println("======================");
		System.out.println(str.matches("[abc]")); // a�Ǵ� b�Ǵ� c������ 1�� �⿬�Ѵٸ� true
		System.out.println(str.matches("[abc+]")); // a,b,c���ڰ� ���յǾ� ������ �߻�

		String name = "gildongOO";
		// name������ ���� ������ üũ!
		System.out.println("name������ �̸�üũ(������)üũ: " + name.matches("[a-zA-z]+"));
		System.out.println("name������ �̸�üũ(������)üũ: " + name.matches("[A-z]+"));

		// �� ������ ���� ���� üũ
		String su = "34567";
		System.out.println("su������ ����üũ: " + su.matches("[0-9]+"));

		String hangul = "����";
		// �ѱ� ������ ���� �ѱ� üũ!
		System.out.println("�ѱ�üũ: " + hangul.matches("[��-�R]+"));

		String id = "jinsil1106";
		// ���̵�� 8~12�ڸ� �Դϴ�. �����ڿ� ���� �����Դϴ�.
		String idPattern = "[A-z0-9]{8,12}"; // ���ڿ� ���̰� �ּ� 8~12
		// {8,12} 8�̻� 12 ����{8, }: �ּ� 8�̻� {8} : 8��
		System.out.println("���̵�üũ: " + id.matches(idPattern));

		String juminBunho = "960309-3012345";
		String juminPattern =  "[\\d]{6}-[\\d]{7}"; // <-- \���� \\�� ���ָ� �������÷� ���ش�. �ƴ϶�� ���ڿ��� ��
		System.out.println("�ֹι�ȣ üũ: " + juminBunho.matches(juminPattern));

		
	}
}
