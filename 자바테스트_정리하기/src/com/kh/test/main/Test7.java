package com.kh.test.main;

public class Test7 {
	public static void main(String[] args) {
		int[] 배열 = {1,2,3,4,5,6,7,8,9,10};
		double 합 = 0;
		
		for (int i : 배열) {
			if(i % 2 !=0) {
				System.out.println("홀수 : " + i);
				합 += i;
			}
		}
		System.out.println("합계 : " + 합);
		
	}
}
