package com.kh.test.main;

public class Test2 {
	public static void main(String[] args) {
		
		for(int 단 = 2; 단 <=5; 단++) {
			System.out.println("===" +  단 + "===");
			for(int i = 1; i <=9; i++) {
				if(단*i % 2 == 1)
					System.out.println(단 + " * " + i + " = " + 단*i);
			}
		}
	}
}
