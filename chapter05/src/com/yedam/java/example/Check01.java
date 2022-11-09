package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		// 문제 1 ) 주어진 배열의 총합과 평균을 구하세요.
		int[] array = {10, 53, 26, 85, 75};
		
		int sum = 0;
		
		for(int i = 0; i<(array.length);i++) { //for(int i = 0; i<=(array.length-1);)
			sum += array[i];
		}
		System.out.println("총합 : " + sum);
		double avg = sum / (double)array.length; //소수점 표현위해 정수/정수인 경우 둘중 하나는 정수/더블로 바꿔주기
		System.out.printf("평균 : %.2f\n", avg);
		
		// 문제 2 ) 배열의 최대값과 최소값을 구하세요.
		
		
		int max = array[array.length-1];
		int min = array[0];
		for(int i = 0; i<(array.length);i++) {
			//최대값
			if(max < array[i]) {
				max = array[i];
			}
			//최소값
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.printf("최대 : %d\n", max);
		System.out.printf("최소 : %d\n", min);
		// 문제 3 ) 문제 2에서 구한 최대값과 최소값의 각각 인덱스가 뭔지 구하세요.
		
		
		maxIndex = ;
		maxIndex = ;
		for(int i = 0; i<(array.length);i++) {
			//최대값
			if(max == array[i]) {
				maxIndex = i;
				
			}
			//최소값
			if(min == array[i]) {
				minIndex = i;
				
			}
		}
		System.out.printf("최대값 : " + max + "는"
				+ (maxIndex +1) + "번째입니다.");
		System.out.printf("최소값 : " + min + "는"
				+ (minIndex +1) + "번째입니다.");
			
		
		
		
		
		
		
		
		
		
		
		
	}
}