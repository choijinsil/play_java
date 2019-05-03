package com.encore.gui0430;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableTest extends JFrame {
	/*
	 * ����1)
	 * 
	 * JFrame 'Center'�� javax.swing.JTable�� add��Ű�ÿ�. �׸��� �Ʒ��� �����͸� JTable�� �Է�(ǥ��)�Ͻÿ�.
	 * (API���� ����)
	 * 
	 * <������> �̸� ���� ���� ------------------------ ȫ�浿 13 �л� ����� 15 �л� ���ֿ� 17 �л�
	 * 
	 * 
	 * JTable, JTextArea, JList ===> ����� ����� �����͸� ǥ���ϱ� ���� JScrollPane �Բ� ���.
	 */

	JTable table;
	JScrollPane scroll_table;

	public JTableTest() {
		setTitle("JTable�׽�Ʈ");

		// JTable(Object[][] rowData, Object[] columnNames)
		Object[][] rowData = {
				// 0�� 1�� 2��
				{ "ȫ�浿", 13, "�л�" }, // ù°�� 0��
				{ "�����", 15, "�л�" }, // ��°�� 1��
				{ "���ֿ�", 17, "�л�" } // ��°�� 2��
		};
		String[] columnTitle = { "�̸�", "����", "����" };

		// DefaultTableModel(Object[][] data, Object[] columnNames)
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnTitle);
		// DefaultTableModel Ŭ���� ��� ����?
		// ���α׷� ���� �� '�� ���� ������'�� �߰� �Ǵ� ���� �ϱ� ����

		// table = new JTable(rowData,columnTitle) {
		table = new JTable(dtm) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		scroll_table = new JScrollPane(table);

		add(scroll_table);// (table);

		setBounds(400, 300, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/*
		 * <������> �̸� ���� ���� ------------------------ 0�� ȫ�浿 13 �л� 1�� ����� 15 �л� 2�� ���ֿ� 17
		 * �л�
		 * 
		 * 0�� 1�� 2��
		 * 
		 */
		// ����2) JTable���� '�����'�� �� (�ܼ�)ȭ�鿡 ����Ͻÿ�.
		// table.get�޼ҵ�() ã�� : ��Ʈ ===> �࿭ �ε����� ���!!
		Object nameValue = table.getValueAt(1, 0);
		System.out.println("nameValue=" + nameValue);

		// ����3) JTable���� '�����' ---> '������'���� ����
		// table.set�޼ҵ�() ã�� : ��Ʈ ===> �࿭ �ε����� ���!!
		// table.setValueAt(Object aValue, int row, int column);//aValue: ������ ������
		table.setValueAt("������", 1, 0);

		// ����4) JTable���� ��� ����� �̸��� (�ܼ�)ȭ�鿡 ����Ͻÿ�.
		// ��Ʈ: �̸� ---> 0��
		System.out.println(table.getValueAt(0, 0));
		System.out.println(table.getValueAt(1, 0));
		System.out.println(table.getValueAt(2, 0));
		// System.out.println(table.getValueAt(3, 0)); //IndexOutOfBounds���� �߻�
		System.out.println("======================");
		for (int i = 0; i < table.getRowCount(); i++) {// ���ε��� ǥ��
			System.out.println(table.getValueAt(i, 0));
		}

		// ����5) �� �߰�!! ---> ["������",13,"ȭ��"]
		// table.setValueAt("������", 3, 0); (X):���� ==> �������� �ʴ� ���ε����� ����

		Object[] newRow = { "������", 13, "ȭ��" };
		dtm.addRow(newRow);

		Vector<Object> v = new Vector<>();
		v.add("������");
		v.add(28);
		v.add("�屺");
		dtm.addRow(v);

		// ����6) ���ֿ� ���� ���� (��Ʈ: ����°�� ---> 2�ε�����)
		dtm.removeRow(2);

	}// ������

	public static void main(String[] args) {
		new JTableTest(); // JFrame��ü ����!!
	}

}
