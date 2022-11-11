package com.yedam.chapter0702;

public class Application {
	public static void main(String[] args) {

		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemTire = car.run();// 어떤위치 타이어인지 알려줌

			switch (problemTire) {
			case 0:
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1:
				// frontLeftTire - Tire
				// 펑크 - 교체원함 - 한국타이어로 교체
				// 규격에 맞춰진 한국타이어(모든기능은 Tire(부모클래스)지만 한국타이어(자식클래스) 만의 재선언된 기능 사용)
				// 부모 클래스에서 오버라이딩 한 내용을 바꿔 끼우게 되는것. 자동 타입 변환으로 인해 가능한 일.
				/*
				 * HankookTire tire = new HankookTire("앞왼쪽", 15); car.frontLeftTire = tire 얘네
				 * 2줄을 밑에 한줄이 묶어서 표현한거임 car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				 */
				System.out.println("앞왼쪽 HankookTire 교체"); // Tire타입 -> HankookTire로 변경(타이어교체)
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			default:

			}

		}

	}

}
