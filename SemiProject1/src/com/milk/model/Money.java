package com.milk.model;

public class Money {
	// beans
	private Integer money100; // 100�� ����
	private Integer money500; // 500�� ����

	public Money() {

	}

	public Money(Integer money100, Integer money500) {
		this.money100 = money100;
		this.money500 = money500;
	}

	public Integer getMoney100() {
		return money100;
	}

	public void setMoney100(Integer money100) {
		this.money100 = money100;
	}

	public Integer getMoney500() {
		return money500;
	}

	public void setMoney500(Integer money500) {
		this.money500 = money500;
	}

}