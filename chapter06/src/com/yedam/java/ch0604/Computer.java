package com.yedam.java.ch0604;

public class Computer { // 배열 양식 맞춰서 값을 줘야함
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
		
	}
	
	
	int sum2(int ... values) { // 내부에서 배열처리 되어있기떄문에 그냥 값만줘도됨
		int sum = 0;
		for(int i=0; i < values.length; i++ ) {
			sum += values[i];
		}
		return sum;
				
	}
	
}
