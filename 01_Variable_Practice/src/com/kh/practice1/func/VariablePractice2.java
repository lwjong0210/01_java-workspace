package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
		// 0. 메소드 생성
	public void calc() {
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 두수를 입력 받는 가이드 문구 출력 및 입력받기
		System.out.print("첫 번째 정수 : ");
		int firstNum = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int secondNum = sc.nextInt();
		
		
		// 3. 연산결과 출력
		System.out.println("더하기 결과 : " + (firstNum + secondNum));
		System.out.println("빼기 결과 : " + (firstNum - secondNum));
		System.out.println("곱하기 결과 : " + (firstNum * secondNum));
		System.out.println("나누기 몫 결과 : " + (firstNum / secondNum));
		
		// 4. 스캐너 반납
		sc.close();
	}
}
