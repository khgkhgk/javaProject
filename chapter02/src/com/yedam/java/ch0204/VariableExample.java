package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		Scanner sc = new Scanner(System.in);

//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		System.out.printf("입력 : ", (x+y));
		 //콘솔창에서 입력
		
		/*
		String str = sc.next(); //next, nextInt는 엔터인식 불가능. 스페이스바 가능.
		int var = sc.nextInt();
		System.out.println("입력 : " + str + ", " + var);
		*/
		
		/*
		System.out.println("첫번째 : ");
		String x = sc.nextLine();
		System.out.println("두번째: ");
		String y = sc.nextLine();
		*/
		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		System.out.println("입력 : " + (x+y));
		
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");

		
		
}

}
