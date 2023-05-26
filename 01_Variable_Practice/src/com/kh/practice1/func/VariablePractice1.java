package com.kh.practice1.func;


import java.util.Scanner;

public class VariablePractice1 {
		
		// 0. 메소드 생성
	public void userInfo() {
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 가이드 문구 출력 및 입력받기
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		// 3. 출력
		System.out.print("키 " + height + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
		
		// 4. 스캐너 반납
		sc.close();
	}

}
