package com.kh.Sandwich;

import java.util.*;


public class 샌드위치가게 {
	public static void main(String[] args) {
		List<샌드위치> 주문 = new ArrayList<>();
		
		//샌드위치 주문1 = new 샌드위치("김하나","BLT");
		//샌드위치 주문2 = new 샌드위치("이둘","터키");
		//샌드위치 주문3 = new 샌드위치("김하나","치킨");
		//샌드위치 주문4 = new 샌드위치("이셋","에그마요");
		//샌드위치 주문5 = new 샌드위치("김하나","베지터블");
		
		주문.add(new 샌드위치("김하나", "BLT"));
		주문.add(new 샌드위치("이둘", "터키"));
		주문.add(new 샌드위치("김하나", "치킨"));
		주문.add(new 샌드위치("이셋", "에그마요"));
		주문.add(new 샌드위치("김하나", "BLT"));
		
		HashSet<String> 중복 = new HashSet<>();
		
		List<샌드위치> 중복제거 = new ArrayList<>();
		
		for(샌드위치 오더 : 주문) {
			if(!중복.contains(오더.get고객명())) {
				중복제거.add(오더);
				중복.add(오더.get고객명());
				
			}
		}
		System.out.println(중복제거);
		//for - each
		for(샌드위치 오더 : 중복제거) {
			System.out.println(오더);
		}
		
		
	
}
}
