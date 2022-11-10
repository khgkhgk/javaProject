package com.yedam.java.ch0601;

public class GameExample {
	public static void main(String[] args) {
		
		Game user1 = new Game();
		user1.id = "예담이";
		user1.passWd = "1234"; //.연산자로서 데이터 직접 넣어줌
		
		Game user2 = new Game("예담이2");
		user1.passWd = "4321";
		
		Game user3 = new Game("예담이3","4567");
		
		user1.getInfo();
		user2.getInfo();
		user3.getInfo();
		
		//static(정적, 고정) 필드 사용
		
		System.out.println("=====스태틱 필드 호출=====");
		
		System.out.println(Game.gameName);
		
		
	}
	
	
	
	
}
