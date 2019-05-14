package com.milk.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Vector;

public class DatabaseIO {
	public int balance;

	public Vector<Milk> milkV;
	public Vector<Money> moneyV;
	public int sum;

	public DatabaseIO() {
		milkV = new Vector<Milk>();
		moneyV = new Vector<Money>();
	}

	public void loadData() {
		try {
			File f = new File("Data.txt");
			// ���� ��� ����

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			String str2;
			while ((str2 = br.readLine()) != null) {// ���� ������ �ִٸ�
				// txt ���Ͽ� �ִ� tap, ���� �����
				str2 = str2.replaceAll("\t", "").replaceAll("  ", "");

				// ���� ������ ','������ split �ϱ�
				String[] str3 = str2.split(",");

				// Milk ��� ������ �����ϰ�, Vector<Milk>�� �����ϱ�
				Milk milk = new Milk();
				milk.setNo(Integer.parseInt(str3[0]));
				milk.setName(str3[1]);
				milk.setPrice(Integer.parseInt(str3[2]));
				milk.setStock(Integer.parseInt(str3[3]));
				milk.setSell(Integer.parseInt(str3[4]));
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

	public void saveData() {
		try {
			File f = new File("Data.txt");
			FileWriter fw = new FileWriter(f);

			// txt ���Ͽ��� �����ϱ� ���ϰ� �ϱ� ���Ͽ� \t(tap) ����
			fw.write("��ȣ,\t��ǰ��,\t\t����,\t\t���,\t�Ǹŷ�\n");

			for (int i = 0; i < milkV.size(); i++) {
				String str = (milkV.get(i).getNo() + ",\t" + milkV.get(i).getName() + ",  \t" + milkV.get(i).getPrice()
						+ ",\t" + milkV.get(i).getStock() + ",\t" + milkV.get(i).getSell());
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

	public void loadSum() {
		try {
			File f = new File("Sum.txt");
			// ���� ��� ����

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			sum = Integer.parseInt(str);
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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

	public void loadMoney() {
		try {
			File f = new File("Money.txt");

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
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

	public void saveMoney() {
		try {
			File f = new File("Money.txt");
			FileWriter fw = new FileWriter(f);

			String str = (moneyV.get(0).getMoney500() + ",\t"
					+ moneyV.get(0).getMoney100());
			fw.write(str);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void salesStament() {//��α��� Ŭ���� ���� ����
		  try {
		   Calendar cal = Calendar.getInstance();
		   int year = cal.get(Calendar.YEAR);
		   int month = cal.get(Calendar.MONTH)+1;
		   String monthstr;
		   if(month<10) {
		    monthstr = ("0"+month);
		   }else{monthstr = (month+"");}
		   int date = cal.get(Calendar.DATE);
		   System.out.println(month);
		   File f = new File("sales/"+(year+"_"+monthstr+"_"+date+"�Ǹű��.txt"));
		   FileWriter fw = new FileWriter(f);
		   int today=0;
		   for (int i = 0; i < milkV.size(); i++) {
		    today += milkV.get(i).getPrice() * milkV.get(i).getSell();
		   }
		   sum = sum + today;
		   fw.write("���� ���� �հ� : " + today+ "��\n");
		   fw.write("�Ѹ��� : "+sum+"��\n");
		   
		   //txt ���Ͽ��� �����ϱ� ���ϰ� �ϱ� ���Ͽ� \t(tap) ����
		   fw.write("��ȣ,\t��ǰ��,\t\t����,\t\t���,\t�Ǹ�,\t����\n");
		   
		   for (int i = 0; i < milkV.size(); i++) {
		    String str = (milkV.get(i).getNo()+",\t"+
		      milkV.get(i).getName()+",  \t"+
		      milkV.get(i).getPrice()+",\t"+
		      milkV.get(i).getStock()+",\t"+
		      milkV.get(i).getSell()+",\t"+
		      (milkV.get(i).getSell()*milkV.get(i).getPrice()));
		    milkV.get(i).setSell(0);
		    fw.write(str);
		    if((i+1)!=milkV.size()) {
		     fw.write("\n");
		    }
		    
		   }
		   
		//   fw.write("���� ������");
		//   fw.write("100�� : "++"��");
		   
		   fw.close();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	}
	
	
}