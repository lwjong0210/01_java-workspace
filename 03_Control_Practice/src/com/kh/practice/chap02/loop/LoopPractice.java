package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		sc.close();
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			} else {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		sc.close();
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);

			if (num == i) {
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
		}
		System.out.print(sum);
		sc.close();
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if(num2 > num1) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}else {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}
		sc.close();
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			} else {
				if(num2 > num1) {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				}else {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
				}
				break;
			}
		}
		sc.close();
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단" + " =====");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
		}
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		while(true) {
			if(dan < 10) {
				System.out.println("===== " + dan + "단 " + "=====");
				for(int i = 1; i < 10; i++ ) {
					System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				}
				dan++;
				if(dan >9) {
					break;
				}
			}else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
			sc.close();
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			if(dan < 10) {
				for(int i = dan; i < 10; i++) {
					System.out.println("===== " + i + "단 =====");
					for(int j = 1; j < 10; j++) {
						System.out.printf("%d x %d = %d\n",i,j,i*j);
					}
				}
				break;
			}else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		}
		sc.close();
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int d = sc.nextInt();
		int count = 0;
		int sum = num;
		
		while(true) {
			if(count < 10) {
				System.out.print(sum + " ");
				sum += d;
				count++;
			}else {
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
