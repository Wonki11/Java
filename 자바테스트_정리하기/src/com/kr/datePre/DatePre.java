package com.kr.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DatePre {
	public static void main(String[] args) {
		//현재 날짜와 시간
		Date now = new Date();
		
		System.out.println(now);
		// Fri May 03 10:29:49 KST 2024 형식을
		// 우리가 원하는 형식으로 변경 SimpleDateFormat 사용해서 변경
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//now로 받은 날짜를 문자열로 simpleDateFormat 사용해서 변경
		String formatDate = sdf.format(now);
		System.out.println("날짜형식변경 : " + formatDate);
		
		//문자열(simpleDateFormat - String) > 날짜(Date) 변경
		//Date parseDate2
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy / MM 월 dd일"); // <형식은 마음대로 가능
		String formatsdf2 = sdf2.format(now);
				System.out.println(formatsdf2);
				
		//문자열(SimpleDateFormat - String)을 날짜(Date)로 변경		
			String 문자열 = "2024-04-30 15:30:45";
			
			try {
				Date parseDate = sdf.parse(문자열);
				System.out.println(parseDate);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}// Date로 변경할 때 문제가 생길 수 있으니 try-catch 사용
		
		
	}

}
