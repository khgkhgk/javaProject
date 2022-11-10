package com.yedam.java.ch0601;

import com.yedam.java.ch0604.Computer;
//import 강제 등록

public class Application {
	Computer com = new Computer();

	// 필드
	//
	int staticTest = 0;

	public static void main(String[] args) {
		Application ap = new Application();

		ap.staticTest = 2;

//		shoes. 
//		
//		shoes.makeRunning();
//		shoes.makeSlipper();
//		shoes.makeMule();
//		shoes.getCount();

		System.out.println(Shoes.totalCount);

		ConstantNo csno = new ConstantNo();// 이렇게 해야 사용가능
		System.out.println(csno.word);
		System.out.println(csno.words);

		System.out.println(ConstantNo.EARTH_ROUND);
	}
	// 은행 고객 정보를 관리하는 클래스
	// 1) main 2) Customer 3) Bank
	// 1) main -> 생성자를 통한 고객의 정보를 저장, 출력
	// 2) Bank -> 해당은행의 금리를 저장
	// (현재 잔액 + (현재 잔액 * 금리))
	// 3) Customer -> 고객의 정보를 저장
	// 이름, 은행명, 계좌, 잔액에 대한 필드
	// getInfo() : 입력한 정보 출력
	// withDraw() : 출금 할 때 정보를 출력
	// 컨트롤 쉬프트 O = import자동 생성

	public static void main1(String[] args) {

		Access access = new Access();

//	//1) public
//	access.free = "public";
//	access.free();
//	//2) privacy
//	access.privacy = "privacy";
//	access.privacy();
//	//3) protected
//	access.parent = "parent";

		// 4) default
		access.basic = "basic";
		// singleton == new Singleton()
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);

		// singleton = new Singleton();
		// getInstron () = singleton == new Singleton()

		Member mem = new Member();

		// 1) mem의 인스턴스 필드에 접근 가능한지 확인
		// 2) setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);

		System.out.println("ID : " + mem.getId());
		System.out.println("Tel : " + mem.getTel());
		System.out.println("Age : " + mem.getAge());

	}
}