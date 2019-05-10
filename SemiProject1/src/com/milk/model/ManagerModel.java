package com.milk.model;

import java.util.Vector;

public class ManagerModel {

	public Vector<Milk> milkv;

	int sum;

	public Milk checkStock(int no) {
		for (int i = 0; i < milkv.size(); i++) {
			Milk oldm = milkv.get(i);
			if (oldm.getNo() == no) {
				return oldm;
			}
		}
		return null;
	}

	public void updateStock(Milk newm) {
		for (int i = 0; i < milkv.size(); i++) {
			Milk oldm = milkv.get(i);
			if (oldm.getNo() == newm.getNo()) {
				oldm.setStock(newm.getStock());
				break;
			}
		}
	}

	public Milk checkPrice(int no) {
		for (int i = 0; i < milkv.size(); i++) {
			int vno = milkv.get(i).getNo();
			if (no == vno) {
				Milk milk = milkv.get(i);
				return milk;
			}
		}
		return null;
	}

	public void updatePrice(Milk milk) {
		for (int i = 0; i < milkv.size(); i++) {
			Milk oldmilk = milkv.get(i);
			if (oldmilk.getNo() == milk.getNo()) {
				oldmilk.setPrice(milk.getPrice());
				break;
			}
		}
	}

	public void sumSales() {
		for (int i = 0; i < milkv.size(); i++) {
			sum += milkv.get(i).getPrice() * milkv.get(i).getSell();
		}
	}

	public void saveMilk() {
		
	}
}
