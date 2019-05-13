
package com.milk.control;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.milk.model.DatabaseIO;
import com.milk.model.Milk;
import com.milk.model.MilkModel;
import com.milk.model.MoneyModel;
import com.milk.view.MAdmin;
import com.milk.view.MMainView;
import com.milk.view.WalletView;

public class Controller implements ActionListener {

	MMainView mainview;
	MAdmin admin;
	WalletView wallet;
	MoneyModel moneyModel;
	MilkModel milkModel;
	DatabaseIO db;

	Milk sellM;

	// 토탈잔액표시
	public Controller() {
		mainview = new MMainView();
		admin = new MAdmin();
		wallet = new WalletView();

		db = new DatabaseIO();

		db.loadData();
//		db.loadSum();
		updateMainView();
		updateView();

		action();

		moneyModel = new MoneyModel(db);
		milkModel = new MilkModel(db);

		salseByMilk();// 상품별 판매량
		moneyModel.sumSales();
		admin.tSaleDisplayArea.setText(moneyModel.sum + "");
	}

	public void action() {
		admin.changeSave.addActionListener(this);
		wallet.input100Btn.addActionListener(this);
		wallet.input500Btn.addActionListener(this);
		wallet.input1000Btn.addActionListener(this);
		mainview.keypadBtn_1.addActionListener(this);
		mainview.keypadBtn_2.addActionListener(this);
		mainview.keypadBtn_3.addActionListener(this);
		mainview.keypadBtn_4.addActionListener(this);
		mainview.keypadBtn_5.addActionListener(this);
		mainview.keypadBtn_6.addActionListener(this);
		mainview.keypadBtn_7.addActionListener(this);
		mainview.keypadBtn_8.addActionListener(this);
		mainview.keypadBtn_9.addActionListener(this);
		mainview.keypadBtn_Cancel.addActionListener(this);
		mainview.returnBtn.addActionListener(this);
		mainview.productOutBtn.addActionListener(this);
		mainview.keypadBtn_OK.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int cnt100 = 0;
		int cnt500 = 0;
		int cnt1000 = 0;
		Object ob = e.getSource();

		if (ob == wallet.input100Btn) {
			cnt100++;
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + "");
			mainview.keyDisplayArea.setText("제품을 선택해주세요");

			PossibleMilk();

		} else if (ob == wallet.input500Btn) {
			cnt500++;
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + "");
			mainview.keyDisplayArea.setText("제품을 선택해주세요");
			PossibleMilk();

		} else if (ob == wallet.input1000Btn) {
			cnt1000++;
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + "");
			mainview.keyDisplayArea.setText("제품을 선택해주세요");

			PossibleMilk();
		} else if (ob == mainview.keypadBtn_1) {
			mainview.keyDisplayArea.setText("1");
			// mainview.keyDisplayArea.setText(mainview.keypadBtn_1.getText());
		} else if (ob == mainview.keypadBtn_2) {
			mainview.keyDisplayArea.setText(mainview.keypadBtn_2.getText());
		} else if (ob == mainview.keypadBtn_3) {
			mainview.keyDisplayArea.setText(mainview.keypadBtn_3.getText());
		} else if (ob == mainview.keypadBtn_4) {
			mainview.keyDisplayArea.setText(mainview.keypadBtn_4.getText());
		} else if (ob == mainview.keypadBtn_5) {
			mainview.keyDisplayArea.setText(mainview.keypadBtn_5.getText());
		} else if (ob == mainview.keypadBtn_6) {
			mainview.keyDisplayArea.setText(mainview.keypadBtn_6.getText());
		} else if (ob == mainview.keypadBtn_7) {
			mainview.keyDisplayArea.setText(mainview.keypadBtn_7.getText());
		} else if (ob == mainview.keypadBtn_8) {
			mainview.keyDisplayArea.setText(mainview.keypadBtn_8.getText());
		} else if (ob == mainview.keypadBtn_9) {
			mainview.keyDisplayArea.setText(mainview.keypadBtn_9.getText());
		} else if (ob == mainview.keypadBtn_Cancel) {
			mainview.keyDisplayArea.setText("제품을 선택해주세요");
		} else if (ob == mainview.keypadBtn_OK) {

			sellM = milkModel.selectStock(Integer.parseInt(mainview.keyDisplayArea.getText()));
			if (milkModel.checkStock(sellM)) {
				if (moneyModel.comparePrice(sellM)) {
					milkModel.sellMilk(sellM);
					moneyModel.minusBalance(sellM);

					mainview.moneyDisplayArea.setText(db.balance + "");
					mainview.keyDisplayArea.setText("");

					PossibleMilk();

					updateView();
					System.out.println("ㅇㅋ"); // 제품 나올 때 제품반환버튼 활성화
				} else
					System.out.println("너돈ㄴㄴ");
			} else
				System.out.println("재고ㄴㄴ");

		} else if (ob == mainview.returnBtn) {
			mainview.moneyDisplayArea.setText("");
			JOptionPane.showMessageDialog(mainview, "잔돈은" + db.balance);
			db.balance = 0;
		} else if (ob == mainview.productOutBtn) {
			System.out.println(sellM.getName());
			// 뷰를 하나 더 만들어서 이미지 툭툭툭툭 쌓여가고, 출구버튼 누르면 보이게
		} else if (ob == admin.changeSave) {
			updateP();
			updateMainView();
		}
	}

	public void PossibleMilk() {

		moneyModel.compareAll(Integer.parseInt(mainview.moneyDisplayArea.getText()));

		for (int i = 0; i < db.milkV.size(); i++) {

			// 내가 가진 돈으로 살수있는 제품들 true
			if (db.milkV.get(i).isOnSale()) {

				// mainview.pPriceField_+String.valueof(i).setBackground(Color.RED);

				if (db.milkV.get(i).getNo() - 1 == 0) {
					mainview.pPriceField_1.setBackground(Color.RED);
				} else if (db.milkV.get(i).getNo() - 1 == 1) {
					mainview.pPriceField_2.setBackground(Color.RED);
				} else if (db.milkV.get(i).getNo() - 1 == 2) {
					mainview.pPriceField_3.setBackground(Color.RED);
				} else if (db.milkV.get(i).getNo() - 1 == 3) {
					mainview.pPriceField_4.setBackground(Color.RED);
				} else if (db.milkV.get(i).getNo() - 1 == 4) {
					mainview.pPriceField_5.setBackground(Color.RED);
				} else if (db.milkV.get(i).getNo() - 1 == 5) {
					mainview.pPriceField_6.setBackground(Color.RED);
				} else if (db.milkV.get(i).getNo() - 1 == 6) {
					mainview.pPriceField_7.setBackground(Color.RED);
				} else if (db.milkV.get(i).getNo() - 1 == 7) {
					mainview.pPriceField_8.setBackground(Color.RED);
				} else if (db.milkV.get(i).getNo() - 1 == 8) {
					mainview.pPriceField_9.setBackground(Color.RED);
				}

			} else { // false면

				if (db.milkV.get(i).getNo() - 1 == 0) {
					mainview.pPriceField_1.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() - 1 == 1) {
					mainview.pPriceField_2.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() - 1 == 2) {
					mainview.pPriceField_3.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() - 1 == 3) {
					mainview.pPriceField_4.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() - 1 == 4) {
					mainview.pPriceField_5.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() - 1 == 5) {
					mainview.pPriceField_6.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() - 1 == 6) {
					mainview.pPriceField_7.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() - 1 == 7) {
					mainview.pPriceField_8.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() - 1 == 8) {
					mainview.pPriceField_9.setBackground(Color.WHITE);
				}
			}
		}
	}

	public void updateView() {
		admin.pPriceField_1.setText(db.milkV.get(0).getPrice() + "");
		admin.pPriceField_2.setText(db.milkV.get(1).getPrice() + "");
		admin.pPriceField_3.setText(db.milkV.get(2).getPrice() + "");
		admin.pPriceField_4.setText(db.milkV.get(3).getPrice() + "");
		admin.pPriceField_5.setText(db.milkV.get(4).getPrice() + "");
		admin.pPriceField_6.setText(db.milkV.get(5).getPrice() + "");
		admin.pPriceField_7.setText(db.milkV.get(6).getPrice() + "");
		admin.pPriceField_8.setText(db.milkV.get(7).getPrice() + "");
		admin.pPriceField_9.setText(db.milkV.get(8).getPrice() + "");

		admin.pStockField_1.setText(db.milkV.get(0).getStock() + "");
		admin.pStockField_2.setText(db.milkV.get(1).getStock() + "");
		admin.pStockField_3.setText(db.milkV.get(2).getStock() + "");
		admin.pStockField_4.setText(db.milkV.get(3).getStock() + "");
		admin.pStockField_5.setText(db.milkV.get(4).getStock() + "");
		admin.pStockField_6.setText(db.milkV.get(5).getStock() + "");
		admin.pStockField_7.setText(db.milkV.get(6).getStock() + "");
		admin.pStockField_8.setText(db.milkV.get(7).getStock() + "");
		admin.pStockField_9.setText(db.milkV.get(8).getStock() + "");
	}

	public void updateMainView() {
		mainview.pPriceField_1.setText(db.milkV.get(0).getPrice() + "");
		mainview.pPriceField_2.setText(db.milkV.get(1).getPrice() + "");
		mainview.pPriceField_3.setText(db.milkV.get(2).getPrice() + "");
		mainview.pPriceField_4.setText(db.milkV.get(3).getPrice() + "");
		mainview.pPriceField_5.setText(db.milkV.get(4).getPrice() + "");
		mainview.pPriceField_6.setText(db.milkV.get(5).getPrice() + "");
		mainview.pPriceField_7.setText(db.milkV.get(6).getPrice() + "");
		mainview.pPriceField_8.setText(db.milkV.get(7).getPrice() + "");
		mainview.pPriceField_9.setText(db.milkV.get(8).getPrice() + "");
	}

	public void updateP() {
		db.milkV.get(0).setPrice(Integer.parseInt(admin.pPriceField_1.getText()));
		db.milkV.get(1).setPrice(Integer.parseInt(admin.pPriceField_2.getText()));
		db.milkV.get(2).setPrice(Integer.parseInt(admin.pPriceField_3.getText()));
		db.milkV.get(3).setPrice(Integer.parseInt(admin.pPriceField_4.getText()));
		db.milkV.get(4).setPrice(Integer.parseInt(admin.pPriceField_5.getText()));
		db.milkV.get(5).setPrice(Integer.parseInt(admin.pPriceField_6.getText()));
		db.milkV.get(6).setPrice(Integer.parseInt(admin.pPriceField_7.getText()));
		db.milkV.get(7).setPrice(Integer.parseInt(admin.pPriceField_8.getText()));
		db.milkV.get(8).setPrice(Integer.parseInt(admin.pPriceField_9.getText()));

		db.milkV.get(0).setStock(Integer.parseInt(admin.pStockField_1.getText()));
		db.milkV.get(1).setStock(Integer.parseInt(admin.pStockField_2.getText()));
		db.milkV.get(2).setStock(Integer.parseInt(admin.pStockField_3.getText()));
		db.milkV.get(3).setStock(Integer.parseInt(admin.pStockField_4.getText()));
		db.milkV.get(4).setStock(Integer.parseInt(admin.pStockField_5.getText()));
		db.milkV.get(5).setStock(Integer.parseInt(admin.pStockField_6.getText()));
		db.milkV.get(6).setStock(Integer.parseInt(admin.pStockField_7.getText()));
		db.milkV.get(7).setStock(Integer.parseInt(admin.pStockField_8.getText()));
		db.milkV.get(8).setStock(Integer.parseInt(admin.pStockField_9.getText()));

		db.saveData();
	}

	public void salseByMilk() {// 상품별 판매량을 나타내는 메소드
		admin.pSaleDisplayArea.setText("");
		for (int i = 0; i < db.milkV.size(); i++) {
			admin.pSaleDisplayArea.append(db.milkV.get(i).getName() + " : \t" + db.milkV.get(i).getSell());
			if (i + 1 != db.milkV.size()) {
				admin.pSaleDisplayArea.append("\n");
			}
		}
	}

	public static void main(String[] args) {
		new Controller();
	}
}