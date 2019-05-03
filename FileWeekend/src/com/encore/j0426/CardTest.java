package com.encore.j0426;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CardTest implements ActionListener {
	Frame f;
	CardLayout cLayout;

	Panel card1, card2, card3;
	Panel redp, bluep, yellowp;

	Button bt1, bt2, bt3;

	public CardTest() {

		f = new Frame("카드 레이아웃");
		redp = new Panel();
		redp.setBackground(Color.RED);
		bluep = new Panel();
		bluep.setBackground(Color.blue);
		yellowp = new Panel();
		yellowp.setBackground(Color.YELLOW);

		bt1 = new Button("다음");
		bt2 = new Button("다음");
		bt3 = new Button("다음");

		card1 = new Panel();
		card1.setLayout(new BorderLayout(0, 10));
		card1.add("Center", redp);
		card1.add("South", bt1);

		card2 = new Panel();
		card2.setLayout(new BorderLayout(0, 10));
		card2.add("Center", bluep);
		card2.add("South", bt2);

		card3 = new Panel();
		card3.setLayout(new BorderLayout(0, 10));
		card3.add("Center", yellowp);
		card3.add("South", bt3);

		cLayout = new CardLayout();
		f.setLayout(cLayout);
		f.add(card1, "a1");
		f.add(card2, "a2");
		f.add(card3, "a3");
		// f.add(붙일 컴포넌트, 별명) <-- alias별명

		cLayout.show(f, "a3");

		f.setSize(250, 300);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * cLayout.show(f, "a2"); cLayout.show(f, "a3"); cLayout.show(f, "a1");
		 */
		// 
		System.out.println(e.getSource());
		Object ob = e.getSource();

		if (bt1 == ob) {
			cLayout.show(f, "a2");
			System.out.println("블루블루");
		} else if (bt2 == ob) {
			cLayout.show(f, "a3");
			System.out.println("노랑노랑");
		} else {
			cLayout.show(f, "a1");
			System.out.println("레드레드");
		}
	}

	public static void main(String[] args) {
		new CardTest();

	}

}
