package com.yedam.exam;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] dice = null; // 주사위의 각 숫자별로 몇번씩 나왔는지를 기록 해 줄 "배열선언" (배열에는 인덱스, 인덱스별로 들어가는 값)
							// index -> 변동 無 ->주사위의 각 숫자와 연동
							// 각 index별로 가지는 값 -> 변동 有
							// -> 주사위의 각 숫자가 가지는 횟수
		int size = 0;
		while (run)
			System.out.println("===1.주사위 크기 2.주사귀 굴리기 3.결과 보기 4. 가장 많이 나온 수 5.종료===");
		System.out.println("메뉴 > ");
		int selectNo = Integer.parseInt(sc.nextLine());

		if (selectNo == 1) { // 주사위 크기 입력
			System.out.println("주사위 크기 > ");
			size = Integer.parseInt(sc.nextLine());
			if (size >= 5 && size <= 10) {
				dice = new int[size];
			} else {
				System.out.println("주사위 크기는 5~10사이만 가능합니다.");
				size = 0;
			}
		} else if (selectNo == 2) { // 주사위 굴리기 -> 주 기능
			int count = 0; //5나올때 까지 던진횟수 구하는 공식
			while(true) { // index = num - 1 -> index + 1 = num
				int num = (int)(Math.random()*size)+1;
				count++;
				dice[num-1] = dice[num-1] +1; //★이거 [배열]임 0부터시작함 주의!!!!!!☆
				if(num == 5) break; //5가 됐을때 무한루프 끝
			}
			System.out.println("5가 나올 떄 까지 주사위를" + count + "번 굴렸습니다.");
		} else if (selectNo == 3) { // 결과 보기
			for(int i=0; i<dice.length; i++) {
				System.out.println((i+1) + "은 " + dice[i] + "번 나왔습니다.");
			}
		} else if (selectNo == 4) { // 가장 많이 나온 수 (배열에서 최대값찾기)
			int maxCount = dice[0]; // 나온 횟수
			int maxIndex = 0; // 나온 수 ( "인덱스"의 크기 )
			for(int i=0; i<dice.length; i++) {
				if(maxCount < dice[i]) {
					maxCount = dice[i];
					maxIndex = i;//나온 횟수 같더라도 작은 수가 먼저 출력될 수 있음. 왜냐? 지보다 클떄만 돌거든 이거는
				}
			}
			System.out.println("가장 많이 나온 수 는" + (maxIndex+1) + "입니다.");	
		} else if (selectNo == 5) { // 종료
			run = false;
		} else { // 메뉴 (1~5) 외 입력 시
			System.out.println("메뉴를 잘못 입력하셨습니다.");
			System.out.println("확인 후 다시 입력해주세요.");
		}

		System.out.println("종료");

	}
}