
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
			// 추후 경로 수정

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			br.readLine();
			String str2;
			while ((str2 = br.readLine()) != null) {// 읽을 라인이 있다면
				// txt 파일에 있는 tap, 공백 지우기
				str2 = str2.replaceAll("\t", "").replaceAll("  ", "");

				// 읽은 라인을 ','단위로 split 하기
				String[] str3 = str2.split(",");

				// Milk 빈즈에 데이터 저장하고, Vector<Milk>에 저장하기
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
	// 벡터에 저장
	public void saveData() {
		try {
			File f = new File("Data.txt");
			FileWriter fw = new FileWriter(f);

			// txt 파일에서 수정하기 편하게 하기 위하여 \t(tap) 삽입
			fw.write("번호,\t제품명,\t\t가격,\t재고,\t판매량\n");

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