package com.milk.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;

public class DatabaseIO {
	public int balance;//����ڰ� ���� �ܾ�
	public int sum,today;//�Ѹ���, ���� �� ����
	public Vector<Milk> milkV;
	public Vector<Money> moneyV;

	public DatabaseIO() {
		milkV = new Vector<Milk>();
		moneyV = new Vector<Money>();
	}
	
	//���α׷� ����� data�о����
	public void loadData() {
		try {
			File f = new File("Data.txt");

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine(); //ù �� ���� ������
			
			String str2; //���� ���� str2
			while ((str2 = br.readLine()) != null) {// ���� ������ �ִٸ�
				
				// txt ���Ͽ� �ִ� tap, ���� �����
				str2 = str2.replaceAll("\t", "").replaceAll("  ", "");
				
				// ���� ������ ','������ split �ϱ� => str3�迭�� �����ϱ�
				String[] str3 = str2.split(",");
				
				// Milk ��� ������ �����ϰ�
				// �� ���� ����, ��ü�� ����
				Milk milk = new Milk();
				milk.setNo(Integer.parseInt(str3[0]));
				milk.setName(str3[1]);
				milk.setPrice(Integer.parseInt(str3[2]));
				milk.setStock(Integer.parseInt(str3[3]));
				milk.setSell(Integer.parseInt(str3[4]));
				
				//Vector<Milk>�� �����ϱ�
				milkV.add(milk);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//���α׷� ����� data�����ϱ�
	public void saveData() {
		try {
			File f = new File("Data.txt");
			
			FileWriter fw = new FileWriter(f);
			
			// txt ���Ͽ��� �����ϱ� ���ϰ� �ϱ� ���Ͽ� \t(tap) ����
			fw.write("��ȣ,\t��ǰ��,\t\t����,\t\t���,\t�Ǹŷ�\n");
			
			for (int i = 0; i < milkV.size(); i++) {
				String str = (milkV.get(i).getNo() + ",\t" + milkV.get(i).getName() + ",  \t" + milkV.get(i).getPrice()
						+ ",\t" + milkV.get(i).getStock() + ",\t" + milkV.get(i).getSell());
				fw.write(str); //���� ����
				if ((i + 1) != milkV.size()) { //���������� �ƴϸ� ���͸� ó�ֱ�
					fw.write("\n");
				}
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//�Ѹ��� �����ϱ�
	public void loadSum() {
		try {
			File f = new File("Sum.txt");

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			sum = Integer.parseInt(br.readLine());
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//�Ѹ��� �����ϱ�
	public void saveSum() {
		try {
			File f = new File("Sum.txt");
			
			FileWriter fw = new FileWriter(f);
			
			fw.write(sum + "");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//���� �ҷ�����
	public void loadMoney() {
		try {
			File f = new File("Money.txt");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine();//ù�� ������
			
			String str = br.readLine();
			str = str.replaceAll("\t", "").replaceAll("  ", "");
			
			String[] str2 = str.split(",");
			
			Money money = new Money();
			money.setMoney500(Integer.parseInt(str2[0]));
			money.setMoney100(Integer.parseInt(str2[1]));
			
			moneyV.add(money);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//���� �����ϱ�
	public void saveMoney() {
		try {
			File f = new File("Money.txt");
			
			FileWriter fw = new FileWriter(f);
			
			fw.write("500��,\t100��\n");
			
			String str = (moneyV.get(0).getMoney500() + ",\t" + moneyV.get(0).getMoney100());
			
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//��α��� Ŭ���� �Ǹű�� �����ϱ�
	public void salesStament() {
		try {
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int date = cal.get(Calendar.DATE);
			
			String monthstr; //�������ؼ� ���ڸ��� ���� ��쿡�� 0���̱�
			if (month < 10) {
				monthstr = ("0" + month);
			} else {
				monthstr = (month + "");
			}
			
			File f = new File("sales/" + (year + "_" + monthstr + "_" + date + "�Ǹű��.txt"));
			//�����̸� �����ϱ�
			
			if (f.exists()) { //�ߺ��� ������ �����Ѵٸ�
				int savenum = 1; //��ȣ�� �� ����
				while (f.exists()) {
					f = new File("sales/" + (year + "_" + monthstr + "_" + date + "�Ǹű��(" + savenum + ").txt"));
					savenum++;
				}
			}
			
			FileWriter fw = new FileWriter(f); //���� ����
			int today = 0;
				for (int i = 0; i < milkV.size(); i++) {
				today += milkV.get(i).getPrice() * milkV.get(i).getSell();
				}
			sum = sum + today; //sum(���� ���������� �Ѹ���)
			fw.write("���� ���� : " + today + "��\n");
			fw.write("�� ���� : " + sum + "��\n");

			// txt ���Ͽ��� �����ϱ� ���ϰ� �ϱ� ���Ͽ� \t(tap) ����
			fw.write("��ȣ,\t��ǰ��,\t\t����,\t\t���,\t�Ǹ�,\t����\n"); //ù��

			//�����Է�
			for (int i = 0; i < milkV.size(); i++) {
				String str = (milkV.get(i).getNo() + ",\t" + milkV.get(i).getName() + ",  \t" + milkV.get(i).getPrice()
						+ ",\t" + milkV.get(i).getStock() + ",\t" + milkV.get(i).getSell() + ",\t"
						+ (milkV.get(i).getSell() * milkV.get(i).getPrice()));
				milkV.get(i).setSell(0);//���� �Ǹŷ� �ʱ�ȭ
				fw.write(str);
				if ((i + 1) != milkV.size()) {
					fw.write("\n");
				}

			}

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
