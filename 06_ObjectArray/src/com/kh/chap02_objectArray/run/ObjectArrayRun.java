package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// for loop문 => 단순한 for문
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Phone[] phones = new Phone[3];	// 배열 생성 !!!!
		/*
		System.out.println(phones);
		System.out.println(phones[0]);
		phones[0].SetName("아이폰");
		*/
		
		phones[0] = new Phone();
		phones[1] = new Phone("아이폰", "애플", 1300000,"14pro");
		phones[2] = new Phone("갤럭시", "삼성", 1200000, "s23");
		
		phones[0].SetName("벨벳폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1");
		
		int total = 0;
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i].information());
			total += phones[i].getPrice();
		}
		
		System.out.println("총가격 : " + total);
		System.out.println("평균가격 : " + total / phones.length);
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력받아
		// 해당 휴대폰을 찾은 후에 그 가격을 알려주도록
		// 구매하고자 하는 휴대폰 이름 입력 : 벨벳폰
		// 당신이 구매하고자 하는 휴대폰의 가격은 1000000원 입니다.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 휴대폰 이름 입력 : ");
		String buy = sc.nextLine();
		
		for(int i = 0; i < phones.length; i++) {
			if(phones[i].getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 " + phones[i].getPrice() + "원 입니다.");
			}
		}
		sc.close();
	}

}
