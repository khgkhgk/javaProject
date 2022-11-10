package com.yedam.java.ch0601;

import sun.tools.tree.ThisExpression;

public class Student {
	//필드
	private String sName;//학생 이름
	private String sSchool;//학교이름
	private int sNo;//학번
	private int sYear;//학년
	private int kor;//국,영,수 성적
	private int eng;
	public String getsName() {
		return sName;
	}


	public String getsSchool() {
		return sSchool;
	}


	public int getsNo() {
		return sNo;
	}


	public int getsYear() {
		return sYear;
	}


	public int getKor() {
		return kor;
	}


	public int getEng() {
		return eng;
	}


	public int getMath() {
		return math;
	}

	private int math;
	
	//생성자
	//생성자를 통해 모든 데이터를 입력
	public Student(String sSchool, String sName,
			int sNo, int sYear, int kor, int eng, int math) {
		this.sSchool = sSchool; //this로서 데이터를 받아오고 파란글씨에 정보를 대입해준다
		getInfo();
	}
	
	
	//메소드
	public void getInfo() {
		System.out.println("내가 다니는 학교 : " + sSchool);
	}
	void go() {System.out.println("학교를 갑니다");}
	
	void back() {System.out.println("학교에서 돌아왔습니다.");}
	
	//getInfo() 학생의 내용을 출력할 수 있는 기능
}
