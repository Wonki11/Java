package com.kh.PropertiesPre;

import java.util.Map;
import java.util.Properties;

public class UserSetting {
	public static void main(String[] args) {
		//Properties 객체와 인스턴스 생성 =   setting
		Properties 설정 = new Properties();
		
		설정.setProperty("name", "john");
		설정.setProperty("age", "17");
		설정.setProperty("city", "seoul");
		
		String 도시조회 = 설정.getProperty("city");
		System.out.println("city : " + 도시조회);
		//속성 설정
		// name " john"
		// age "17"
		// city "seoul"
		// city 조회하기\
		// 조회내용 출력
		//전체조회하기 Map.Entry<Object,Object> key value 출력
		System.out.println("전체조회하기");
		for(Map.Entry<Object, Object> e : 설정.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key +" 은(는) " +  value);
		}
	}
}
