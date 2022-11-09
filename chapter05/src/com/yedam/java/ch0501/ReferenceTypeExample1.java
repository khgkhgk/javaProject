package com.yedam.java.ch0501;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		
		// null과 NullPointerException - 문법적으로는 문제 될 것이 없기에 빨간줄안뜸
		String str = null;//비어있는 값이지만 공간이 배정됨.
//		System.out.println("길이 : " + str.length());
		
		// String(문자열) 비교
		String strVar1 = "신미철";
		String strVar2 = "신미철";
		
		if (strVar1 == strVar2) {//같은 str사용
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2가 문자열이 같음");
		}else {
			System.out.println("strVar1과 strVar2는 문자열이 다름");
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		String strVar3 = new String("신미철");
		String strVar4 = new String("신미철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {//equals는 실제로 갖고있는값이 같냐?라 물어봄
			System.out.println("strVar3과 strVar는 문자열이 같음");
		}else {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
		}
		
		
		
		
	}
}
