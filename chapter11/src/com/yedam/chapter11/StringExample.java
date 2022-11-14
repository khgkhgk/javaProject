package com.yedam.chapter11;

import java.io.UnsupportedEncodingException;

public class StringExample {

	// String에 대하여

	// String a = "1"; //100번지
	// String c = "1"; //100번지
	// String b = new String("1"); //200번지 - new는 새주소 할당받는거임.

	// 바이트 -> 문자열

	public static void main(String[] args) {
		// 바이트 -> 문자열
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		// 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);

		// String str2 = new String (바이트 배열, 시작점 , 갯수 );
		String str2 = new String(bytes, 6, 4);// 6번째부터 4개만 가져와 (74,97,118,97)
		System.out.println(str2);

		// String 메소드
		// 1) charAt(int index) - 특정 문자 위치를 반환(문자열x "문자")

		String ssn = "123456-1876541";
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		// 문자열 비교
		// equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";

		// 주소를 비교
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}

		// 값을 비교
		if (strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		} else {
			System.out.println("다른 문자열 가짐");
		}

		// 바이트 배열로 변환
		byte[] bytes2 = null;
		String str = "안녕하세요";
		bytes2 = str.getBytes();// 바이트 배열이 됨 (한글이라 1글자3바이트라 15바이트됨)

		System.out.println(bytes2.length);

		// String -> byte 인코딩 // 역순은 디코딩

		String str3 = new String(bytes2);
		System.out.println("bytes2 -> String : " + str3); // 디코딩

		try {
			byte[] bytes3 = str.getBytes("EUC-KR"); // 인코딩인데 UTF-8이랑 달라서 한글한글자에 2바이트임

			System.out.println("bytes3.length : " + bytes3.length);

			String str4 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 -> string : " + str4); // 디코딩

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 문자열 찾기
		String subject = "자바 프로그래밍";

		int index = subject.indexOf("프로그래밍");

		System.out.println(index);// 문자열 시작부분을 찾아줌 (자바/ /프로그래밍)(01/2/34567)

		index = subject.indexOf("a");

		System.out.println(index);// 없기떄문에 -1로 나옴. 문자 있는지 없는지 이걸로 확인가능

		// 문자열의 문자 개수 얻기
		System.out.println(subject.length());

		// 문자열 대체

		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		// Java 프로그래밍("자바"를 지우고 "Java"가 들어간게 아님. 둘다 메모리엔 찍혀있음!!)
		System.out.println(newStr);

		// oldStr = "자바"; //100번지
		// oldStr += "프로그래밍"; // 200번지
		// oldStr += "재밌다"; //300번지

		// Stringbuilder 또는 buffer(하나의 메모리로 다 조져버리기)
		StringBuilder sb = new StringBuilder();
//		StringBuilder sb2 = new StringBuffer();
//		sb2.append(false);

		sb.append("자바"); // 500번지
		sb.append("프로그래밍"); // 500번지
		sb.append(123); // 500번지

		System.out.println(sb);

		// 대소문자 바꾸기

		String strVal = "asdfkjasndlgkfjasdhlkjf";
		String strVal2 = "SDAKLJFLKADJFADSFL";

		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());

		// trim (공백없애기)
		String strTrim = "		자바		";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());

		// substring()
		// substring(index, end)
		// index부터 end까지 자르세요

		// substring(index)
		// index부터 자르세요

		String ssn2 = "880815-1234567";

		String firstNum = ssn2.substring(0, 6);
		String secondNum = ssn2.substring(7);

		System.out.println(firstNum);
		System.out.println(secondNum);

		// split()
		String strSplit = "1-1-1-1-2-3-4-5-6-9";

		String[] strAry = strSplit.split("-");

		for (String temp : strAry) {
			System.out.println(temp);
		}

		// 문자열 변환

		// 숫자나, 소수, 불리언 -> String 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);

		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
	}
}
