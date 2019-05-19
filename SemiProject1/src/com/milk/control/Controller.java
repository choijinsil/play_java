package com.milk.control;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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

	public Controller() {
		mainview = new MMainView(); //���κ� �ҷ�����
		admin = new MAdmin(); //�����ں� �ҷ�����
		wallet = new WalletView(); //�������� �ҷ�����

		db = new DatabaseIO(); //db�ҷ�����
		db.loadMoney(); 
		db.loadData();
		db.loadSum();
		
		updateMainView(); //���κ� ���� ����
		//updateView(); 

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
				db.saveMoney();
				db.saveSum();
				db.saveData();
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
		mainview.keypadBtn_OK.addActionListener(this);
		mainview.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				db.saveData();
				db.saveMoney();
				db.saveSum();
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

		if (ob == wallet.input100Btn) { //���� Ŭ������ ��
			cnt100++; //Ŭ�� Ƚ��
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + ""); //�ܾ�ǥ��

			possibleMilk();

		} else if (ob == wallet.input500Btn) {
			cnt500++;
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + "");
			
			possibleMilk();

		} else if (ob == wallet.input1000Btn) {
			cnt1000++;
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + "");

			possibleMilk();

		} else if (ob == mainview.keypadBtn_1) {
			mainview.keyDisplayArea.setText("1");
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
			try {
				sellM = milkModel.selectStock(Integer.parseInt(mainview.keyDisplayArea.getText()));
				//�������� ��°�� sellM�� �����ϱ�
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(mainview, "��ǰ�� �������ּ���");
				return;
			}
			if (milkModel.checkStock(sellM)) {
				if (moneyModel.comparePrice(sellM)) {
					milkModel.sellMilk(sellM);//���� ����, �Ǹŷ��� ����
					moneyModel.minusBalance(sellM); //�ܾ� ����
					mainview.moneyDisplayArea.setText(db.balance + ""); //�ܾ� ǥ�����ֱ�
					possibleMilk(); //����� �ٽ� ȣ��
					//updateView(); 
					//System.out.println("����"); 
					
					//��ȯ���� ��ǰǥ�����ֱ� 
					mainview.productOutPanel.setSize(mainview.productOutPanel.getWidth()+107, 170); 
					// �̹����� �߰��� ĭ �̸� �����صα�
					
				     JButton milkPrintBtn = new JButton("");//��ư�����
				     milkPrintBtn.setIcon(milkIcon(Integer.parseInt(mainview.keyDisplayArea.getText())));//�׸��ֱ�
				     mainview.keyDisplayArea.setText("");//�ʱ�ȭ
				     milkPrintBtn.setBorderPainted(false);//�׵θ����ֱ�
				     milkPrintBtn.setContentAreaFilled(false);//�׶��̼Ǿ��ֱ�
				     milkPrintBtn.setFocusPainted(false);//��Ŀ���� �׵θ� ���ֱ�
				     milkPrintBtn.setOpaque(false);//����
				     mainview.productOutPanel.add(milkPrintBtn);//panel�� ��ư �ֱ�
				     
				     milkPrintBtn.addActionListener(new ActionListener() {//���� �߿� �ϳ��� ������
				     	@Override
				     	public void actionPerformed(ActionEvent e) {
				      	mainview.productOutPanel.removeAll();//��ǰ���� �� ���ֱ�
				      	mainview.productOutPanel.setVisible(false);
				      	mainview.productOutPanel.setVisible(true);	//�� ���� panel ���ΰ�ħ
				     	}
				    	});
				     mainview.productOutPanel.setVisible(true);//��ǰ �߰��� �� panel ���ΰ�ħ
				     mainview.scrollP.getHorizontalScrollBar().setMaximum(mainview.scrollP.getHorizontalScrollBar().getMaximum()+107); 
				     // ��ũ�� max�� �ø���
				     mainview.scrollP.getHorizontalScrollBar().setValue(mainview.scrollP.getHorizontalScrollBar().getMaximum());  
				     // ��ũ�� max������ �ű��

				} else
					//System.out.println("�ʵ�����");
					JOptionPane.showMessageDialog(mainview, "�ܾ��� �����մϴ�");
			} 

		} else if (ob == mainview.returnBtn) {
			mainview.moneyDisplayArea.setText("0"); //�ܾ�â 0���� �ʱ�ȭ
			mainview.keyDisplayArea.setText(""); //��ǰ����â �ʱ�ȭ
			possibleMilk(); //����� ������
			moneyModel.returnBalance(db.balance); //�ܾ׹�ȯ ����ϱ�
			JOptionPane.showMessageDialog(mainview, "�ܵ���" + db.balance + "\n" +"1000�� : " +moneyModel.don1000 + "��, 500�� : " + moneyModel.don500 + "��, 100�� : " + moneyModel.don100 + "��");
			db.saveMoney(); //�������� ����
			db.balance = 0; //�����Ϳ� ����� �ܾ� 0���� �ʱ�ȭ
			
		} else if (ob == mainview.moneyInputBtn) { //�������� Ŭ��
			wallet.setVisible(true); //��������â �߱�
			
		} else if (ob == mainview.adminBtn) { //������ â���� �̵�
			wallet.setVisible(false); 
			JPasswordField pwd = new JPasswordField(10); // ��й�ȣ �Է½� ***�� ������ ���� 
			int keyPwd = JOptionPane.showConfirmDialog(admin, pwd, "��й�ȣ�� �Է��ϼ���", JOptionPane.OK_CANCEL_OPTION);
			if (keyPwd == 0 && new String(pwd.getPassword()).equals("1234")) { //Ȯ�ι�ư 0��ȯ & ��й�ȣ��ġ
				admin.setVisible(true);
				mainview.setVisible(false);
				updateView(); //�����ں信 ���� ǥ��
				salseByMilk(); //��ǰ�� �Ǹŷ� ǥ��
				moneyModel.sumSales(); //���� �Ǹŷ� ���
				admin.todaySaleDisplayArea.setText(moneyModel.todaySum+""); //���� �Ǹŷ� ǥ��
			    admin.tSaleDisplayArea.setText((db.sum+moneyModel.todaySum)+""); //�� �Ǹŷ� ǥ��
			} else if (keyPwd == 0 && !new String(pwd.getPassword()).equals("1234")) {
				JOptionPane.showMessageDialog(admin, "��й�ȣ�� Ʋ�Ƚ��ϴ�"); }
	
		//=================<�����ں�>========================
			
		} else if (ob == admin.changeSave) { //������� �����ϱ�
			updateP();
			updateMainView();
			db.saveData();
			db.saveMoney();
		}
		
		else if (ob == admin.returnBtn) { //���κ�� ���ư���
			int answer = JOptionPane.showConfirmDialog(admin, "��������� �����ϼ̽��ϱ�?", "������� ���� Ȯ��", 1);
			if (answer == 0) {
				admin.setVisible(false);
				mainview.setVisible(true);
			}
			
		} else if (ob == admin.saveFileBtn) {//��α��� ��ư=����
			   File fsales = new File("sales"); //���� �����
			   int answer = JOptionPane.showConfirmDialog(admin, "���� �Ͻðڽ��ϱ�?", "���� Ȯ��", 1);
			  	if (answer == 0) {
			  	 Calendar cal = Calendar.getInstance();
			  	 
			   	int year = cal.get(Calendar.YEAR);
			   	int month = cal.get(Calendar.MONTH)+1;
			   	int date = cal.get(Calendar.DATE);
			   	
			   	String monthstr; //���� �ڸ��� ���缭 ����
			   	if(month<10) {
			    	monthstr = ("0"+month);
			   	}else{monthstr = (month+"");}
			   	
			  	 File f = new File("sales/"+(year+"_"+monthstr+"_"+date+"�Ǹű��.txt"));//�������� �̸� ����
			  	 
			  	 	if(f.exists()) { //������ �����Ѵٸ�
			  	 	answer = JOptionPane.showConfirmDialog(admin,"���� ��ΰ� �ֽ��ϴ�. �߰��� �����Ͻʴϱ�?", "��� ���� Ȯ��", 1);
				    
				  	 	if (answer != 0) { //���� ���� & �߰� ���縦 ����
				  	 		return;
				  	 	} 
				  	//���� ���� & �߰� ���縦 �Ѵٸ�
				    db.saveSum(); //�� �Ǹŷ� ����
				    db.salesStament(); //�Ǹ� ��� ���� & ������ ���� �Ǹŷ��� 0���� �ʱ�ȭ
				    salseByMilk(); //������ ���� �Ǹŷ� �����ں信 ǥ��
				    moneyModel.todaySum=0; //todaySum ���� ������ 0���� �ʱ�ȭ 
				    admin.todaySaleDisplayArea.setText(moneyModel.todaySum+""); //���� �Ǹ� ǥ��
				    return;
				    }
			  	db.saveSum();//������ �������� �ʴ´ٸ� �ٷ� ����
			    db.salesStament();
			    salseByMilk();
			    moneyModel.todaySum=0;//0514����
			    admin.todaySaleDisplayArea.setText(moneyModel.todaySum+""); 	//0514����
			  	}
			  	
				}

		// =================================================

	}//�̺�Ʈ ��

	public void updateView() {//�����ں信 ���� ǥ��
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
		
		admin.coin100Field.setText(db.moneyV.get(0).getMoney100()+"");
		admin.coin500Field.setText(db.moneyV.get(0).getMoney500()+"");

	}

	public void updateMainView() {//���κ信 ���� ǥ��
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
	//JOptionPane.showMessageDialog(admin, "���� �Ǿ����ϴ�.");
	public void updateP() {//�����ں� ��ǰ ���� & ��� & �������� ���� ���� db�� ����
		if (!admin.pPriceField_1.getText().matches("[0-9]+")||
			!admin.pPriceField_2.getText().matches("[0-9]+")|| 
			!admin.pPriceField_3.getText().matches("[0-9]+")||
			!admin.pPriceField_4.getText().matches("[0-9]+")||
			!admin.pPriceField_5.getText().matches("[0-9]+")||
			!admin.pPriceField_6.getText().matches("[0-9]+")||
			!admin.pPriceField_7.getText().matches("[0-9]+")||
			!admin.pPriceField_8.getText().matches("[0-9]+")||
			!admin.pPriceField_9.getText().matches("[0-9]+")){
			JOptionPane.showMessageDialog(admin, "��ǰ ���ݿ� ���ڸ� �Է��ϼ���");
		} else {//���ڸ� ����
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

		if (!admin.pStockField_1.getText().matches("[0-9]{1,2}+")||
			!admin.pStockField_2.getText().matches("[0-9]{1,2}+")|| 
			!admin.pStockField_3.getText().matches("[0-9]{1,2}+")||
			!admin.pStockField_4.getText().matches("[0-9]{1,2}+")||
			!admin.pStockField_5.getText().matches("[0-9]{1,2}+")||
			!admin.pStockField_6.getText().matches("[0-9]{1,2}+")||
			!admin.pStockField_7.getText().matches("[0-9]{1,2}+")||
			!admin.pStockField_8.getText().matches("[0-9]{1,2}+")||
			!admin.pStockField_9.getText().matches("[0-9]{1,2}+")){
			JOptionPane.showMessageDialog(admin, "��ǰ ��� �� �ڸ� ������ ���ڸ� �Է��ϼ���");
		} else {//��� ���ڸ� ���� ���ڸ� ����
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
		
		if(!admin.coin100Field.getText().matches("[0-9]+")|| 
				  !admin.coin500Field.getText().matches("[0-9]+")) {
				   JOptionPane.showMessageDialog(admin, "���� ��� ���ڸ� �Է��ϼ���");
		}
		else {
			db.moneyV.get(0).setMoney100(Integer.parseInt(admin.coin100Field.getText()));
			db.moneyV.get(0).setMoney500(Integer.parseInt(admin.coin500Field.getText()));
		}
				  //db.saveData(); //data.txt����
				  //db.saveMoney(); //money.txt����
	}

	
		public void run() {// ���&�ܵ����� Ȯ�� �� �Ǹ���or�Ǹ����� ǥ�� �޼ҵ�
			while (true) {
				if (milkModel.checkTotalStock() || moneyModel.checkTotalBalance()) {
					mainview.saleOkLabel.setVisible(false);
					mainview.saleNoLabel.setVisible(true);//�Ǹ����� ǥ��
					mainview.keypadBtn_OK.setEnabled(false);//Ȯ�ι�ư ��Ȱ��ȭ
				} else {
					mainview.saleOkLabel.setVisible(true);
					mainview.saleNoLabel.setVisible(false);
				}
			}
		}

		// ���� ��� ���� ��� (�Ǹ�����,������ ǥ��) 
		// ��� ���� ��� & �ܾ��� ���� ������ ��� (���ǥ��) 
		// ��� ���� ��� & �ܾ��� ������ ��� (null)
		class checkStockThread extends Thread {
			public void run() {
				while (true) {
					for (int i = 0; i < db.milkV.size(); i++) {
						if (db.milkV.get(i).getStock() == 0) { 
							// ��� ���� �� (������, ������)
							switch (db.milkV.get(i).getNo()) {
							case 1:
								mainview.pPriceField_1.setText("������");
								mainview.pPriceField_1.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_1.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_1.setForeground(Color.white);
								mainview.pPriceField_1.setBackground(Color.red);
								mainview.pPriceField_1.setOpaque(true);
								break;
							case 2:
								mainview.pPriceField_2.setText("������");
								mainview.pPriceField_2.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_2.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_2.setForeground(Color.white);
								mainview.pPriceField_2.setBackground(Color.red);
								mainview.pPriceField_2.setOpaque(true);
								break;
							case 3:
								mainview.pPriceField_3.setText("������");
								mainview.pPriceField_3.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_3.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_3.setForeground(Color.white);
								mainview.pPriceField_3.setBackground(Color.red);
								mainview.pPriceField_3.setOpaque(true);
								break;
							case 4:
								mainview.pPriceField_4.setText("������");
								mainview.pPriceField_4.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_4.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_4.setForeground(Color.white);
								mainview.pPriceField_4.setBackground(Color.red);
								mainview.pPriceField_4.setOpaque(true);
								break;
							case 5:
								mainview.pPriceField_5.setText("������");
								mainview.pPriceField_5.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_5.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_5.setForeground(Color.white);
								mainview.pPriceField_5.setBackground(Color.red);
								mainview.pPriceField_5.setOpaque(true);
								break;
							case 6:
								mainview.pPriceField_6.setText("������");
								mainview.pPriceField_6.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_6.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_6.setForeground(Color.white);
								mainview.pPriceField_6.setBackground(Color.red);
								mainview.pPriceField_6.setOpaque(true);
								break;
							case 7:
								mainview.pPriceField_7.setText("������");
								mainview.pPriceField_7.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_7.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_7.setForeground(Color.white);
								mainview.pPriceField_7.setBackground(Color.red);
								mainview.pPriceField_7.setOpaque(true);
								break;
							case 8:
								mainview.pPriceField_8.setText("������");
								mainview.pPriceField_8.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_8.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_8.setForeground(Color.white);
								mainview.pPriceField_8.setBackground(Color.red);
								mainview.pPriceField_8.setOpaque(true);
								break;
							case 9:
								mainview.pPriceField_9.setText("������");
								mainview.pPriceField_9.setFont(new Font("���", Font.BOLD,15));
								mainview.pPriceField_9.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_9.setForeground(Color.white);
								mainview.pPriceField_9.setBackground(Color.red);
								mainview.pPriceField_9.setOpaque(true);
								break;
							}
							if(mainview.pPriceField_1.getBackground() != Color.YELLOW &&
									mainview.pPriceField_2.getBackground() != Color.YELLOW &&
									mainview.pPriceField_3.getBackground() != Color.YELLOW &&
									mainview.pPriceField_4.getBackground() != Color.YELLOW &&
									mainview.pPriceField_5.getBackground() != Color.YELLOW &&
									mainview.pPriceField_6.getBackground() != Color.YELLOW &&
									mainview.pPriceField_7.getBackground() != Color.YELLOW &&
									mainview.pPriceField_8.getBackground() != Color.YELLOW &&
									mainview.pPriceField_9.getBackground() != Color.YELLOW ) {
								mainview.keypadBtn_OK.setEnabled(false);//������� �ϳ��� ���� �� Ȯ�ι�ư ��Ȱ��ȭ
							}
						} else if(db.milkV.get(i).getStock()>0 && !(db.milkV.get(i).isOnSale())) { 
							// ��� �ְ�, �ܾ��� ������ �� (null)
							switch (db.milkV.get(i).getNo()) {
							case 1:
								mainview.pPriceField_1.setOpaque(false);
								mainview.pPriceField_1.setBackground(null);
								mainview.pPriceField_1.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_1.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_1.setForeground(Color.black);
								break;
							case 2:
								mainview.pPriceField_2.setOpaque(false);
								mainview.pPriceField_2.setBackground(null);
								mainview.pPriceField_2.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_2.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_2.setForeground(Color.black);
								break;
							case 3:
								mainview.pPriceField_3.setOpaque(false);
								mainview.pPriceField_3.setBackground(null);
								mainview.pPriceField_3.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_3.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_3.setForeground(Color.black);
								
								break;
							case 4:
								mainview.pPriceField_4.setOpaque(false);
								mainview.pPriceField_4.setBackground(null);
								mainview.pPriceField_4.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_4.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_4.setForeground(Color.black);
								break;
							case 5:
								mainview.pPriceField_5.setOpaque(false);
								mainview.pPriceField_5.setBackground(null);
								mainview.pPriceField_5.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_5.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_5.setForeground(Color.black);
								break;
							case 6:
								mainview.pPriceField_6.setOpaque(false);
								mainview.pPriceField_6.setBackground(null);
								mainview.pPriceField_6.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_6.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_6.setForeground(Color.black);
								break;
							case 7:
								mainview.pPriceField_7.setOpaque(false);
								mainview.pPriceField_7.setBackground(null);
								mainview.pPriceField_7.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_7.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_7.setForeground(Color.black);
								break;
							case 8:
								mainview.pPriceField_8.setOpaque(false);
								mainview.pPriceField_8.setBackground(null);
								mainview.pPriceField_8.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_8.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_8.setForeground(Color.black);
								break;
							case 9:
								mainview.pPriceField_9.setOpaque(false);
								mainview.pPriceField_9.setBackground(null);
								mainview.pPriceField_9.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_9.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_9.setForeground(Color.black);
								break;
							}// case
							if(mainview.pPriceField_1.getBackground() != Color.YELLOW &&
									mainview.pPriceField_2.getBackground() != Color.YELLOW &&
									mainview.pPriceField_3.getBackground() != Color.YELLOW &&
									mainview.pPriceField_4.getBackground() != Color.YELLOW &&
									mainview.pPriceField_5.getBackground() != Color.YELLOW &&
									mainview.pPriceField_6.getBackground() != Color.YELLOW &&
									mainview.pPriceField_7.getBackground() != Color.YELLOW &&
									mainview.pPriceField_8.getBackground() != Color.YELLOW &&
									mainview.pPriceField_9.getBackground() != Color.YELLOW ) {
								mainview.keypadBtn_OK.setEnabled(false);//������� �ϳ��� ������ Ȯ�ι�ư ��Ȱ��ȭ
							}
						} // else
						else if (db.milkV.get(i).getStock() > 0 && (db.milkV.get(i).isOnSale())) {
							//��� ���� & �ܾ��� ����� ��
							if (db.milkV.get(i).getNo() == 1) { // 1 2 3
								mainview.pPriceField_1.setOpaque(true);
								mainview.pPriceField_1.setBackground(Color.YELLOW);
								mainview.pPriceField_1.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_1.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 2) {
								mainview.pPriceField_2.setOpaque(true);
								mainview.pPriceField_2.setBackground(Color.YELLOW);
								mainview.pPriceField_2.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_2.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 3) {
								mainview.pPriceField_3.setOpaque(true);
								mainview.pPriceField_3.setBackground(Color.YELLOW);
								mainview.pPriceField_3.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_3.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 4) {
								mainview.pPriceField_4.setOpaque(true);
								mainview.pPriceField_4.setBackground(Color.YELLOW);
								mainview.pPriceField_4.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_4.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 5) {
								mainview.pPriceField_5.setOpaque(true);
								mainview.pPriceField_5.setBackground(Color.YELLOW);
								mainview.pPriceField_5.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_5.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 6) {
								mainview.pPriceField_6.setOpaque(true);
								mainview.pPriceField_6.setBackground(Color.YELLOW);
								mainview.pPriceField_6.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_6.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 7) {
								mainview.pPriceField_7.setOpaque(true);
								mainview.pPriceField_7.setBackground(Color.YELLOW);
								mainview.pPriceField_7.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_7.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 8) {
								mainview.pPriceField_8.setOpaque(true);
								mainview.pPriceField_8.setBackground(Color.YELLOW);
								mainview.pPriceField_8.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_8.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 9) {
								mainview.pPriceField_9.setOpaque(true);
								mainview.pPriceField_9.setBackground(Color.YELLOW);
								mainview.pPriceField_9.setFont(new Font("���", Font.BOLD,20));
								mainview.pPriceField_9.setHorizontalAlignment(JTextField.CENTER);
							}
						}
					} // for
				} // while
			}// run
		}// class checkStockTread


		public void possibleMilk() {

			moneyModel.compareAll(Integer.parseInt(mainview.moneyDisplayArea.getText()));

			for (int i = 0; i < db.milkV.size(); i++) {

				// ���� ���� ������ ����ִ� ��ǰ�� true
				if (db.milkV.get(i).isOnSale() && (db.milkV.get(i).getStock()>0)) {

						mainview.keypadBtn_OK.setEnabled(true); //Ȯ�ι�ư Ȱ��ȭ
					if (db.milkV.get(i).getNo() == 1) { // 1 2 3
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

				} else { // false�� ȿ������
					if (db.milkV.get(i).getNo() == 1) {
						mainview.pPriceField_1.setOpaque(false);
						mainview.pPriceField_1.setBackground(null);
					} else if (db.milkV.get(i).getNo() == 2) {
						mainview.pPriceField_2.setOpaque(false);
						mainview.pPriceField_2.setBackground(null);
					} else if (db.milkV.get(i).getNo() == 3) {
						mainview.pPriceField_3.setBackground(null);
						mainview.pPriceField_3.setOpaque(false);
					} else if (db.milkV.get(i).getNo() == 4) {
						mainview.pPriceField_4.setBackground(null);
						mainview.pPriceField_4.setOpaque(false);
					} else if (db.milkV.get(i).getNo() == 5) {
						mainview.pPriceField_5.setBackground(null);
						mainview.pPriceField_5.setOpaque(false);
					} else if (db.milkV.get(i).getNo() == 6) {
						mainview.pPriceField_6.setBackground(null);
						mainview.pPriceField_6.setOpaque(false);
					} else if (db.milkV.get(i).getNo() == 7) {
						mainview.pPriceField_7.setBackground(null);
						mainview.pPriceField_7.setOpaque(false);
					} else if (db.milkV.get(i).getNo() == 8) {
						mainview.pPriceField_8.setBackground(null);
						mainview.pPriceField_8.setOpaque(false);
					} else if (db.milkV.get(i).getNo() == 9) {
						mainview.pPriceField_9.setBackground(null);
						mainview.pPriceField_9.setOpaque(false);
					}
				}
			}
		}
	
	public ImageIcon milkIcon(int i){//�̹��� ��ȯ
		  ImageIcon milkI;
		  switch(i) {
		   case 1 :milkI = new ImageIcon("src/image/milk/�������.png");
		     return milkI ;
		   case 2 : milkI = new ImageIcon("src/image/milk/���ڿ���.png");
		     return milkI ;
		   case 3 : milkI = new ImageIcon("src/image/milk/�޷п���.png");
		     return milkI ;
		   case 4 : milkI = new ImageIcon("src/image/milk/�����.png");
		     return milkI ;
		   case 5 : milkI = new ImageIcon("src/image/milk/�ֿ���.png");
		     return milkI ;
		   case 6 : milkI = new ImageIcon("src/image/milk/Ŀ�ǿ���.png");
		     return milkI ;
		   case 7 : milkI = new ImageIcon("src/image/milk/�ٳ�������.png");
		     return milkI ;
		   case 8 : milkI = new ImageIcon("src/image/milk/�������.png");
		     return milkI ;
		   case 9 : milkI = new ImageIcon("src/image/milk/�����ƿ���.png");
		     return milkI ;
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