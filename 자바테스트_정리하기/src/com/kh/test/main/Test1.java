package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int i = sc.nextInt();
		
		if(i >= 1 && i <= 100) {
			if(i % 2 == 0) {
				System.out.println("2의 배수입니다");
			}else {
				System.out.println("2의 배수가 아닙니다.");
			}
			
		} else {
			System.out.println("1부터 100사이 값만 입력해주세요");
		}
		
		System.out.println("=== if    else if    else===");
		
		int 숫자1 = 5;
		
		if (숫자1 > 0) {
			System.out.println("양수입니다.");
		}else if ( 숫자1 < 0 ) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0 입니다.");
		}
		
	}
}
