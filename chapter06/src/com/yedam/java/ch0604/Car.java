package com.yedam.java.ch0604;

public class Car {
	// 필드
	int gas;

	// 생성자

	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() { // return 필수
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // 얘가 있으면 바로 중단시킬 수 있음

		}

		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (isLeftGas()) {
				System.out.println("달립니다. (gas 잔량 : " + this.gas + ")");
				this.gas--;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + this.gas + ")");
				return;
//				System.out.println("종료합니다.");//실행X 이유:리턴 이후에는 실행할 수 없음.
			}
		}
	}
}
