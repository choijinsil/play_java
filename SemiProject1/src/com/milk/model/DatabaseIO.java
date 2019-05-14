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

	public void saveData() {
		try {
			File f = new File("Data.txt");
			FileWriter fw = new FileWriter(f);

			// txt 파일에서 수정하기 편하게 하기 위하여 \t(tap) 삽입
			fw.write("번호,\t제품명,\t\t가격,\t\t재고,\t판매량\n");

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
			// 추후 경로 수정

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
	
	public void salesStament() {//장부기재 클릭시 매출 저장
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
		   File f = new File("sales/"+(year+"_"+monthstr+"_"+date+"판매기록.txt"));
		   FileWriter fw = new FileWriter(f);
		   int today=0;
		   for (int i = 0; i < milkV.size(); i++) {
		    today += milkV.get(i).getPrice() * milkV.get(i).getSell();
		   }
		   sum = sum + today;
		   fw.write("금일 매출 합계 : " + today+ "원\n");
		   fw.write("총매출 : "+sum+"원\n");
		   
		   //txt 파일에서 수정하기 편하게 하기 위하여 \t(tap) 삽입
		   fw.write("번호,\t제품명,\t\t가격,\t\t재고,\t판매,\t수입\n");
		   
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
		   
		//   fw.write("동전 보유량");
		//   fw.write("100원 : "++"개");
		   
		   fw.close();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	}
	
	
}