package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {

	public static void main(String[] args) {
		// 5마리의 강쥐 이름을 입력 받아서 ArrayList에 저장한 후에
		// 이들 중 '구' 라는 이름이 포함된 강쥐를 모두 출력하시오.
		// * 처음에는 4마리의 강쥐 ArrayList 생성 후 (크기 4짜리)
		// 2번 인덱스에 마지막 강쥐를 추후에 추가 할 것!(끼워넣기)
		// + 구 포함한 이름을 가진 강쥐가 몇마리 인지 출력하시오.
		
		ArrayList <Dog> dog = new ArrayList<>(4);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + "번째 강쥐 이름 입력 : ");
			String dName = sc.nextLine();
			
			System.out.print("강쥐 나이 입력 : ");
			int dAge = sc.nextInt();
			sc.nextLine();
			
			System.out.print("강쥐 종 입력(ex. 말티즈) : ");
			String dKind = sc.nextLine();
			
			if(i == 4) {
				dog.add(2, new Dog(dName, dAge, dKind));
			}else {
				dog.add(new Dog(dName, dAge, dKind));
			}
		}
		
		/*
		while(dog.size() < 5) {
			
			System.out.print(dog.size()+1 + "번째 강쥐 이름 입력 : ");
			String dName = sc.nextLine();
			
			System.out.print("강쥐 나이 입력 : ");
			int dAge = sc.nextInt();
			sc.nextLine();
			
			System.out.print("강쥐 종 입력(ex. 말티즈) : ");
			String dKind = sc.nextLine();
			
			if(dog.size() == 4) {
				dog.add(2, new Dog(dName, dAge, dKind));
			}else {
				dog.add(new Dog(dName, dAge, dKind));
			}
		}
		*/
		
		System.out.println("===============================================");
		System.out.println("전체 깡쥐 출력");
		System.out.println("===============================================");
		for(int i = 0; i < dog.size(); i++) {
			System.out.println(dog.get(i));
		}
		System.out.println("===============================================");
		System.out.println("이름에 '구'가 들어간 강쥐 정보 출력");
		System.out.println("===============================================");

		int count = 0;
		
		for(Dog d : dog) {
			if(d.getName().contains("구") == true) {
				System.out.println(d);
				count++;
			}
		}
		System.out.println("이름에 '구'가 들어간 강쥐는 총 " + count + "마리 입니다.");
		
		/*
		for(int i = 0; i < dog.size(); i++) {
			char[] c = dog.get(i).getName().toCharArray();
			for(int j = 0; j < c.length; j++) {
				if(c[j] == '구') {
					System.out.println(dog.get(i));
					count++;
				}else {
					continue;
				}
			}
	
		}
		System.out.println("이름에 '구'가 들어간 강쥐는 총 " + count + "마리 입니다.");
		*/

	}

}
