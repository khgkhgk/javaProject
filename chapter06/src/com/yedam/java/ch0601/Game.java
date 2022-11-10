package com.yedam.java.ch0601;

public class Game {
	
	//필드
	//객체로 만든다(인스턴스화로 된다.)
	//인스턴스 필드
	static String gameName = "마인크래프트";//static 어느곳에서나 사용할 수 있다. 프로그램 종료될때 메모리에서 종료가능하다. 많을 수록 메모리 사용률
	String server = "한국";
	String id;
	String passWd;
	
	//생성자
	//같은 이름이라도 여러개 가능, 타입,개수에따라
	public Game() {
		
	}
	public Game(String id) {
		this.id = id;
		this.passWd = passWd;
	}
	public Game(String id, String passwd) {
		
	}
	//메소드
	//dlsaptmem
	void getInfo() {
		System.out.println("GameName : " + gameName);
		System.out.println("id : " + id);
		System.out.println("passWd : " + passWd);
	}
	void getInfo();

}
