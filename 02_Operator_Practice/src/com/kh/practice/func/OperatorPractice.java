package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수다." : "양수가 아니다.");
		
		sc.close();
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ) ? "양수다." : (num == 0) ? "0이다." : "음수다.";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다." : "홀수다.";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int pNum = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int cNum = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (cNum / pNum));
		System.out.println("남는 사탕 개수 : " + (cNum % pNum));
		
		sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double result = sc.nextDouble();
		
		System.out.println(grade + "학년 " + group + "반 " + num + "번 " + name + 
				((gender == 'M') ? " 남" : " 여") + "학생의 성적은 " + result + "이다.");
		
		sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println((age <= 13) ? "어린이" : (age > 19) ? "성인" : "청소년");
		
		sc.close();
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0 ;
		
		System.out.println("합계 : " + (kor + eng + math));
		System.out.println("평균 : " + avg);
		
		boolean each = (kor>= 40) && (eng>= 40) && (math>= 40); 
		System.out.println((each && (avg >= 60)) ? "합격" : "불합격");
		
		sc.close();
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		
		char ssn = sc.nextLine().charAt(7);
		String result = ((ssn == '2') || (ssn == '4')) ? "여자" : "남자";
		System.out.println(result);
		
		sc.close();
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		String result = ((num1 >= input) || (num2 < input)) ? "true" : "false";
		System.out.println(result);
		
		sc.close();
		
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
	
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		System.out.println((num1 == num2) && (num2 == num3) ? "true" : "false" );
	
		sc.close();
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		System.out.println("");
		
		System.out.println("A사원 연봉/연봉+a : " + a + "/" + (double)(a += a * 0.4));
		System.out.println(a >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("B사원 연봉/연봉+a : " + b + "/" + (double)(b));
		System.out.println(b >= 3000 ? "3000 이상" : "3000 미만");

		System.out.println("C사원 연봉/연봉+a : " + c + "/" + (double)(c += c * 0.15));	
		System.out.println(c >= 3000 ? "3000 이상" : "3000 미만");

		sc.close();
	}
}
