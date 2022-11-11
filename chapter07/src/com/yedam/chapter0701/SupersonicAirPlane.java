package com.yedam.chapter0701;

public class SupersonicAirPlane extends AirPlane {

	public static final int NORMAL = 1;// 노멀모드
	public static final int SUPERSONIC = 2;// 초음속 모드

	public int flyMode = NORMAL;// 어떤 비행 모드로 날고있는지

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 모드입니다.");
		} else {
			super.fly();// 일반모드는 fly에 정의되어있기떄문에 fly메소드를 2번쓰니까 super씀
		}
	}

	public void test() {
		super.fly();
	}

}