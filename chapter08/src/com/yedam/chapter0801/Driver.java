package com.yedam.chapter0801;

public class Driver {

	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) { // instanceof : 어떤애를 참조하고있는지 확인 = 니 버스맞나?
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();

	}
}
