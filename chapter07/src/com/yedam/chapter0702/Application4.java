package com.yedam.chapter0702;

public class Application4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		// c->b
		// b->a
		// c ->b->a 상속 관계
		// 약간 3단논법느낌

		A a1 = b;// 자동 타입변환됨
		A a2 = c;// 오버라이브되는거 A에서도 가능
		// 계층식 구조도 할수있단는 예

	}
}
