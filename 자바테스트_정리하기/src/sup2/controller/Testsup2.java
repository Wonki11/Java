package sup2.controller;

import java.util.Scanner;

import sup2.model.Student;

public class Testsup2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름");
		String 이름 = sc.next();
		System.out.println("학년");
		int 학년 = sc.nextInt();
		System.out.println("반");
		int 반 = sc.nextInt();
		System.out.println("번호");
		int 번호 = sc.nextInt();		
		System.out.println("성별");
		char 성별 = sc.next().charAt(0);
		System.out.println("성적");
		double 성적 = sc.nextDouble();
		
		Student 학생 = new Student(이름,학년,반,번호,성별,성적);
		학생.정보();
	}

	
}
