package com.encore.j0424;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

// ������Ʈ ��ư ��ü ���� --> �����̳�(��ȭ��) ���̱�
public class FlowTest {
	// ������Ʈ ����, �����̳� ����
	Button bt1, bt2, bt3; // �⺻���� null <-- �ɹ������� ����Ǿ����ϱ�
	Frame f;

	public FlowTest() {
		Color c = new Color(242, 65, 215);
		// ������Ʈ, �����̳� ��ü ���� (����� �ɹ����� ����ŭ)
		// ���� �ʴ´ٸ� Null����Ʈ �ͼ��� ����
		bt1 = new Button("�ູ��ư");
		bt2 = new Button("���Ĺ�ư");
		bt3 = new Button("�׳ɹ�ư");

		f = new Frame("Flow �׽�Ʈ");
		
		// �Ӽ� ���� <-- ��ư�� ����, ������ ��, layout����, ������Ʈ ���̱�
		f.add(bt1); // �����ӿ� �ٿ��� ��ư��
		bt1.setBackground(c);
		f.add(bt2);
		f.add(bt3);
//		FlowLayout f1= new FlowLayout();
//		f.setLayout(f1);	// ��� ����
		f.setLayout(new FlowLayout()); // <--���� �� ���� ���ΰ�!

		// �������޼ҵ� ȣ��2: �����̳� ������(����, ���� ����)����, �����̳� ���̱� ����
		f.setSize(300, 300);
		f.setVisible(true);

	}

	public static void main(String[] args) { // �ִ��� ����ȭ
		// ������ �������� ��ü ���α׷��� ������ ��ġ�� �ʵ���
		// FlowTest ft = new FlowTest();
		new FlowTest();

	}

}
