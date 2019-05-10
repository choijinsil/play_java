
package com.milk.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class DatabaseIO {
	public Vector<Milk> milkV;

	public DatabaseIO() {
		milkV = new Vector<Milk>();
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
	// ���Ϳ� ����
	public void saveData() {
		try {
			File f = new File("Data.txt");
			FileWriter fw = new FileWriter(f);

			// txt ���Ͽ��� �����ϱ� ���ϰ� �ϱ� ���Ͽ� \t(tap) ����
			fw.write("��ȣ,\t��ǰ��,\t\t����,\t���,\t�Ǹŷ�\n");

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

}