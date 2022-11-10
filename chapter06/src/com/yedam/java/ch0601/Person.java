package com.yedam.java.ch0601;

public class Person {
	final String nation = "korea";
	final String ssn;//값을 final로서 수정할 수 없게 고정시킴.
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
