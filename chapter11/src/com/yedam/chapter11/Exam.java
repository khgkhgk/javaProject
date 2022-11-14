package com.yedam.chapter11;

public class Exam {
	public static void main(String[] args) {

//문자열 뒤집기 - charAt

		String input1 = "abcdef";

		int n = input1.length();
		
		for (int i =n-1; i >= 0; i--) { //배열이라 생각하셈 0~n까지니까 잘해봐
			char output1 = input1.charAt(i);
			System.out.println(output1);
		}

//ASCII: 아스키코드

		String input2 = "1a2v3b";
		
//문자3개 숫자3개해봐
		
//		try {
//			 byte[] bytes = input2.getBytes("ASCII");
//			 System.out.println();
//		}

	}
}
