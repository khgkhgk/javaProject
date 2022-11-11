package com.yedam.chapter0701;

public class Application {

	public static void main(String[] args) {

//		Child child = new Child();
//
//		// 자식 클래스 고유 필드
//		child.lastName = "paul";
//		child.age = 20;
//
//		// 부모 클래스 필드
//		System.out.println(child.firstName + child.lastName);// 부모자식클래스 성립되는것 확인
//
////		System.out.println(child.job); 부모클래스라고 private걸려있으면 안됨
//
//		// 부모 -> 여러명의 자식 (O)
//		// 자식 -> 여러명의 부모 (X)
//
//		DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);
//
//		// 부모 클래스 필드 사용
//		System.out.println("모델 : " + dmb.model);
//		System.out.println("색상 : " + dmb.color);
//
//		// 자식 클래스 필드 사용
//		System.out.println("채널 : " + dmb.channel);
//
//		// 부모 클래스 메소드 사용
//		dmb.powerOn();
//		dmb.sendVoice("안녕하세요");
//		dmb.receiveVoice("안녕하세요 전 김또치입니다.");
//		dmb.powerOff();
//
//		// 자식 클래스 메소드 사용
//		dmb.turnOnDmb();
//
//		Member member = new Member("고길동", "12312312-12312312", 1);
//		// 부모 객체의 필드 사용
//		System.out.println("name : " + member.name);
//		System.out.println("ssn : " + member.ssn);
//
//		// 자식 객체의 필드 사용
//		System.out.println("memberNo : " + member.stdNo);
//
//		Child cd = new Child();
//
//		cd.method1();// 부모클래스에서 정의 / 자식클래스에서 재정의
//		cd.method2();// 부모클래스에서 정의
//		cd.method3();// 자식클래스에서 정의

		Compute com = new Compute();

		double result = com.areaCircle(10);
		System.out.println("result : " + result);

		SupersonicAirPlane sa = new SupersonicAirPlane();

		sa.takeOff();

		sa.fly();

		sa.flyMode = SupersonicAirPlane.SUPERSONIC;

		sa.fly();

		sa.flyMode = SupersonicAirPlane.NORMAL;

		sa.fly();

		sa.land();

		Child chd = new Child();
		//Parent parent = new Child();
		//자동 타입 변환
		//부모 클래스에 있는 필드, 메소드를 사용을 하되 만약 자식 클래스에 오버 라이딩이
		//되어있는 메소드가 존재한다면 부모클래스에 정의된 메소드를 사용하지 않고
		//자식 클래스에 있는 메소드를 사용하게 되는게 자동 타입변환
		Parent parent = chd;//부모클래스 부르기
		
		parent.method1(); //자식클래스에서 자동 타입변환됨
		parent.method2();
		//parent.method3(); //자식클래스에만 있는것이기 떄문에 사용 불가능
		
		
		
		
		
		
		
		
		
		
	}
}
