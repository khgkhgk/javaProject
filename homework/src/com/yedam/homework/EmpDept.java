package com.yedam.homework;

public class EmpDept extends Employee {

	// 필드
	public String dept;

	// 생성자
	public EmpDept(String name, int pay, String dept) {
		super(name, pay);
		this.dept = dept;
	}
	//메소드
	public void getInformation() {
		System.out.println("이름 : " + name + "연봉 : " + pay + "Dept" + dept);
	}

	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}

	
	
	
	//게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
