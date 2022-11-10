package com.yedam.java.example;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] std = null;
		
		System.out.println("입력할 학생 수 >");
		int sCount = Integer.parseInt(sc.nextLine());
		std = new Student[sCount];
		
		for(int i =0; i<std.length; i++) {
			Student student = new Student();
			
			System.out.println("학생 이름 > ");
			String sName = sc.nextLine();
			student.setsName(sName);

			System.out.println("학생 이름 > ");
			String sNo = sc.nextLine();
			student.setsNo(sNo);
			
			std[i] = student;
		}
		
		for(int i=0 ; i<std.length;i++) {
			System.out.println("학생 이름 >" + std[i].getsName());
			System.out.println("학생 번호 >" + std[i].getsNo());
		}
		
		
		for (int i = 0; i < Bary.length; i++) {

			School school = new School();

			// 1.이름 입력
			System.out.println("이름 >");
			String name = sc.nextLine();
			School.setName("고길동");

			// 2. 학번 입력
			System.out.println("학번 >");
			int account = Integer.parseInt(sc.nextLine());
			School.setAccount(account);

			// 3.국어
			System.out.println("국어 >");
			String kor = sc.nextLine();;
			student.setAccount(account);


			// 4.수학
			System.out.println("수학 >");
			String name = sc.nextLine();
			bank.setName("고길동");

			// 5.영어
			System.out.println("영어 >");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account);
			// ===============================================================
			// bank 객체 (계좌,은행,예금,고객이름)
			Bary[i] = school; // <-for문 돌린 값을 여기 전달해줌

		}
		
		
	}
}
