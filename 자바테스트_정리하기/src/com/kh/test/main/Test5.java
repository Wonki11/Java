package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("정수를 입력하세요1");
		int a = sc.nextInt();
		System.out.println("정수를 입력하세요2");
		int s = sc.nextInt();
		
		int 곱셈 = a * s;
		
		if(곱셈 <= 9) {
			System.out.println("한 자리 수 입니다");
		}else {
			System.out.println("두 자리 수 입니다");
		}
	}
}
