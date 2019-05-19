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
		mainview = new MMainView(); //메인뷰 불러오기
		admin = new MAdmin(); //관리자뷰 불러오기
		wallet = new WalletView(); //동전투입 불러오기

		db = new DatabaseIO(); //db불러오기
		db.loadMoney(); 
		db.loadData();
		db.loadSum();
		
		updateMainView(); //메인뷰 가격 지정
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
		});// 관리자뷰 종료시 데이터 저장 후 main창으로 돌아가기
		admin.returnBtn.addActionListener(this);
		admin.saveFileBtn.addActionListener(this);

		// Wallet뷰
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
		});// 메인뷰 종료시 데이터 저장 후 종료
		mainview.moneyInputBtn.addActionListener(this);
		mainview.adminBtn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int cnt100 = 0;
		int cnt500 = 0;
		int cnt1000 = 0;
		Object ob = e.getSource();

		if (ob == wallet.input100Btn) { //동전 클릭했을 때
			cnt100++; //클릭 횟수
			moneyModel.insert(cnt100, cnt500, cnt1000);
			mainview.moneyDisplayArea.setText(db.balance + ""); //잔액표시

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
				//빈즈한줄 통째로 sellM에 저장하기
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(mainview, "제품을 선택해주세요");
				return;
			}
			if (milkModel.checkStock(sellM)) {
				if (moneyModel.comparePrice(sellM)) {
					milkModel.sellMilk(sellM);//재고는 감소, 판매량은 증가
					moneyModel.minusBalance(sellM); //잔액 감소
					mainview.moneyDisplayArea.setText(db.balance + ""); //잔액 표시해주기
					possibleMilk(); //노랑불 다시 호출
					//updateView(); 
					//System.out.println("ㅇㅋ"); 
					
					//반환구에 제품표시해주기 
					mainview.productOutPanel.setSize(mainview.productOutPanel.getWidth()+107, 170); 
					// 이미지가 추가될 칸 미리 생성해두기
					
				     JButton milkPrintBtn = new JButton("");//버튼만들기
				     milkPrintBtn.setIcon(milkIcon(Integer.parseInt(mainview.keyDisplayArea.getText())));//그림넣기
				     mainview.keyDisplayArea.setText("");//초기화
				     milkPrintBtn.setBorderPainted(false);//테두리없애기
				     milkPrintBtn.setContentAreaFilled(false);//그라데이션없애기
				     milkPrintBtn.setFocusPainted(false);//포커스시 테두리 없애기
				     milkPrintBtn.setOpaque(false);//투명
				     mainview.productOutPanel.add(milkPrintBtn);//panel에 버튼 넣기
				     
				     milkPrintBtn.addActionListener(new ActionListener() {//우유 중에 하나만 누르면
				     	@Override
				     	public void actionPerformed(ActionEvent e) {
				      	mainview.productOutPanel.removeAll();//제품사진 다 없애기
				      	mainview.productOutPanel.setVisible(false);
				      	mainview.productOutPanel.setVisible(true);	//다 없앤 panel 새로고침
				     	}
				    	});
				     mainview.productOutPanel.setVisible(true);//제품 추가된 것 panel 새로고침
				     mainview.scrollP.getHorizontalScrollBar().setMaximum(mainview.scrollP.getHorizontalScrollBar().getMaximum()+107); 
				     // 스크롤 max값 늘리기
				     mainview.scrollP.getHorizontalScrollBar().setValue(mainview.scrollP.getHorizontalScrollBar().getMaximum());  
				     // 스크롤 max값으로 옮기기

				} else
					//System.out.println("너돈ㄴㄴ");
					JOptionPane.showMessageDialog(mainview, "잔액이 부족합니다");
			} 

		} else if (ob == mainview.returnBtn) {
			mainview.moneyDisplayArea.setText("0"); //잔액창 0으로 초기화
			mainview.keyDisplayArea.setText(""); //제품선택창 초기화
			possibleMilk(); //노랑불 돌리기
			moneyModel.returnBalance(db.balance); //잔액반환 계산하기
			JOptionPane.showMessageDialog(mainview, "잔돈은" + db.balance + "\n" +"1000원 : " +moneyModel.don1000 + "개, 500원 : " + moneyModel.don500 + "개, 100원 : " + moneyModel.don100 + "개");
			db.saveMoney(); //동전개수 저장
			db.balance = 0; //데이터에 저장된 잔액 0으로 초기화
			
		} else if (ob == mainview.moneyInputBtn) { //동전투입 클릭
			wallet.setVisible(true); //동전투입창 뜨기
			
		} else if (ob == mainview.adminBtn) { //관리자 창으로 이동
			wallet.setVisible(false); 
			JPasswordField pwd = new JPasswordField(10); // 비밀번호 입력시 ***로 나오게 해줌 
			int keyPwd = JOptionPane.showConfirmDialog(admin, pwd, "비밀번호를 입력하세요", JOptionPane.OK_CANCEL_OPTION);
			if (keyPwd == 0 && new String(pwd.getPassword()).equals("1234")) { //확인버튼 0반환 & 비밀번호일치
				admin.setVisible(true);
				mainview.setVisible(false);
				updateView(); //관리자뷰에 정보 표시
				salseByMilk(); //제품별 판매량 표시
				moneyModel.sumSales(); //금일 판매량 계산
				admin.todaySaleDisplayArea.setText(moneyModel.todaySum+""); //금일 판매량 표시
			    admin.tSaleDisplayArea.setText((db.sum+moneyModel.todaySum)+""); //총 판매량 표시
			} else if (keyPwd == 0 && !new String(pwd.getPassword()).equals("1234")) {
				JOptionPane.showMessageDialog(admin, "비밀번호가 틀렸습니다"); }
	
		//=================<관리자뷰>========================
			
		} else if (ob == admin.changeSave) { //변경사항 저장하기
			updateP();
			updateMainView();
			db.saveData();
			db.saveMoney();
		}
		
		else if (ob == admin.returnBtn) { //메인뷰로 돌아가기
			int answer = JOptionPane.showConfirmDialog(admin, "변경사항을 저장하셨습니까?", "변경사항 저장 확인", 1);
			if (answer == 0) {
				admin.setVisible(false);
				mainview.setVisible(true);
			}
			
		} else if (ob == admin.saveFileBtn) {//장부기재 버튼=정산
			   File fsales = new File("sales"); //폴더 만들기
			   int answer = JOptionPane.showConfirmDialog(admin, "정산 하시겠습니까?", "정산 확인", 1);
			  	if (answer == 0) {
			  	 Calendar cal = Calendar.getInstance();
			  	 
			   	int year = cal.get(Calendar.YEAR);
			   	int month = cal.get(Calendar.MONTH)+1;
			   	int date = cal.get(Calendar.DATE);
			   	
			   	String monthstr; //달을 자리수 맞춰서 수정
			   	if(month<10) {
			    	monthstr = ("0"+month);
			   	}else{monthstr = (month+"");}
			   	
			  	 File f = new File("sales/"+(year+"_"+monthstr+"_"+date+"판매기록.txt"));//파일저장 이름 설정
			  	 
			  	 	if(f.exists()) { //파일이 존재한다면
			  	 	answer = JOptionPane.showConfirmDialog(admin,"오늘 장부가 있습니다. 추가로 기재하십니까?", "장부 기재 확인", 1);
				    
				  	 	if (answer != 0) { //파일 존재 & 추가 기재를 안함
				  	 		return;
				  	 	} 
				  	//파일 존재 & 추가 기재를 한다면
				    db.saveSum(); //총 판매량 저장
				    db.salesStament(); //판매 기록 저장 & 우유별 금일 판매량을 0으로 초기화
				    salseByMilk(); //우유별 금일 판매량 관리자뷰에 표시
				    moneyModel.todaySum=0; //todaySum 금일 매출을 0으로 초기화 
				    admin.todaySaleDisplayArea.setText(moneyModel.todaySum+""); //금일 판매 표시
				    return;
				    }
			  	db.saveSum();//파일이 존재하지 않는다면 바로 저장
			    db.salesStament();
			    salseByMilk();
			    moneyModel.todaySum=0;//0514숙제
			    admin.todaySaleDisplayArea.setText(moneyModel.todaySum+""); 	//0514숙제
			  	}
			  	
				}

		// =================================================

	}//이벤트 끝

	public void updateView() {//관리자뷰에 정보 표시
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

	public void updateMainView() {//메인뷰에 가격 표시
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
	//JOptionPane.showMessageDialog(admin, "저장 되었습니다.");
	public void updateP() {//관리자뷰 제품 가격 & 재고 & 동전수량 수정 내용 db에 저장
		if (!admin.pPriceField_1.getText().matches("[0-9]+")||
			!admin.pPriceField_2.getText().matches("[0-9]+")|| 
			!admin.pPriceField_3.getText().matches("[0-9]+")||
			!admin.pPriceField_4.getText().matches("[0-9]+")||
			!admin.pPriceField_5.getText().matches("[0-9]+")||
			!admin.pPriceField_6.getText().matches("[0-9]+")||
			!admin.pPriceField_7.getText().matches("[0-9]+")||
			!admin.pPriceField_8.getText().matches("[0-9]+")||
			!admin.pPriceField_9.getText().matches("[0-9]+")){
			JOptionPane.showMessageDialog(admin, "제품 가격에 숫자만 입력하세요");
		} else {//숫자면 저장
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
			JOptionPane.showMessageDialog(admin, "제품 재고에 두 자리 이하의 숫자만 입력하세요");
		} else {//재고 두자리 이하 숫자면 저장
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
				   JOptionPane.showMessageDialog(admin, "동전 재고에 숫자만 입력하세요");
		}
		else {
			db.moneyV.get(0).setMoney100(Integer.parseInt(admin.coin100Field.getText()));
			db.moneyV.get(0).setMoney500(Integer.parseInt(admin.coin500Field.getText()));
		}
				  //db.saveData(); //data.txt저장
				  //db.saveMoney(); //money.txt저장
	}

	
		public void run() {// 재고&잔돈유무 확인 후 판매중or판매중지 표시 메소드
			while (true) {
				if (milkModel.checkTotalStock() || moneyModel.checkTotalBalance()) {
					mainview.saleOkLabel.setVisible(false);
					mainview.saleNoLabel.setVisible(true);//판매중지 표시
					mainview.keypadBtn_OK.setEnabled(false);//확인버튼 비활성화
				} else {
					mainview.saleOkLabel.setVisible(true);
					mainview.saleNoLabel.setVisible(false);
				}
			}
		}

		// 개별 재고 없을 경우 (판매중지,빨간색 표시) 
		// 재고가 있을 경우 & 잔액이 구입 가능할 경우 (노랑표시) 
		// 재고가 있을 경우 & 잔액이 부족할 경우 (null)
		class checkStockThread extends Thread {
			public void run() {
				while (true) {
					for (int i = 0; i < db.milkV.size(); i++) {
						if (db.milkV.get(i).getStock() == 0) { 
							// 재고가 없을 때 (빨간색, 재고없음)
							switch (db.milkV.get(i).getNo()) {
							case 1:
								mainview.pPriceField_1.setText("재고없음");
								mainview.pPriceField_1.setFont(new Font("고딕", Font.BOLD,15));
								mainview.pPriceField_1.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_1.setForeground(Color.white);
								mainview.pPriceField_1.setBackground(Color.red);
								mainview.pPriceField_1.setOpaque(true);
								break;
							case 2:
								mainview.pPriceField_2.setText("재고없음");
								mainview.pPriceField_2.setFont(new Font("고딕", Font.BOLD,15));
								mainview.pPriceField_2.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_2.setForeground(Color.white);
								mainview.pPriceField_2.setBackground(Color.red);
								mainview.pPriceField_2.setOpaque(true);
								break;
							case 3:
								mainview.pPriceField_3.setText("재고없음");
								mainview.pPriceField_3.setFont(new Font("고딕", Font.BOLD,15));
								mainview.pPriceField_3.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_3.setForeground(Color.white);
								mainview.pPriceField_3.setBackground(Color.red);
								mainview.pPriceField_3.setOpaque(true);
								break;
							case 4:
								mainview.pPriceField_4.setText("재고없음");
								mainview.pPriceField_4.setFont(new Font("고딕", Font.BOLD,15));
								mainview.pPriceField_4.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_4.setForeground(Color.white);
								mainview.pPriceField_4.setBackground(Color.red);
								mainview.pPriceField_4.setOpaque(true);
								break;
							case 5:
								mainview.pPriceField_5.setText("재고없음");
								mainview.pPriceField_5.setFont(new Font("고딕", Font.BOLD,15));
								mainview.pPriceField_5.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_5.setForeground(Color.white);
								mainview.pPriceField_5.setBackground(Color.red);
								mainview.pPriceField_5.setOpaque(true);
								break;
							case 6:
								mainview.pPriceField_6.setText("재고없음");
								mainview.pPriceField_6.setFont(new Font("고딕", Font.BOLD,15));
								mainview.pPriceField_6.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_6.setForeground(Color.white);
								mainview.pPriceField_6.setBackground(Color.red);
								mainview.pPriceField_6.setOpaque(true);
								break;
							case 7:
								mainview.pPriceField_7.setText("재고없음");
								mainview.pPriceField_7.setFont(new Font("고딕", Font.BOLD,15));
								mainview.pPriceField_7.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_7.setForeground(Color.white);
								mainview.pPriceField_7.setBackground(Color.red);
								mainview.pPriceField_7.setOpaque(true);
								break;
							case 8:
								mainview.pPriceField_8.setText("재고없음");
								mainview.pPriceField_8.setFont(new Font("고딕", Font.BOLD,15));
								mainview.pPriceField_8.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_8.setForeground(Color.white);
								mainview.pPriceField_8.setBackground(Color.red);
								mainview.pPriceField_8.setOpaque(true);
								break;
							case 9:
								mainview.pPriceField_9.setText("재고없음");
								mainview.pPriceField_9.setFont(new Font("고딕", Font.BOLD,15));
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
								mainview.keypadBtn_OK.setEnabled(false);//노란불이 하나도 없을 때 확인버튼 비활성화
							}
						} else if(db.milkV.get(i).getStock()>0 && !(db.milkV.get(i).isOnSale())) { 
							// 재고가 있고, 잔액이 부족할 때 (null)
							switch (db.milkV.get(i).getNo()) {
							case 1:
								mainview.pPriceField_1.setOpaque(false);
								mainview.pPriceField_1.setBackground(null);
								mainview.pPriceField_1.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_1.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_1.setForeground(Color.black);
								break;
							case 2:
								mainview.pPriceField_2.setOpaque(false);
								mainview.pPriceField_2.setBackground(null);
								mainview.pPriceField_2.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_2.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_2.setForeground(Color.black);
								break;
							case 3:
								mainview.pPriceField_3.setOpaque(false);
								mainview.pPriceField_3.setBackground(null);
								mainview.pPriceField_3.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_3.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_3.setForeground(Color.black);
								
								break;
							case 4:
								mainview.pPriceField_4.setOpaque(false);
								mainview.pPriceField_4.setBackground(null);
								mainview.pPriceField_4.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_4.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_4.setForeground(Color.black);
								break;
							case 5:
								mainview.pPriceField_5.setOpaque(false);
								mainview.pPriceField_5.setBackground(null);
								mainview.pPriceField_5.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_5.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_5.setForeground(Color.black);
								break;
							case 6:
								mainview.pPriceField_6.setOpaque(false);
								mainview.pPriceField_6.setBackground(null);
								mainview.pPriceField_6.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_6.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_6.setForeground(Color.black);
								break;
							case 7:
								mainview.pPriceField_7.setOpaque(false);
								mainview.pPriceField_7.setBackground(null);
								mainview.pPriceField_7.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_7.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_7.setForeground(Color.black);
								break;
							case 8:
								mainview.pPriceField_8.setOpaque(false);
								mainview.pPriceField_8.setBackground(null);
								mainview.pPriceField_8.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_8.setHorizontalAlignment(JTextField.CENTER);
								mainview.pPriceField_8.setForeground(Color.black);
								break;
							case 9:
								mainview.pPriceField_9.setOpaque(false);
								mainview.pPriceField_9.setBackground(null);
								mainview.pPriceField_9.setFont(new Font("고딕", Font.BOLD,20));
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
								mainview.keypadBtn_OK.setEnabled(false);//노란색이 하나도 없으면 확인버튼 비활성화
							}
						} // else
						else if (db.milkV.get(i).getStock() > 0 && (db.milkV.get(i).isOnSale())) {
							//재고 존재 & 잔액이 충분할 때
							if (db.milkV.get(i).getNo() == 1) { // 1 2 3
								mainview.pPriceField_1.setOpaque(true);
								mainview.pPriceField_1.setBackground(Color.YELLOW);
								mainview.pPriceField_1.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_1.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 2) {
								mainview.pPriceField_2.setOpaque(true);
								mainview.pPriceField_2.setBackground(Color.YELLOW);
								mainview.pPriceField_2.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_2.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 3) {
								mainview.pPriceField_3.setOpaque(true);
								mainview.pPriceField_3.setBackground(Color.YELLOW);
								mainview.pPriceField_3.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_3.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 4) {
								mainview.pPriceField_4.setOpaque(true);
								mainview.pPriceField_4.setBackground(Color.YELLOW);
								mainview.pPriceField_4.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_4.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 5) {
								mainview.pPriceField_5.setOpaque(true);
								mainview.pPriceField_5.setBackground(Color.YELLOW);
								mainview.pPriceField_5.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_5.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 6) {
								mainview.pPriceField_6.setOpaque(true);
								mainview.pPriceField_6.setBackground(Color.YELLOW);
								mainview.pPriceField_6.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_6.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 7) {
								mainview.pPriceField_7.setOpaque(true);
								mainview.pPriceField_7.setBackground(Color.YELLOW);
								mainview.pPriceField_7.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_7.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 8) {
								mainview.pPriceField_8.setOpaque(true);
								mainview.pPriceField_8.setBackground(Color.YELLOW);
								mainview.pPriceField_8.setFont(new Font("고딕", Font.BOLD,20));
								mainview.pPriceField_8.setHorizontalAlignment(JTextField.CENTER);

							} else if (db.milkV.get(i).getNo() == 9) {
								mainview.pPriceField_9.setOpaque(true);
								mainview.pPriceField_9.setBackground(Color.YELLOW);
								mainview.pPriceField_9.setFont(new Font("고딕", Font.BOLD,20));
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

				// 내가 가진 돈으로 살수있는 제품들 true
				if (db.milkV.get(i).isOnSale() && (db.milkV.get(i).getStock()>0)) {

						mainview.keypadBtn_OK.setEnabled(true); //확인버튼 활성화
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

				} else { // false면 효과없음
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
	
	public ImageIcon milkIcon(int i){//이미지 반환
		  ImageIcon milkI;
		  switch(i) {
		   case 1 :milkI = new ImageIcon("src/image/milk/딸기우유.png");
		     return milkI ;
		   case 2 : milkI = new ImageIcon("src/image/milk/초코우유.png");
		     return milkI ;
		   case 3 : milkI = new ImageIcon("src/image/milk/메론우유.png");
		     return milkI ;
		   case 4 : milkI = new ImageIcon("src/image/milk/흰우유.png");
		     return milkI ;
		   case 5 : milkI = new ImageIcon("src/image/milk/귤우유.png");
		     return milkI ;
		   case 6 : milkI = new ImageIcon("src/image/milk/커피우유.png");
		     return milkI ;
		   case 7 : milkI = new ImageIcon("src/image/milk/바나나우유.png");
		     return milkI ;
		   case 8 : milkI = new ImageIcon("src/image/milk/오디우유.png");
		     return milkI ;
		   case 9 : milkI = new ImageIcon("src/image/milk/복숭아우유.png");
		     return milkI ;
		  }
		  return null;
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