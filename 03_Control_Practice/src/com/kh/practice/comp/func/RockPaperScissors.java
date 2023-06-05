package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		
		String cp = "";
		int win = 0;
		int defeat = 0;
		int tie = 0;
		
		while(true) {
			int random = (int)(Math.random()*3);
			if(random == 0) {
				cp = "가위";
			}else if(random == 1) {
				cp = "바위";
			}else {
				cp = "보";
			}
			System.out.print("가위바위보 : ");
			String user = sc.nextLine();
			
			
			if((user.equals("가위")) ||(user.equals("바위"))||(user.equals("보"))) {
				System.out.println("컴퓨터 : " + cp);
				System.out.println(name + " : " + user);
				if((cp.equals("가위") && user.equals("바위"))
						||(cp.equals("바위") && user.equals("보"))
						||(cp.equals("보") && user.equals("가위"))) {
					System.out.println("이겼습니다.");
					++win;
				}else if(cp.equals(user)){
					System.out.println("비겼습니다.");
					++tie;
				}else {
					System.out.println("졌습니다 ㅠㅠ");
					++defeat;
				}
				continue;
			}else if(user.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패",win + tie + defeat, win, tie, defeat);
				break;
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
		sc.close();
	}
	
	public void rps2() {
		Scanner sc = new Scanner(System.in);
		// 필요한 자원 -> 변수
		int total = 0;	// 전
		int win = 0;	// 승
		int tie = 0;	// 무
		int lose = 0;	// 패
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		while(true) {
			System.out.print("가위바위보 : ");
			String rps = sc.nextLine(); // exit
			
			int random = (int)(Math.random()*3 + 1);
			String com = "";
			
			switch(random){	// 1 2 3
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			case 3:
				com = "보";
				break;
			}
			
			if(rps.equals("exit")) {	// exit를 입력한 경우에는 종료
				// 전승무패 출력
				System.out.println(total + "전 " + win + "승 " + tie + "무 " + lose + "패");
				// 종료
				break;
			}else if(rps.equals("가위") || rps.equals("바위") || rps.equals("보")) {	// 잘입력한 경우
				total ++;
				System.out.println("컴퓨터 : " + com);	// 컴퓨터 : 가위(랜덤값)
				System.out.println(name + " : " + rps);	// 이원종 : 보(내가 입력한 값)
				
				if(com.equals("가위")) {	// 컴퓨터가 가위를 낸 경우
					switch(rps) {
					case "가위" :
						System.out.println("비겼습니다.");
						tie ++;
						break;
						
					case "바위" :
						System.out.println("이겼습니다.");
						win ++;
						break;
					case "보" :
						System.out.println("졌습니다.");
						lose ++;
						break;
					}
				}else if(com.equals("바위")) {	// 컴퓨터가 가위를 낸 경우
					switch(rps) {
					case "바위" :
						System.out.println("비겼습니다.");
						tie ++;
						break;
						
					case "보" :
						System.out.println("이겼습니다.");
						win ++;
						break;
					case "가위" :
						System.out.println("졌습니다.");
						lose ++;
						break;
					}
				}else if(com.equals("보")) {	// 컴퓨터가 가위를 낸 경우
					switch(rps) {
					case "보" :
						System.out.println("비겼습니다.");
						tie ++;
						break;
						
					case "가위" :
						System.out.println("이겼습니다.");
						win ++;
						break;
					case "바위" :
						System.out.println("졌습니다.");
						lose ++;
						break;
					}
				}
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	
}
