package com.yedam.java.ch0601;

public class ConstantNo {

	// 필드
	static final double PI = 3.14;
	static final int EARTH_ROUND = 46250;
	static final int LIGHT_SPEED = 127000;

	String words = "This is Java";
	char word = 'Y';
	// 생성자

	// 메소드
	// static 필드에 사용 범위(scope)
	static void getCircle(int radius) {
		// pi * r * r
		System.out.println("원 넓이 : " + (PI * radius * radius));
	}
	
	//메소드에 static 필드 호출
	public void allData() {
		double result = PI * EARTH_ROUND * LIGHT_SPEED;
		System.out.println(result);
		getCircle(1);
	}
	
	//static 메소드에 일반 필드, 메소드 사용
	public static void words() {
//		String getWord = words + String.valueOf(word);
//word을 static안쪽에서 쓰려면 스태틱묶어주거나 해야함
	
	
	
	}
	
	
	
	
}
