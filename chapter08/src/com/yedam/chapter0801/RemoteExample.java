package com.yedam.chapter0801;

public class RemoteExample {
	public static void main(String[] args) {

		// TV를 객체로 해서 만듦.
		RemoteControl rc = new Television();

		// 오디오로 변경됨
		// rc하나로 바꿨다 갈아끼웠다 할 수 있음

//		rc = new Audio();

		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();

		Search search = new Television();

		search.search("google.com");

		/*
		 * public void temp(RemoteControl rc){ } =인터페이스타입 객체 자식클래스로 5개넣어주면 5개 기능가능
		 */

		// 추상 클래스 vs 인터페이스
		// 추상 클래스(extends) -> 필드, 생성자, 메소드 : 한부모만 가능(여러개 하려면 여러개 작성해야함)
		// 인터페이스(implement) -> 상수, 추상 메소드 : 상속 여러개 받을 수 있음(Tv파일 확인ㄱ)
		// 인터페이스는 메모리 안쓰고 바로 사용가능
	}
}
