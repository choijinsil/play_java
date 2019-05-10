package com.milk.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.milk.model.MoneyModel;
import com.milk.view.MAdmin;
import com.milk.view.MMainView;
import com.milk.view.WalletView;

public class Controller implements ActionListener {

	MMainView mainview;
	MAdmin admin;
	WalletView wallet;
	MoneyModel moneyModel;

	// ≈‰≈ª¿‹æ◊«•Ω√
	public Controller() {
		mainview = new MMainView();
		admin = new MAdmin();
		wallet = new WalletView();

		moneyModel = new MoneyModel();

		wallet.input100Btn.addActionListener(this);
		wallet.input500Btn.addActionListener(this);
		wallet.input1000Btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int cnt100 = 0;
		int cnt500 = 0;
		int cnt1000 = 0;

		if (e.getSource() == wallet.input100Btn) {
			cnt100++;
			mainview.moneyDisplayArea.setText(moneyModel.insert(cnt100, cnt500, cnt1000) + "");

		} else if (e.getSource() == wallet.input500Btn) {
			cnt500++;
			mainview.moneyDisplayArea.setText(moneyModel.insert(cnt100, cnt500, cnt1000) + "");
		} else if (e.getSource() == wallet.input1000Btn) {
			cnt1000++;
			mainview.moneyDisplayArea.setText(moneyModel.insert(cnt100, cnt500, cnt1000) + "");
		}
		// String balance=moneyModel.insert(cnt100, cnt500, cnt1000) + "";
		// mainview.moneyDisplayArea.setText(balance);

	}

	public static void main(String[] args) {
		new Controller();
	}
}
