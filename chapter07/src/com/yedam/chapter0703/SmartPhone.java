package com.yedam.chapter0703;

//실체 클래스
public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSerch() {
		System.out.println("serching internet...");
	}
}
