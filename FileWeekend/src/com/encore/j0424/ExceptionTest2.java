package com.encore.j0424;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// �Ѳ����� ����Ʈ ��Ʈ��+����Ʈ+o

		/*
		 * String[] args={"10","5"}; String[] args={"ab","cd"}; String[] args={"10"};
		 * String[] args={"10","0"};
		 * 
		 * su1 su2 ---------- 10 5 ab cd ==> NumberFormatException 10 X ==>
		 * ArrayIndexOutOfBoundsException 10 0 ==> ArithmeticException
		 */
		try {
			// ���ܹ߻��� ���ؼ� try~catch�� �Ǵ� throws�� ������� �ʰ� ó���ϴ� ���
			// RuntimeException�� �ڽ�Exception�� ��츸 �����ϴ�.
			// ab�� �޼ҵ尣�� ȣ�����

			System.out.println("�Ű������� ���� �ΰ��� ��!!");
			int su1 = Integer.parseInt(args[0]);// new Number~, Array
			int su2 = Integer.parseInt(args[1]);// Number, Array
			System.out.println("su1=" + su1 + ", su2=" + su2);
			System.out.println("su1�� su2�� ���� ��= " + (su1 / su2));// new Arithmetic
			System.out.println("�������� �� �����Ͽ����ϴ�~!!");
		} catch (NumberFormatException e) {
			// e: �����޽��� ��ü
//			e.printStackTrace();// ������ �߻��� �ڵ�� ������ �޼ҵ���� ȣ�� ���踦 ǥ��
//			System.out.println("=======================");
//			System.out.println(e.toString()); // ���� ������ ������ ���
//			System.out.println("======================");
//			System.out.println(e.getMessage());
			System.out.println("## ���ڸ��Է����ּ���.");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("## �ΰ��� ���ڸ� �ݵ�� �Է��Ͻÿ�");
		} catch (ArithmeticException e) {

			System.out.println("## 0���� ������ �����ϴ�.");

		} finally {
			System.out.println();
			System.out.println("���� �߻��ǵ� �ȵǾ ���� ���������~~~");
			// ���� FileSystem��ü �Ǵ� DataBase���õ� ��ü�� ���� ��ȯ
			// fr.close�� ���� ���δ�.
		}
		System.out.println("����������");
		// �� �������� ��Ʋ��Exception���� ó���� �� �ִ�
	}// main
}
