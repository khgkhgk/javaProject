package com.yedam.exam;

public class Goods {
	// 필드
	private String pName; //왜 프리베이트지?
	private int stocks;
	private int price;
	
	// 모시꺵 //게터세터 계속 이상한값도 같이나와서 어려움
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// 메소드
	public void getInfo() {
		System.out.println("상품이름 : " + pName);
		System.out.println("상품가격 : " + price);
		System.out.println("상품재고 : " + stocks);
	}
}
