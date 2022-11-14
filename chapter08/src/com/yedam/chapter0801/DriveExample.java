package com.yedam.chapter0801;

public class DriveExample {
	public static void main(String[] args) {
		Driver driver = new Driver();// 객체만드는법

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);

		Vehicle vhc = new Bus(); // 버스 구현객체

		vhc.run();
		// vhc.checkFare();

		// 강제 타입 변환
		Bus bus2 = (Bus) vhc;

		bus2.run();
		bus2.checkFare();

		// 객체 타입 확인
		// instanceof

		driver.drive(bus);
		driver.drive(taxi);
	}
}
