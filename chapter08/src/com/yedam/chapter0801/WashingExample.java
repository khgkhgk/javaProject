package com.yedam.chapter0801;

public class WashingExample {

	public static void main(String[] args) {

		washing(new LGWashingMachine());
		// washing(new SAMSUNGWashingMachine()); <-코드 수정없이 객체바꿀 수 있음.

	}

	public static void washing(WashingMachine wm) {
		wm.strarBtn();
		System.out.println("세탁기 속도는 " + wm.changeSpeed(3));
		wm.stopBtn();

	}

}
