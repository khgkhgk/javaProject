package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		// 배열을 선언 -> 모든 타입을 값으로 가질 수 있음(배열의 배열조차)
		int[] intAry = null;//객체이기 때문에 null값 가질 수 있음
		//System.out.println("intAry[0] : " + intAry[0]);
		
		//값을 초기화하면서 배열을 생성
		int[] scores = { 83, 90, 87 };//scores는 값이있는 주소만 가지고있음(ex. 주소1000)
									// 1000번째 영역안의 값 83,90,87(힙영역)
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
//		sum += scores[0];
//		sum += scores[1]; 풀어쓰면 이래됨 개귀찮음.
//		sum += scores[2];
				
		
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		// 주의사항
		int[] scoreList = null;//변수 선언하면서 값선언하는건 되는데 선언하고 후에 하는건 안됨 ex)scoreList = {83, 90, 87};
		scoreList = new int[]{83, 90, 87};//선언하고 이후에 값줄려면 new연산자 써줘야함. 크기는 주면안됨.
		
		sum = 0;
		for(int i=0; i<3; i++) {
			sum = sum + scoreList[i];
		}
		System.out.println("총합");
		
		sum = add(new int[] {83, 90, 87});
		
		// new 연산자로 배열 생성
		int[] array = new int[3]; //int가 크기3인 배열 생성함
		for(int i=0; i<3 ; i++) {
			System.out.println("array["+i+"] : " +array[i]);
		}
		
		String[] strAry = new String[4];
		for(int i=0; i<strAry. length; i++) {
			strAry[i] = String.vaLueOf(i);
		}
	
		for(int i=0; i<strAry.length; i++) {
			System.out.println("strAry[i++]") :;
		}
	
	}

	private static int add(int[] is) {
		// TODO Auto-generated method stub
		return 0;
	}
}
