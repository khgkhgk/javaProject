package com.yedam.java.check;

public class RightTreePrint {

	public static void main(String[] args) {
		
		
//		   * -> 2번째줄, 공백3개, 별1개 =>총 문자 4개
//		  ** -> 2번째줄, 공백2개, 별2개 =>총 문자 4개
//		 *** -> 3번째줄, 공백1개, 별3개 =>총 문자 4개
//		**** -> 4번째줄, 공백0개, 별4개 =>총 문자 4개
		
		for(int i = 1; i <=4; i++) { // line
			for(int j = 1; j <=4; j++) { // 문자 수
				if( j <= (4-i)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
