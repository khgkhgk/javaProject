package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte 타입
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
		//byte var5 = 128;
		System.out.println(var1);
		//System.out.println(var5);
		
		long var6 = 100000000000L;
		short var7 = 1;
	

		char v1 = 65;
		char v2 = '가';
		int v3 = v1;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		// String
		String name = "홍길동"; //''문자리터럴 "문자열 리터럴		
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3));
		
		// char VS String
		char v4 = 'A'; //작은따옴표, 유니코드 안의 숫자 문자, 공백X
		String v5 = "누군가 \"안녕\"하면서 인사했다."; //큰따옴표 말고 다 받을 수 있음, ""안에서 ""한번더 사용할 시 \사용해주기.
		
		//float
		float num1 = 3.14f;
		double num2 = 3.14;
		
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789;
		
		System.out.println(varF);
		System.out.println(varD);
		
		// boolean
		boolean stop = ( 1 > 2 );//( 1>2는 틀린값 즉.false)
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
			
		}
	}
}
				
				
				
				
				
		
