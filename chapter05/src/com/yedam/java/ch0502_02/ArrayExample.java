package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // int[]의 배열 / 앞쪽 2개 뒤쪽 int배열크기

		// 첫번째 : 변수 사용으로 표기
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i];

			for (int j = 0; j < mathScore.length; j++) {
				System.out.print("\t mathScore[" + j + "] : ");
				System.out.println(mathScore[j]);
			}

		}
		System.out.println("========================================");
		// 두번째 : 변수 사용 안하고 표기
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");

			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.print("\t mathScores[" + i + "][" + j + "] : ");
				System.out.println(mathScores[i][j]);
			}

		}

		int[][] scoreList = { { 86, 65 }, { 58, 95, 73 } };

		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 ====");
			for (int j = 0; j < scoreList[i].length; j++) { // scoreList[i]값 0으로 바꾸면 0번째 라인기준으로 뒤쪽이 다 잘림.
				System.out.println(scoreList[i][j] + " ");
			}
			System.out.println();
		}

		int[][] englishScore = new int[2][];// 필수값은 앞쪽임(서랍장 사이즈는 2개, 칸막이는 사용자가알아서)
		englishScore[0] = new int[3];// 서랍장1 칸막이3
		englishScore[1] = new int[2];// 서랍장2 칸막이2

		for (int i = 0; i < englishScore.length; i++) {
			for (int j = 0; j < englishScore[i].length; j++) {
				System.out.println("englishScore[" + i + "][" + j + "] : " + englishScore[i][j]);
			}
		}

		// String
		String[] strArray = new String[3];
		strArray[0] = "Java";// Java라는 주소 101객체 생성
		strArray[1] = "Java";
		strArray[2] = new String("Java"); // new 로서 새로운객체 하나 만듦 주소는 501

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[1].equals(strArray[2])); // 순수하게 "Java"문자 비교하려면 .이퀄즈

		System.out.println();

		// for문으로 배열 복사
		int[] oldIntAry = { 1, 2, 3 };
		int[] newIntAry = new int[5];
		for (int i = 0; i < oldIntAry.length; i++) {
			newIntAry[i] = oldIntAry[i];
		}

		for (int i = 0; i < newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}

		// System.arraycopy()
		String[] oldStrAry = { "java", "array", "copy" };
		String[] newStrAry = new String[5];

		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);// 원본은 0번부터 복사, 새로운거에선 2번째부터 복사, 5번째거는 크기설정

		for (int i = 0; i < newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		
		
		// 향상된 for문
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		//int index = -1; //근데 이렇게 인덱스 설정해주면 인덱스값 생김ㅋㅋ근데 굳이? 89,92번째 줄
		for(int score : scores) { //앞에꺼 임시값으로 socres값이 모두 한번씩 담겼다 나옴(순환함) 그래서 인덱스가 없고 몇번째 값인지 알 수 없음
			sum += score;
		//	System.out.println("인덱스 : " + ++index);
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 총합 : " + avg);
		
		
		

	}
}
