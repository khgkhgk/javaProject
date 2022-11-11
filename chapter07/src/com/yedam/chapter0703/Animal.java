package com.yedam.chapter0703;

public abstract class Animal {

	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다~");
	}

	// ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
	public abstract void sound();
	// ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆

}
//같은 메소드로 쓰기위해 추상메소드 사용