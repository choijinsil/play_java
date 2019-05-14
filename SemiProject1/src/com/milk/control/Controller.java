package com.milk.control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import com.milk.model.DatabaseIO;
import com.milk.model.Milk;
import com.milk.model.MilkModel;
import com.milk.model.MoneyModel;
import com.milk.view.MAdmin;
import com.milk.view.MMainView;
import com.milk.view.WalletView;

public class Controller implements ActionListener, Runnable {

	MMainView mainview;
	MAdmin admin;
	WalletView wallet;
	MoneyModel moneyModel;
	MilkModel milkModel;
	DatabaseIO db;

	Milk sellM;

	// ��Ż�ܾ�ǥ��
	public Controller() {
		mainview = new MMainView();
		admin = new MAdmin();
		wallet = new WalletView();

		db = new DatabaseIO();

		db.loadMoney();

		db.loadData();

		updateMainView();
		updateView();

		action();

		moneyModel = new MoneyModel(db);
		milkModel = new MilkModel(db);

		Thread t = new Thread(this);
		t.start();

		checkStockThread checkStock = new checkStockThread();
		checkStock.start();
	}

	public void action() {
		admin.changeSave.addActionListener(this);
		admin.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				updateP();
				updateMainView();
				mainview.setVisible(true);
				admin.setVisible(false);
			}
		});// �����ں� ����� ������ ���� �� mainâ���� ���ư���
		admin.returnBtn.addActionListener(this);
		admin.saveFileBtn.addActionListener(this);

		// Wallet��
		wallet.input100Btn.addActionListener(this);
		wallet.input500Btn.addActionListener(this);
		wallet.input1000Btn.addActionListener(this);
		wallet.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				wallet.setVisible(false);
			}
		});

		// MainView
		mainview.keypadBtn_1.addActionListener(this);
		mainview.keypadBtn_2.addActionListener(this);
		mainview.keypadBtn_3.addActionListener(this);
		mainview.keypadBtn_4.addActionListener(this);
		mainview.keypadBtn_5.addActionListener(this);
		mainview.keypadBtn_6.addActionListener(this);
		mainview.keypadBtn_7.addActionListener(this);
		mainview.keypadBtn_8.addActionListener(this);
		mainview.keypadBtn_9.addActionListener(this);
		mainview.returnBtn.addActionListener(this);
		// mainview.productOutBtn.addActionListener(this);
		mainview.keypadBtn_OK.addActionListener(this);
		mainview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				db.saveData();
				mainview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});// ���κ� ����� ������ ���� �� ����
		mainview.moneyInputBtn.addActionListener(this);
		mainview.adminBtn.addActionListener(this);

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
			// mainview.keyDisplayArea.setText("��ǰ�� �������ּ���");

			possibleMilk();

		} else if (ob == wallet.input500Btn) {
			cnt500++;
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + "");
			// mainview.keyDisplayArea.setText("��ǰ�� �������ּ���");
			possibleMilk();

		} else if (ob == wallet.input1000Btn) {
			cnt1000++;
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + "");
			mainview.keyDisplayArea.setText("��ǰ�� �������ּ���");

			possibleMilk();

		} else if (ob == mainview.keypadBtn_1) {
			mainview.keyDisplayArea.setText("1");
			// mainview.keyDisplayArea.setText(mainview.keypadBtn_1.getText());
		} else if (ob == mainview.keypadBtn_2) {
			mainview.keyDisplayArea.setText("2");
		} else if (ob == mainview.keypadBtn_3) {
			mainview.keyDisplayArea.setText("3");
		} else if (ob == mainview.keypadBtn_4) {
			mainview.keyDisplayArea.setText("4");
		} else if (ob == mainview.keypadBtn_5) {
			mainview.keyDisplayArea.setText("5");
		} else if (ob == mainview.keypadBtn_6) {
			mainview.keyDisplayArea.setText("6");
		} else if (ob == mainview.keypadBtn_7) {
			mainview.keyDisplayArea.setText("7");
		} else if (ob == mainview.keypadBtn_8) {
			mainview.keyDisplayArea.setText("8");
		} else if (ob == mainview.keypadBtn_9) {
			mainview.keyDisplayArea.setText("9");
		} else if (ob == mainview.keypadBtn_OK) {

			sellM = milkModel.selectStock(Integer.parseInt(mainview.keyDisplayArea.getText()));
			if (milkModel.checkStock(sellM)) {
				if (moneyModel.comparePrice(sellM)) {
					milkModel.sellMilk(sellM);
					moneyModel.minusBalance(sellM);
					mainview.moneyDisplayArea.setText(db.balance + "");
					possibleMilk();
					updateView();

					System.out.println("����"); // ��ǰ ���� �� ��ǰ��ȯ��ư Ȱ��ȭ

					JButton milkPrintBtn = new JButton("");
//					milkda.setSize(30, 30);
					milkPrintBtn.setIcon(milkIcon(Integer.parseInt(mainview.keyDisplayArea.getText())));
					mainview.keyDisplayArea.setText("");
					milkPrintBtn.setBorderPainted(false);
					milkPrintBtn.setContentAreaFilled(false);
					milkPrintBtn.setFocusPainted(false);
					milkPrintBtn.setOpaque(false);
					mainview.productOutPanel.add(milkPrintBtn);
					mainview.keyDisplayArea.setText("");
					// mainview.productOutPanel.setVisible(false);
					milkPrintBtn.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							mainview.productOutPanel.removeAll();
							mainview.productOutPanel.setVisible(false);
							mainview.productOutPanel.setVisible(true);
						}
					});
					mainview.productOutPanel.add(milkPrintBtn);

					mainview.productOutPanel.setVisible(true);

				} else
					System.out.println("�ʵ�����");
			} else
				System.out.println("�����");

		} else if (ob == mainview.returnBtn) {
			mainview.moneyDisplayArea.setText("0");
			possibleMilk();
			moneyModel.returnBalance(db.balance);
			JOptionPane.showMessageDialog(mainview,
					"�ܵ���" + db.balance + "\n" + "500�� : " + moneyModel.don500 + "��, 100�� : " + moneyModel.don100 + "��");
			db.saveMoney();
			db.balance = 0;
		} else if (ob == mainview.productOutBtn) {
			System.out.println(sellM.getName());
			// �並 �ϳ� �� ���� �̹��� �������� �׿�����, �ⱸ��ư ������ ���̰�
		} else if (ob == admin.changeSave) {
			updateP();
			updateMainView();
		}
		// ==========================================
		else if (ob == mainview.moneyInputBtn) {
			wallet.setVisible(true);
		} else if (ob == mainview.adminBtn) {
			JPasswordField pwd = new JPasswordField(10);
			int keyPwd = JOptionPane.showConfirmDialog(admin, pwd, "��й�ȣ�� �Է��ϼ���", JOptionPane.OK_CANCEL_OPTION);
			if (keyPwd == 0 && new String(pwd.getPassword()).equals("1234")) {
				admin.setVisible(true);
				mainview.setVisible(false);
				salseByMilk();
				moneyModel.sumSales();
				admin.tSaleDisplayArea.setText(moneyModel.sum + "");
			} else if (keyPwd == 0 && !new String(pwd.getPassword()).equals("1234")) {
				JOptionPane.showMessageDialog(admin, "��й�ȣ�� Ʋ�Ƚ��ϴ�");
			}
		} else if (ob == admin.returnBtn) {
			int answer = JOptionPane.showConfirmDialog(admin, "��������� �����ϼ̽��ϱ�?", "������� ���� Ȯ��", 1);
			if (answer == 0) {
				admin.setVisible(false);
				mainview.setVisible(true);
			}
		} else if (ob == admin.saveFileBtn) {
			int answer = JOptionPane.showConfirmDialog(admin, "��ο� �����Ͻðڽ��ϱ�?", "��� ���� Ȯ��", 1);
			if (answer == 0) {
				db.salesStament();
				salseByMilk();
				admin.tSaleDisplayArea.setText(moneyModel.sum + "");
			}

		}

		// =================================================

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
		if (!admin.pPriceField_1.getText().matches("[0-9]+") || !admin.pPriceField_2.getText().matches("[0-9]+")
				|| !admin.pPriceField_3.getText().matches("[0-9]+") || !admin.pPriceField_4.getText().matches("[0-9]+")
				|| !admin.pPriceField_5.getText().matches("[0-9]+") || !admin.pPriceField_6.getText().matches("[0-9]+")
				|| !admin.pPriceField_7.getText().matches("[0-9]+") || !admin.pPriceField_8.getText().matches("[0-9]+")
				|| !admin.pPriceField_9.getText().matches("[0-9]+")) {
			JOptionPane.showMessageDialog(admin, "��ǰ ���ݿ� ���ڸ� �Է��ϼ���");
		} else {
			db.milkV.get(0).setPrice(Integer.parseInt(admin.pPriceField_1.getText()));
			db.milkV.get(1).setPrice(Integer.parseInt(admin.pPriceField_2.getText()));
			db.milkV.get(2).setPrice(Integer.parseInt(admin.pPriceField_3.getText()));
			db.milkV.get(3).setPrice(Integer.parseInt(admin.pPriceField_4.getText()));
			db.milkV.get(4).setPrice(Integer.parseInt(admin.pPriceField_5.getText()));
			db.milkV.get(5).setPrice(Integer.parseInt(admin.pPriceField_6.getText()));
			db.milkV.get(6).setPrice(Integer.parseInt(admin.pPriceField_7.getText()));
			db.milkV.get(7).setPrice(Integer.parseInt(admin.pPriceField_8.getText()));
			db.milkV.get(8).setPrice(Integer.parseInt(admin.pPriceField_9.getText()));
		}

		if (!admin.pStockField_1.getText().matches("[0-9]+") || !admin.pStockField_2.getText().matches("[0-9]+")
				|| !admin.pStockField_3.getText().matches("[0-9]+") || !admin.pStockField_4.getText().matches("[0-9]+")
				|| !admin.pStockField_5.getText().matches("[0-9]+") || !admin.pStockField_6.getText().matches("[0-9]+")
				|| !admin.pStockField_7.getText().matches("[0-9]+") || !admin.pStockField_8.getText().matches("[0-9]+")
				|| !admin.pStockField_9.getText().matches("[0-9]+")) {
			JOptionPane.showMessageDialog(admin, "��ǰ ��� ���ڸ� �Է��ϼ���");
		} else {
			db.milkV.get(0).setStock(Integer.parseInt(admin.pStockField_1.getText()));
			db.milkV.get(1).setStock(Integer.parseInt(admin.pStockField_2.getText()));
			db.milkV.get(2).setStock(Integer.parseInt(admin.pStockField_3.getText()));
			db.milkV.get(3).setStock(Integer.parseInt(admin.pStockField_4.getText()));
			db.milkV.get(4).setStock(Integer.parseInt(admin.pStockField_5.getText()));
			db.milkV.get(5).setStock(Integer.parseInt(admin.pStockField_6.getText()));
			db.milkV.get(6).setStock(Integer.parseInt(admin.pStockField_7.getText()));
			db.milkV.get(7).setStock(Integer.parseInt(admin.pStockField_8.getText()));
			db.milkV.get(8).setStock(Integer.parseInt(admin.pStockField_9.getText()));
		}
		db.saveData();
	}

	// ���&�ܵ����� Ȯ�� �� �Ǹ���or�Ǹ����� ǥ�� �޼ҵ�
	public void run() {
		if (milkModel.checkTotalStock() || moneyModel.checkTotalBalance()) {
			mainview.saleOkLabel.setVisible(false);
			mainview.saleNoLabel.setVisible(true);
		} else {
			mainview.saleOkLabel.setVisible(true);
			mainview.saleNoLabel.setVisible(false);
		}
	}

	// ��� ���� ��� ����ǥ�� ��ſ� ��� ������ �߰��ϱ�(������ Ŭ���� ���� ������, �Ǹ�����ǥ�ö� ���� �ؾߵǴϱ�)
	class checkStockThread extends Thread {
		public void run() {
			while (true) {
				for (int i = 0; i < db.milkV.size(); i++) {
					if (db.milkV.get(i).getStock() == 0) { // ��� 0�̸�
						switch (db.milkV.get(i).getNo()) {
						case 1:
							mainview.pPriceField_1.setText("������");
							mainview.pPriceField_1.setOpaque(true);
							mainview.pPriceField_1.setBackground(Color.RED);
							break;
						case 2:
							mainview.pPriceField_2.setText("������");
							mainview.pPriceField_2.setOpaque(true);
							mainview.pPriceField_2.setBackground(Color.RED);
							break;
						case 3:
							mainview.pPriceField_3.setText("������");
							mainview.pPriceField_3.setOpaque(true);
							mainview.pPriceField_3.setBackground(Color.RED);
							break;
						case 4:
							mainview.pPriceField_4.setText("������");
							mainview.pPriceField_4.setOpaque(true);
							mainview.pPriceField_4.setBackground(Color.RED);
							break;
						case 5:
							mainview.pPriceField_5.setText("������");
							mainview.pPriceField_5.setOpaque(true);
							mainview.pPriceField_5.setBackground(Color.RED);
							break;
						case 6:
							mainview.pPriceField_6.setText("������");
							mainview.pPriceField_6.setOpaque(true);
							mainview.pPriceField_6.setBackground(Color.RED);
							break;
						case 7:
							mainview.pPriceField_7.setText("������");
							mainview.pPriceField_7.setOpaque(true);
							mainview.pPriceField_7.setBackground(Color.RED);
							break;
						case 8:
							mainview.pPriceField_8.setText("������");
							mainview.pPriceField_8.setOpaque(true);
							mainview.pPriceField_8.setBackground(Color.RED);
							break;
						case 9:
							mainview.pPriceField_9.setText("������");
							mainview.pPriceField_9.setOpaque(true);
							mainview.pPriceField_9.setBackground(Color.RED);
							break;
						}
					} else if (db.milkV.get(i).getStock() > 0 && !(db.milkV.get(i).isOnSale())) { // ��� ������
						switch (db.milkV.get(i).getNo()) {
						case 1:
							mainview.pPriceField_1.setOpaque(false);
							mainview.pPriceField_1.setBackground(null);
							break;
						case 2:
							mainview.pPriceField_2.setOpaque(false);
							mainview.pPriceField_2.setBackground(null);
							break;
						case 3:
							mainview.pPriceField_3.setOpaque(false);
							mainview.pPriceField_3.setBackground(null);
							break;
						case 4:
							mainview.pPriceField_4.setOpaque(false);
							mainview.pPriceField_4.setBackground(null);
							break;
						case 5:
							mainview.pPriceField_5.setOpaque(false);
							mainview.pPriceField_5.setBackground(null);
							break;
						case 6:
							mainview.pPriceField_6.setOpaque(false);
							mainview.pPriceField_6.setBackground(null);
							break;
						case 7:
							mainview.pPriceField_7.setOpaque(false);
							mainview.pPriceField_7.setBackground(null);
							break;
						case 8:
							mainview.pPriceField_8.setOpaque(false);
							mainview.pPriceField_8.setBackground(null);
							break;
						case 9:
							mainview.pPriceField_9.setOpaque(false);
							mainview.pPriceField_9.setBackground(null);
							break;
						}// case
					} // else
				} // for
			} // while
		}// run
	}// class checkStockTread

	public void possibleMilk() {

		moneyModel.compareAll(Integer.parseInt(mainview.moneyDisplayArea.getText()));

		for (int i = 0; i < db.milkV.size(); i++) {

			// ���� ���� ������ ����ִ� ��ǰ�� true
			if (db.milkV.get(i).isOnSale() && (db.milkV.get(i).getStock() > 0)) {

				// mainview.pPriceField_+String.valueof(i).setBackground(Color.RED);
				mainview.keypadBtn_OK.setEnabled(true);
				if (db.milkV.get(i).getNo() == 1) { // 1 2 3
					System.out.println("�迭>>>>>>> " + db.milkV.get(i).getNo());
					mainview.pPriceField_1.setOpaque(true);
					mainview.pPriceField_1.setBackground(Color.YELLOW);

				} else if (db.milkV.get(i).getNo() == 2) {
					mainview.pPriceField_2.setOpaque(true);
					mainview.pPriceField_2.setBackground(Color.YELLOW);

				} else if (db.milkV.get(i).getNo() == 3) {
					mainview.pPriceField_3.setOpaque(true);
					mainview.pPriceField_3.setBackground(Color.YELLOW);

				} else if (db.milkV.get(i).getNo() == 4) {
					mainview.pPriceField_4.setOpaque(true);
					mainview.pPriceField_4.setBackground(Color.YELLOW);
				} else if (db.milkV.get(i).getNo() == 5) {
					mainview.pPriceField_5.setOpaque(true);
					mainview.pPriceField_5.setBackground(Color.YELLOW);
				} else if (db.milkV.get(i).getNo() == 6) {
					mainview.pPriceField_6.setOpaque(true);
					mainview.pPriceField_6.setBackground(Color.YELLOW);
				} else if (db.milkV.get(i).getNo() == 7) {
					mainview.pPriceField_7.setOpaque(true);
					mainview.pPriceField_7.setBackground(Color.YELLOW);
				} else if (db.milkV.get(i).getNo() == 8) {
					mainview.pPriceField_8.setOpaque(true);
					mainview.pPriceField_8.setBackground(Color.YELLOW);
				} else if (db.milkV.get(i).getNo() == 9) {
					mainview.pPriceField_9.setOpaque(true);
					mainview.pPriceField_9.setBackground(Color.YELLOW);
				}

			} else { // false��

				// mainview.keypadBtn_OK.setEnabled(false);
				if (db.milkV.get(i).getNo() == 1) {
					mainview.pPriceField_1.setOpaque(false);
					mainview.pPriceField_1.setBackground(null);
				} else if (db.milkV.get(i).getNo() == 2) {
					mainview.pPriceField_2.setOpaque(false);
					mainview.pPriceField_2.setBackground(null);
					// mainview.pPriceField_2.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() == 3) {
					mainview.pPriceField_3.setBackground(null);
					mainview.pPriceField_3.setOpaque(false);
					// mainview.pPriceField_3.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() == 4) {
					mainview.pPriceField_4.setBackground(null);
					mainview.pPriceField_4.setOpaque(false);
					// mainview.pPriceField_4.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() == 5) {
					mainview.pPriceField_5.setBackground(null);
					mainview.pPriceField_5.setOpaque(false);
					// mainview.pPriceField_5.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() == 6) {
					mainview.pPriceField_6.setBackground(null);
					mainview.pPriceField_6.setOpaque(false);
					// mainview.pPriceField_6.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() == 7) {
					mainview.pPriceField_7.setBackground(null);
					mainview.pPriceField_7.setOpaque(false);
					// mainview.pPriceField_7.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() == 8) {
					mainview.pPriceField_8.setBackground(null);
					mainview.pPriceField_8.setOpaque(false);
					// mainview.pPriceField_8.setBackground(Color.WHITE);
				} else if (db.milkV.get(i).getNo() == 9) {
					mainview.pPriceField_9.setBackground(null);
					mainview.pPriceField_9.setOpaque(false);
					// mainview.pPriceField_9.setBackground(Color.WHITE);
				}
			}
		}
	}

	public ImageIcon milkIcon(int i) {// �̹��� ��ȯ
		ImageIcon milkI;
		switch (i) {
		case 1:
			milkI = new ImageIcon("image/milk/�������.png");
			return milkI;
		case 2:
			milkI = new ImageIcon("image/milk/���ڿ���.png");
			return milkI;
		case 3:
			milkI = new ImageIcon("image/milk/�޷п���.png");
			return milkI;
		case 4:
			milkI = new ImageIcon("image/milk/�����.png");
			return milkI;
		case 5:
			milkI = new ImageIcon("image/milk/�ֿ���.png");
			return milkI;
		case 6:
			milkI = new ImageIcon("image/milk/Ŀ�ǿ���.png");
			return milkI;
		case 7:
			milkI = new ImageIcon("image/milk/�ٳ�������.png");
			return milkI;
		case 8:
			milkI = new ImageIcon("image/milk/�������.png");
			return milkI;
		case 9:
			milkI = new ImageIcon("image/milk/�����ƿ���.png");
			return milkI;
		}
		return null;
	}

	public void salseByMilk() {// ��ǰ�� �Ǹŷ��� ��Ÿ���� �޼ҵ�
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