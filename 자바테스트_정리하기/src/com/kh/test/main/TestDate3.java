package com.kh.test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {
		public static void main(String[] args) {
			
			int 연도 = 1987;
			int 월 = 8;
			int 날짜 = 14;
			
			//현재 날짜 구하기
			Calendar 현재 = Calendar.getInstance();
			int 현재년도 = 현재.get(Calendar.YEAR);
			int 현재월 = 현재.get(Calendar.MONTH) + 1;
			int 현재날짜 = 현재.get(Calendar.DAY_OF_MONTH) ;
			
			//나이계산
			int 나이 = 현재년도 - 연도;
			
			// 생일 전이면 나이 -1
			
			if(현재월 < 월 || (월 == 현재월 && 현재날짜 < 날짜)) {
				나이--;
			}
			
			//생일 요일 계산
			Calendar 생일 = new GregorianCalendar(연도,월 -1,날짜);
			SimpleDateFormat 날짜예쁘게작성 = new SimpleDateFormat("yyyy년 M월 d일");
			
			//출력
			System.out.println("생일 : " + 날짜예쁘게작성.format(생일.getTime()));
			System.out.println("현재 : " + 날짜예쁘게작성.format(현재.getTime()));
			System.out.println("나이" + 나이);
		}

}
