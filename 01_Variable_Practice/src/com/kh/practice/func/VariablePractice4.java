package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void engKey() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char firstString = str.charAt(0);
		char secondString = str.charAt(1);
		char thirdString = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + firstString);
		System.out.println("두 번째 문자 : " + secondString);
		System.out.println("세 번째 문자 : " + thirdString);
		
		sc.close();
	}

}
