package com.yedam.homework;

public class Employee {

	// 필드
	public String name;
	public int pay;

	// 생성자
	public Employee(String name, int pay) {
		this.name = name;
		this.pay = pay;
	}

	// 메소드
	public void getInformation() {
		System.out.println("이름 : " + name + "연봉 : " + pay);
	}

	public void print() {
		System.out.println("수퍼클래스");
	}


}
