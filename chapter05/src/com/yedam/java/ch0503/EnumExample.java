package com.yedam.java.ch0503;

import java.util.Calendar;

public class EnumExample {
	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//파란글씨는 현재요일정보
		
		switch(Week) {
		case 1 :
			today = Week.SUNDAY;
			break;
		case 2 :
			today = Week.MONDAY;
			break;
		case 3 :
			today = Week.TUSDAY;
			break;
		case 4 :
			today = Week.;
			break;
		case 5 :
			today = Week.;
			break;
		case 6 :
			today = Week.FRIDAY;
			break;
		case 7 :
			today = Week.SATURDAY;
			break;
			
		}
		
		System.out.println("오늘 요일 : " + today);
		if(today == Week.SUNDAY) {
		}else {
			System.out.println("오늘은..." + today);
		}
		
		
		
		
		
		
		
	}
}
