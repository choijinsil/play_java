package com.encore.j0424;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//BorderLayout: �߾��� �������� �������� ��ġ�� ����
public class BorderTest extends Frame {
	// Ŭ���� �ȿ��� ��������, ����������, �޼ҵ� ���� �������� ����.
	// �޼ҵ� ���� �ȿ� �������� ����, ��������, �ɹ����� �ʱ�ȭ, �޼ҵ� ȣ��, ���ǹ�, �ݺ���
	// �ʿ��� ��ü(Ŀ���Ʈ, �����̳�) ����
	// this�� Frame�̶� ��ü �������� �ʾƵ� �ȴ�.
	Button b1, b2, b3, b4, b5;
	// b1=new Button("1");
	Button b6 = new Button("6");

	public BorderTest(String title) {
		// ����Ŭ���� ������ ȣ��
		// ������ ���� ���� �ι�° ���ο� �� �� ���� ������ ù��°�� ��ġ�ؾ� �Ѵ�.

		// super(title);// 1��° ���
		setTitle("���ο�Ÿ��Ʋ"); // 2���� ��� <-- ��ġ�� ���ֹ��� �ʴ´�
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");

		// �Ӽ�����(�����ӿ� ���� ���̾ƿ�, ���̱�)
		setLayout(new BorderLayout());// Frame.setLayout�ε� Frame�� ��ӹ޾����� this�� ���

		// this.adD(b1);
		// BorderLayout�� ��� ������Ʈ�� ���� ��ġ�� �Բ� �����ؾ� �Ѵ�. ö�ڰ� Ʋ���� ����! ù���ڴ²� �빮��!
		add("North", b1);
		add("East", b2);
		add("South", b3);
		add("West", b4);
		add("Center", b5);

		// ������2�� (������ ������, �����Ӻ��̱�) <-- ������ = ������â
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderTest("Border �׽�Ʈ!");

	}

}
