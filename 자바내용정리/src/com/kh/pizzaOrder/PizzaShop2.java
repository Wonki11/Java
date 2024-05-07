package com.kh.pizzaOrder;

import java.util.*;

public class PizzaShop2 {
	public static void main(String[] args) {
		//주문 목록을 저장할 ArrayList 주문리스트
		List<PizzaOrder> 주문 = new ArrayList<>();
		
		//주문추가 PizzaOrder 를 사용해서 주문을 추가함
		PizzaOrder 주문1 = new PizzaOrder("고영희","페페로니");
		PizzaOrder 주문2 = new PizzaOrder("박철진","마르게리따");
		PizzaOrder 주문3 = new PizzaOrder("안영식","슈프림");
		PizzaOrder 주문4 = new PizzaOrder("고영희","파인애플");
		PizzaOrder 주문5 = new PizzaOrder("박철진","치즈");
		
		주문.add(주문1);
		주문.add(주문2);
		주문.add(주문3);
		주문.add(주문4);
		주문.add(주문5);
		
		//필수 생성자 이용해서 바로 입력
		주문.add(new PizzaOrder("고영희","페페로니"));
		주문.add(new PizzaOrder("박철진","마르게리따"));
		주문.add(new PizzaOrder("안영식","슈프림"));
		주문.add(new PizzaOrder("고영희","파인애플"));
		주문.add(new PizzaOrder("박철진","치즈"));
	
		/*
		 * "고영희"."페페로니"
		 *  박철진 마르게리따
		 * 	안영식 슈프림
		 *  고영희 파인애플
		 *  박철진 치즈
		 * */
		
		//HashSet 사용해서 중복 주문을 방지하기 위한 set 중복주문 방지
		
		HashSet<String> set = new HashSet<>();
		
		set.add("페페로니");
		set.add("마르게리따");
		set.add("슈프림");
		set.add("파인애플");
		set.add("치즈");
		

		
		// 주문한 내용 전체보기 toString
		//toString 추가로 어떤 출력을 진행한다 하지 않아도 PizzaOrder에 작성한 자체가
		//정보를 정확하게 출력한다는 의미로 표기됨
		System.out.println(주문);
		
		//1개씩 보고 싶다면 for -each
		for(PizzaOrder 오더 : 주문) {
			System.out.println(오더);
		}
		
		//중복된 주문 정보 제거한거 출력 for each
	}
}
