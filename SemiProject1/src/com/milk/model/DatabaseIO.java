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
	public int balance;//사용자가 넣은 잔액
	public int sum,today;//총매출, 정산 전 매출
	public Vector<Milk> milkV;
	public Vector<Money> moneyV;

	public DatabaseIO() {
		milkV = new Vector<Milk>();
		moneyV = new Vector<Money>();
	}
	
	//프로그램 실행시 data읽어오기
	public void loadData() {
		try {
			File f = new File("Data.txt");

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine(); //첫 줄 목차 날리기
			
			String str2; //라인 받을 str2
			while ((str2 = br.readLine()) != null) {// 읽을 라인이 있다면
				
				// txt 파일에 있는 tap, 공백 지우기
				str2 = str2.replaceAll("\t", "").replaceAll("  ", "");
				
				// 읽은 라인을 ','단위로 split 하기 => str3배열에 저장하기
				String[] str3 = str2.split(",");
				
				// Milk 빈즈에 데이터 저장하고
				// 한 줄이 빈즈, 전체가 벡터
				Milk milk = new Milk();
				milk.setNo(Integer.parseInt(str3[0]));
				milk.setName(str3[1]);
				milk.setPrice(Integer.parseInt(str3[2]));
				milk.setStock(Integer.parseInt(str3[3]));
				milk.setSell(Integer.parseInt(str3[4]));
				
				//Vector<Milk>에 저장하기
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

	//프로그램 종료시 data저장하기
	public void saveData() {
		try {
			File f = new File("Data.txt");
			
			FileWriter fw = new FileWriter(f);
			
			// txt 파일에서 수정하기 편하게 하기 위하여 \t(tap) 삽입
			fw.write("번호,\t제품명,\t\t가격,\t\t재고,\t판매량\n");
			
			for (int i = 0; i < milkV.size(); i++) {
				String str = (milkV.get(i).getNo() + ",\t" + milkV.get(i).getName() + ",  \t" + milkV.get(i).getPrice()
						+ ",\t" + milkV.get(i).getStock() + ",\t" + milkV.get(i).getSell());
				fw.write(str); //한줄 저장
				if ((i + 1) != milkV.size()) { //마지막행이 아니면 엔터를 처주기
					fw.write("\n");
				}
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//총매줄 저장하기
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

	//총매출 저장하기
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
	
	//동전 불러오기
	public void loadMoney() {
		try {
			File f = new File("Money.txt");
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			br.readLine();//첫줄 날리기
			
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

	//동전 저장하기
	public void saveMoney() {
		try {
			File f = new File("Money.txt");
			
			FileWriter fw = new FileWriter(f);
			
			fw.write("500원,\t100원\n");
			
			String str = (moneyV.get(0).getMoney500() + ",\t" + moneyV.get(0).getMoney100());
			
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//장부기재 클릭시 판매기록 저장하기
	public void salesStament() {
		try {
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int date = cal.get(Calendar.DATE);
			
			String monthstr; //정렬위해서 한자리수 월일 경우에는 0붙이기
			if (month < 10) {
				monthstr = ("0" + month);
			} else {
				monthstr = (month + "");
			}
			
			File f = new File("sales/" + (year + "_" + monthstr + "_" + date + "판매기록.txt"));
			//파일이름 지정하기
			
			if (f.exists()) { //중복된 파일이 존재한다면
				int savenum = 1; //괄호에 들어갈 숫자
				while (f.exists()) {
					f = new File("sales/" + (year + "_" + monthstr + "_" + date + "판매기록(" + savenum + ").txt"));
					savenum++;
				}
			}
			
			FileWriter fw = new FileWriter(f); //파일 쓰기
			int today = 0;
				for (int i = 0; i < milkV.size(); i++) {
				today += milkV.get(i).getPrice() * milkV.get(i).getSell();
				}
			sum = sum + today; //sum(금일 이전까지의 총매출)
			fw.write("정산 매출 : " + today + "원\n");
			fw.write("총 매출 : " + sum + "원\n");

			// txt 파일에서 수정하기 편하게 하기 위하여 \t(tap) 삽입
			fw.write("번호,\t제품명,\t\t가격,\t\t재고,\t판매,\t수입\n"); //첫줄

			//내용입력
			for (int i = 0; i < milkV.size(); i++) {
				String str = (milkV.get(i).getNo() + ",\t" + milkV.get(i).getName() + ",  \t" + milkV.get(i).getPrice()
						+ ",\t" + milkV.get(i).getStock() + ",\t" + milkV.get(i).getSell() + ",\t"
						+ (milkV.get(i).getSell() * milkV.get(i).getPrice()));
				milkV.get(i).setSell(0);//금일 판매량 초기화
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
