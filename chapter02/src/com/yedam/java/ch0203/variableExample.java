package com.yedam.java.ch0203;

public class variableExample {
	public static void main(String[] args) {
		/* 자동 타입 변환 */
		byte byteValue = 10;
		//char charValue = byteValue;
		int intValue = byteValue;
	System.out.println("intValue : "+ intValue);
	
	char charValue = '가';
	intValue = charValue;
	System.out.println("intValue : " + intValue);
	
	intValue = 50;
	long longValue = intValue;
	System.out.println("longValue" + longValue);
	
	longValue = 100;
	float floatValue = longValue;
	System.out.println("floatValue : " + floatValue);
	
	floatValue = 100.5f;
	double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
	
	// 강제 타입 변환
	intValue = 44032;
	charValue = (char)intValue;
	System.out.println(charValue);
	
	longValue = 500;
	longValue = (int)longValue;
	System.out.println(longValue);
	
	doubleValue = 3.14;//손실일어남
	intValue = (int)doubleValue;
	System.out.println(intValue);
	
	// 정수 타입 연산
	byte result = 10 + 20;
	
	byte x = 10;
	byte y = 20;
	int result2 = x + y;
	byte result3 = (byte)( x + y );
	System.out.println(result2 + ", " + result3);
	
	char charValue1 = 'A'; // 65
	char charValue2 = 1;
	int intResult = charValue1 + charValue2;
	System.out.println( "유니코드 : " + intResult);
	System.out.println("출력문자 : " + (char)intResult); //65+1=66

	byte value1 = 10;
	int value2 = 100;
	long value3 = 1000L;
	long longResult = value1 + value2 + value3;
	
	int intV1 = 10;
	double doubleV1 = 5.5;
	double plusV1 = intV1 + doubleV1; //double이 있겠다싶으면 걍 묻고 더블로ㄱ

	int intVar1 = 10;
	//int resultVar1 = intVar1/4; //결과:2
	double resultVar1 = intVar1/4.0; //10.0 / 4.0 -> 2.5 둘중 하나라도 실수상태면 2.5됨
	System.out.println("10/4 결과 : " + resultVar1);
	
	int x1 = 1;
	int y1 = 2;
	double result1 = (double)x1/y1; //계산식이후 값을 변경해도 소수점출력 가능
	System.out.println("1/2 결과 : " + result1);
	
	// 문자열 결합
	int value = 10 + 2 + 8;
	System.out.println(value);
	
	String str1 = 10 + 2 + "8";
	System.out.println(str1);
	
	String str2 = 10 + "2" + 8;
	System.out.println(str2);
	
	String str3 = "10" + 2 + 8;
	System.out.println(str3);
	
	String str4 = "10" + (2 + 8);
	System.out.println(str4);
	
	
	// 기본타입 <-> String
	int aVar = Integer.parseInt("10");
	double bVar = Double.parseDouble("101.0");
	boolean cVar = Boolean.parseBoolean("true");

	System.out.println("a : " + aVar);
	System.out.println("a : " + bVar);
	System.out.println("a : " + cVar);
	
	String strV1 = String.valueOf(10);
	String strV2 = String.valueOf(3.14);
	String strV3 = String.valueOf(true);
	
	System.out.println(strV1);
	System.out.println(strV2);
	System.out.println(strV3);
	
	String strV4 = ""+ 105.23;//공백을 더해줌으로써 값에 변화없이 타입만 문자열로 바꿔줌
	System.out.println(strV4);
	
	
	
	
	
	
	
	
	
	
	}

}
