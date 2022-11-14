package com.yedam.chapter11;

public class SystemExample {
	public static void main(String[] args) {
		// System.exit()
//		for(int i = 0; i<10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				System.exit(0);
//			}
//		}
//		System.out.println("프로그램 종료");//안찍히는게 정상. if문에서 시스템 끝난거임

		// 현재시각 읽기

		long time1 = System.nanoTime();

		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += 1;
		}

		long time2 = System.nanoTime();

		System.out.println("sum : " + sum);
		System.out.println("계산 시간 : " + (time2 - time1) + "나노초가 소요됨.");

		long time3 = System.currentTimeMillis();// 중복되지않는 데이터 표현할때 사용하면 좋음
		System.out.println(time3);
	}
}
