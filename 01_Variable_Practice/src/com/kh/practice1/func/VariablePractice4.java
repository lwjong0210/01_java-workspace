package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
		// 0. 메소드 생성
	public void engKey() {
		
		
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 문자열을 입력 받기 + 변수로 저장
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
//		char firstString = str.charAt(0);
//		char secondString = str.charAt(1);
//		char thirdString = str.charAt(2);
		
		// 3. 출력 (3번)
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(0));
		System.out.println("세 번째 문자 : " + str.charAt(0));
//		System.out.println("첫 번째 문자 : " + firstString);
//		System.out.println("두 번째 문자 : " + secondString);
//		System.out.println("세 번째 문자 : " + thirdString);
		
		//
		
		// 4. 스캐너 반납
		sc.close();
	}

}
