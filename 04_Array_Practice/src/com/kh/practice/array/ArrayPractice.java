package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		int num = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num --;
			}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ") ;
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	
	public void practice4() {
		String[] arr = {"사과","귤","포도","복숭아","참외"};
		System.out.print(arr[1]);
		
	}
	
	public void practice5() {	//	*********
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i +" ");	
				count++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + count);

	}
	
	public void practice6() {
		char[] week = {'월','화','수','목','금','토','일'};	// char형 배열은 ""가 아닌 '' 써야 됌 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num < 7) {
			System.out.print(week[num]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
		}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("정수 : ");
			
			int num = sc.nextInt();
			int count = 0;
			
			if ((num >= 3) && (num % 2 == 1)) {
				int[] arr = new int[num];
				
				for(int i = 0; i < arr.length; i++) {
					if(i <= arr.length/2) {
						arr[i] = ++count;						
					}else {
						arr[i]= --count;
					}
				}
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"양념", "후라이드", "순살"};
		
		System.out.print("치킨 이름을 입력하세요. : ");
		String food = sc.nextLine();
		int yesNo = 0;
		
		for(int i = 0; i < arr.length; i++) {
	
			if(arr[i].equals(food)) {
				yesNo += 1;
				break;
			}
		}
		if(yesNo == 0) {
			System.out.println(food + "은(는) 없는 메뉴입니다.");
		}else {
			System.out.println(food + "은(는) 있는 메뉴입니다.");
		}
		
	}	// return; 사용해보기.
	

}
