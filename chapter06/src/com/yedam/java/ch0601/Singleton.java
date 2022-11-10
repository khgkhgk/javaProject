package com.yedam.java.ch0601;

public class Singleton {
	//전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩기법
	//즐겨 찾기라고 생각하면 됨. 자주사용하는거 많이만들면 메모리 잡아먹으니까
	
	private static Singleton singleton = new Singleton();
			
	private Singleton() {//객체 못만들게 함
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			return singleton = new Singleton();
		} else {
			return singleton;			
		}
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
