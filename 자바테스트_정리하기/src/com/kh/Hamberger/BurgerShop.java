package com.kh.Hamberger;

import java.util.*;

public class BurgerShop {
	public static void main(String[] args) {
		//ArrayList 사용 주문리스트
		List<HambergerOrder> 주문 = new ArrayList<>();
		
		HambergerOrder 주문1 = new HambergerOrder("동그라미","치즈버거");
		HambergerOrder 주문2 = new HambergerOrder("안세모","베이컨버거");
		HambergerOrder 주문3 = new HambergerOrder("박네모","상하이버거");
		HambergerOrder 주문4 = new HambergerOrder("금각진","치킨버거");
		HambergerOrder 주문5 = new HambergerOrder("동그라미","빅맥");
		
		주문.add(주문1);
		주문.add(주문2);
		주문.add(주문3);
		주문.add(주문4);
		주문.add(주문5);
		
		//new BugerOrder("동그라미","치즈버거")
		//new BugerOrder("안세모","베이컨버거")
		//new BugerOrder("박네모","상하기버거")
		//new BugerOrder("금각진","치킨버거")
		//new BugerOrder("동그라미","빅맥")
		
		//toString 출력 sysout 주문리스트
		for(HambergerOrder 오더 : 주문)
		System.out.println(오더);
		
		//HashSet
		Set<String> 중복 = new HashSet<>();// 중복확인여부를 위한 인스턴스 생성
		
		//중복 고객을 제거한 다음에 중복되지 않은 고객만 ArrayList에 다시 담기
		
		List<HambergerOrder> 중복제거주문 = new ArrayList<>();//중복고객을 제거한 내용만 담을 예정
		
		//for - each문을 활용해서 중복이 있는지 한바퀴 돌면서 확인한다음
		//중복이 되지 않는 내용만 추가
		for(HambergerOrder 오더 : 주문) {
			//존재하는 고객만 추가하겠다 라는 의미이기 때문에 추가가 안됨
			//if(중복.contains(오더.get고객명())) {
			if(!중복.contains(오더.get고객명())) {//고객이 존재하지 않는다면
				중복제거주문.add(오더);			 //주문 내용 추가
				중복.add(오더.get고객명());
			}
			
		}
		
		System.out.println(중복제거주문);//중복제거주문에는 처음에 주문한 리스트만 받을 수 있게 됨
	}
}
