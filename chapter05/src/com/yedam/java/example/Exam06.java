package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		int[] scores = null;
		int studentNum = 0;
		
		while(run) {
			System.out.println("============================================");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("============================================");
			System.out.println("선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) { //스위치문 쓰려면 불린타입써야함
			case 1:
				System.out.println("학생수 > ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4:
				int sum = 0;
				int max = scores[0];
				for(int i = 0; i<scores.length;i++) {
					//최고점수
					if(max < scores[i]) {
						if(max < scores[i]) {
							sum += scores[i];
						}
							
					}
					//총합
					
				}
			System.out.println("최고점수 : " +max);
			System.out.println("평균 : " + ((double)sum / scores.length));
			
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
