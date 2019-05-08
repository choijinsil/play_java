package model;

public class Milk {
	// beans
	private int no; // ��ǰ��ȣ
	private String name;// ��ǰ��
	private int price; // ����
	private int stock; // ���
	private int sell; // �Ǹŷ�
	private boolean onSale;
	
	
	
	public Milk(int no, String name, int price, int stock, int sell, boolean onSale) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.sell = sell;
		this.onSale = onSale;
	}

	public boolean isOnSale() {
		return onSale;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSell() {
		return sell;
	}

	public void setSell(int sell) {
		this.sell = sell;
	}
}
