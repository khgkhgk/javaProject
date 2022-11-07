package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		// 부호연산자
		 int a = -100;
		 int result1 = +a;
		 int result2 = -a;
		 System.out.println("result1 : " + result1);
		 System.out.println("result2 : " + result2);
		 
		 byte b = 100;
		 //byte result3 = (byte)-b;
		 int result3 = -b;
		 System.out.println("result3 : " + result3);
		 
		 // 증감 연산자
		 int x = 10;
		 int y = 10;
		 int z;
		 
		 System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		 x++;	// 11
		 ++x;	// 12
		 System.out.println("x = " + x);
		 
		 System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		 y--;
		 --y;
		 System.out.println("y = " + y);
		 
		 System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		 z = ++x;
		 System.out.println("z = " + z); // 13
		 System.out.println("x = " + x); // 13
		 
		 System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		 z = ++x + y++;
		 System.out.println("z = " + z); // 22
		 System.out.println("x = " + x); // 14
		 System.out.println("y = " + y); // 9
		 
//		 14+8=22
//		x+y=z		 y=9
		 
		 // 1) ++x			(우선순위 진행도)
		 // 3) y++	<- 문제
		 // 2) x + y => 14 + 8 => 22
		 // 4) = =>z = (x + y) => z =22
		 
		 /***/
		 x = 5;
		 y = 5;
		 System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		 
		 
		 z = x++ + --y;
		 System.out.println("z = " + z);
		 System.out.println("x = " + x);
		 System.out.println("y = " + y);
//		 z = 9
//		 x = 6
//		 y = 4
		 

		 // 1) --y
		 // 2) x + y = 9(z)
		 // 3) x++
		 
		 System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		 
		 
		 z = --x + y++;
		 System.out.println("z = " + z);
		 System.out.println("x = " + x);
		 System.out.println("y = " + y);
//		 z = 9
//		 x = 5
//		 y = 5

		 // 1) --x
		 // 2) x + y = 9(z)
		 // 3) y++
		 
		 
		 // 논리 부정 연산자
		 boolean play = true;
		 System.out.println(play);
		 
		 play = !play;
		 System.out.println(play);
		 
		 play = !play;
		 System.out.println(play);
		 
		 boolean isOpen = true;
		 
		 if(!isOpen) {
			 System.out.println("영업시간이 종료되었습니다.");
		 }else {
			 System.out.println("영업 중입니다.");
		 }
		 
		 
		 // 산술 연산자
		 int v1 = 5;
		 int v2 = 2;
		 int result;
		
		 result = v1 + v2;
		 System.out.println("result : " + result);

		 result = v1 - v2;
		 System.out.println("result : " + result);

		 result = v1 * v2;
		 System.out.println("result : " + result);

		 result = v1 / v2;
		 System.out.println("result : " + result);

		 result = v1 % v2;
		 System.out.println("result : " + result);
		 
		 
		 // 비교 연산자
		int num1 =10;
		int num2 =10;
		boolean bResult;
		
		bResult = ( num1 <= num2);
		System.out.println(">= : " + bResult);
		bResult = ( num1 == num2 );
		System.out.println("== : " + bResult);
		bResult = ( num1 != num2 );
		System.out.println("!= : " + bResult);

		char char1 = 'A'; //65
		char char2 = 'B'; //66
		System.out.println("문자 비교 : " + (char1 > char2));
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double : " + (v3 == v4));
		
		float v5 = 0.1f; //정밀도의 차이
		double v6 = 0.1;
		System.out.println("float VS double : " + (v5 == v6));
		System.out.println("float VS float : " + (v5 == (float)v6));
	
	
		// 논리 연산자
		int charCode = 'A';
		//주로 사용하는건 '&&' 
		// 유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자
		if (charCode >= 65 && charCode <= 90) {
			System.out.println("대문자");
			
		}
		
		// 유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if ((charCode >= 97) & (charCode <= 122)) {
			System.out.println("소문자");
		}
	
		//유니코드 중 48보다 크고 57보다 작으면 숫자 0~9를		
		if ((charCode > 48) && (charCode < 57)) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		
		if((numValue % 2 == 0) | (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요.");}
		//앞이 true면 몽땅 true '|'
		if((numValue % 2 == 0) || (numValue % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요.");}
		//OR의 의미'||'
		
		// 복합 대입 연산자
		int resultA = 0;
		resultA += 10;	// resultA에 대해서 10을 더한다. resultA = resultA + 10
		System.out.println("+= : " + resultA);
		
		resultA -= 5;	// resultA에 대해서 5를 뺀다. resultA = resultA - 5
		System.out.println("-= : " + resultA);
				
		resultA *= 3;	// resultA에 대해서 3을 곱한다. resultA = resultA * 3
		System.out.println("*= : " + resultA);
				
		resultA /= 5;	// resultA에 대해서 5를 나눈다. resultA = resultA / 5
		System.out.println("/= : " + resultA);
				
		resultA %= 3;	// resultA로 나눈 나머지 값이 3이다. resultA = resultA % 3
		System.out.println("%= : " + resultA);
		
		
		
		// 삼항 연산자
		int score = 95;
		char grade = (score > 90) ?'A':'B';
		System.out.printf("성적은 %d이고 등급은 %c 입니다.\n", score , grade );
		// %c 사용하는 이유 : 캐릭터(문자사용)
		
		int age = 27;
		String message = (age >= 20) ? "성인" : "미성년" ;
		System.out.printf("나이는 %d살이며 %s입니다.\n" , age , message );
		// %s 사용하는 이유 : String(문자열사용)
	}

}



/*안보고 그냥 작성가능하다-내꺼
*검색 좀하고 알 수있다 - 
*
*
*
*
*
*
*/






