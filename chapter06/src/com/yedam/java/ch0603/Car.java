package com.yedam.java.ch0603;

public class Car {
	// 필드. 모든 인스턴스에 영향을 주는것
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;

	// 생성자. 필드값에 영향을 주진 않음.
	public Car(String model, String color) {
		this.model = model;// this뜻 : 이 클래스로 인해 생기는 디스턴스(여기서 만들어진것)
		this.color = color;// 위에 있는 클래스 건드리는게 아님
	}

	public Car() {
		// this.model = model;
		this(model, color, 250);
	}

	public Car(String model) {
//		this.model = model;
//		this.color = color;
//		System.out.println("인스턴스를 생성했습니다."); <-this앞에 뭐있으면 실행안됨
		//this.company = "웨스턴";
		this(model, color, 250);//<-this는 반드시 첫번째줄
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

	public Car(String model) {
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}