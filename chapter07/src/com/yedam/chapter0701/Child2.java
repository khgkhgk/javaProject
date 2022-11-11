package com.yedam.chapter0701;

import com.yedam.chapter07.Parent;

public class Child2 extends Parent {

	// 필드

	// 생성자

	// 메소드

	void getInfo() {
		System.out.println(firstName + lastName + bloodType + age);
	}// 디폴트인 같은 패키지는 쓸수있는데 다른패키지면 사용X 대신 protected는
		// 다른 패키지에 있어도 사용가능 퍼블릭은 전체적으로 다 사용가능.
}
