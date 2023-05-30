package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		
		System.out.println("1. 입력 \n2. 수정 \n3. 조회 \n4. 삭제 \n5. 종료");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		default:
			System.out.println("프로그램이 종료됩니다.");
		}
		
		sc.close();
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double avg = (num1 + num2 + num3)/3;
		boolean each = (num1 >= 40) && (num2 >= 40) && (num3 >= 40);

		if(each && (avg >= 60)) {

			System.out.printf("국어점수 : %d \n수학점수 : %d \n영어점수 : %d ",num1,num2,num3);
			System.out.printf("합계 : %d \n평균 : %f \n축하합니다, 합격입니다!",sum,avg,each);
		} else {
			System.out.printf("국어점수 : %d \n수학점수 : %d \n영어점수 : %d \n불합격입니다.",num1,num2,num3);
		}
		sc.close();
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			sc.close();
			return;
		}
		System.out.println(month + "월은 " + season + "입니다.");
		sc.close();
	}
	
	public void practice5() {
		String userId = "myId";
		String userPw = "myPassword12";
		
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 : ");
		String inputId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String inputPw = sc.nextLine();
		
		if(userId.equals(inputId)) {
			if(userPw.equals(inputPw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자":
			System.out.print("회원관리, 게시글 관리 ");
		case "회원":
			System.out.print("게시글 작성, 댓글 작성 ");
		case "비회원":
			System.out.print("게시글 조회");
		}
		sc.close();
		
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)을 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if (bmi < 23) {
			System.out.println("정상체중");
		}else if (bmi < 25) {
			System.out.println("과체중");
		}else if (bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		sc.close();
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("피연산자2 입력 : ");
		double num2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String op = sc.nextLine();		
		
		double result = 0;

		switch(op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			sc.close();
			return;
		}
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		sc.close();
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double middleScore = sc.nextDouble();
		double mScoreEx = middleScore * 0.2;
				
		System.out.print("기말 고사 점수 : ");
		double finalScore = sc.nextDouble();
		double fScoreEx = finalScore * 0.3;
		
		System.out.print("과제 점수 : ");
		double projectScore = sc.nextDouble();
		double pScoreEx = (projectScore * 0.3);
		
		System.out.print("출석 점수 : ");
		int attendanceScore = sc.nextInt();
		double aScoreEx = attendanceScore;
		double result = mScoreEx + fScoreEx + pScoreEx + aScoreEx;
		
		if(attendanceScore <= 20-(20 * 0.3)) {
			System.out.println("===========결과===========");
			System.out.printf("fail [출석 회수 부족 (%d/20)]\n",attendanceScore);
		}else {
			System.out.println("===========결과===========");
			System.out.printf("중간 고사 점수(20) : %.1f\n",mScoreEx);
			System.out.printf("기말 고사 점수(30) : %.1f\n",fScoreEx);
			System.out.printf("과제 점수    (20) : %.1f\n",pScoreEx);
			System.out.printf("츨석 점수    (20) : %.1f\n",aScoreEx);
			System.out.printf("총점 : %.1f\n",result);
			if(result >= 70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수 미달]");
			}
		}
		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실행할 기능을 선택하세요.\n1.메뉴 출력 \n2.짝수/홀수 \n3. 합격/불합격 "
				+ "\n4. 계절 \n5. 로그인 \n6. 권한 확인 \n7. BMI \n8. 게산기 \n9. P/F \n선택 : ");
	
		int func = sc.nextInt();
		
		switch(func) {
		case 4:
			practice4();
			break;
		}
		
		sc.close();
	}
}
