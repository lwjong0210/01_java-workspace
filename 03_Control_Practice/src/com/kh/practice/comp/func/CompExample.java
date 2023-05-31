package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num == 0) {
				System.out.print("양수가 아닙니다.");
		}else {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 1) {
					System.out.print("박");
				}else if(i % 2 == 0) {
					System.out.print("수");
				}
			}
		}
		sc.close();
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 1) {
						System.out.print("박");
					}else if(i % 2 == 0){
						System.out.print("수");
					}
				}
				sc.close();
				break;
			}else {
				System.out.println("양수가 아닙니다.");
				continue;
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char str1 = sc.nextLine().charAt(0);
		
		int result = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == str1) {
				result ++;
			}else {
				continue;			}
		}
		System.out.printf("%s 안에 포함된 %s 개수 : %d", str, str1,result);
		sc.close();
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
			System.out.print("문자 : ");
			char str1 = sc.nextLine().charAt(0);
			
			int result = 0;
			
			for(int i = 0; i < str.length(); i++ ) {
				if(str.charAt(i) == str1) {
					result ++;				
				}else {
					continue;
				}
			}
			System.out.printf("%s 안에 포함된 %s 개수 : %d\n", str, str1, result);
			System.out.print("더 하시겠습니까? (y/n) : ");
			char yesOrNo = sc.nextLine().charAt(0);
			
			if(yesOrNo == 'y' || yesOrNo == 'Y') {
				continue;
			}else if(yesOrNo == 'n' || yesOrNo == 'N') {
				break;
			}else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				continue;
			}
		}
		sc.close();
	}
	
}
