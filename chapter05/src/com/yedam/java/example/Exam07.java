package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		// 로또 번호를 예측하는 프로그램 - 6개
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] numList = null;
		int count = 0;

		while (run) {
			System.out.println("======================================================");
			System.out.println("1.새로고침 | 2.번호예측 | 3.번호삭제 | 4.번호출력 | 5.분석 | 6.종료");
			System.out.println("======================================================");
			System.out.println("선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) { // 로또번호를 담을 수 있는 배열 초기화
				numList = new int[6];
			} else if (selectNo == 2) { // 1~45 중 랜덤한 값을 가져옴
				if (count < numList.length) {
					int num = (int) (Math.random() * 45) + 1;
					numList[count++] = num;
					System.out.println("현재 가져온 수의 갯수 : " + count);
				} else {
					System.out.println("더이상 숫자를 가져올 수 없습니다.");
				}
			} else if (selectNo == 3) { // 기존 값 중 가장 최근 값을 삭제
				// count = 6 -> index = count -1
				numList[--count] = 0;
				System.out.println("현재 가져온 수의 갯수 : " + count);
			} else if (selectNo == 4) { // 배열의 값 전부 출력
				System.out.println("현재 가지고 있는 수의 갯수 : " + count);
				for (int i = 0; i < count; i++) {
					System.out.println(numList[i] + " ");
				}
			} else if (selectNo == 5) { // 중복유무와 중복된 값이 몇번 중복되었는지
				int[] list = new int[45];
				//개표부분
				for (int i = 0; i < count; i++) {
					int index = numList[i] - 1;
					list[index]++;
				}
				//개표상황을 정리해서 보여주는 부분
				boolean isChecked = false;
				for (int i = 0; i < list.length; i++) {
					if (list[i] <= 1)
						continue;
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n", (i + 1), list[i]);
					isChecked = true;
				}
				if (!isChecked) {
					System.out.println("중복 값이 존재하지 않습니다.");
				}
			} else if (selectNo == 6) {

			}

		}
	}
}
