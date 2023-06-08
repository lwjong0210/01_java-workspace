package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.OverloadingTest;

public class MethodRun {

	public static void main(String[] args) {

		/*
		// -------------------NonStaticMethod-----------------------
		
		NonStaticMethod n = new NonStaticMethod();
		
		
		// 1. 매개변수도 없고 반환값도 없는 메소드 호출
//		n.method1(10); 매개변수 넣으면 안된다.
		n.method1();
			
		
		// 2. 매개변수 없고 반환값은 있는 메소드 호출
		n.method2();
//		String str = n.method2();	// str에 반환값 "아 집에가고싶다..."를 대입
		System.out.println(n.method2());
		
		
		// 3. 매개변수 있고 반환값은 없는 메소드 호출
//		n.method3();	// 매개변수가 없으면 오류남
//		n.method3(10);	// 매개변수 개수 맞지 않으면 오류남
//		n.method3("ㅋㅋ", "ㅎㅎ");	// 매개변수 타입 맞지 않으면 오류남
//		int a = n.method3(10, 20);	// 메소드에 return 없음 -> 반환값이 없어서 오류남
		n.method3(10, 5);
		n.method3(10, 0);
		
		
		// 4. 매개변수도 있고 반환값도 있는 메소드 호출
		char ch = n.method4("lemon",1);	// => lemon.chatAt(1);	=> 'e' 반환해서 ch에 대입
		System.out.println(ch);

		// 한줄로 줄이고 싶다면 ? 
		System.out.println(n.method4("lemon",1));	
		
		// 사용자에게 매개변수를 입력 받아서 해당 메소드 호출
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("인덱스 입력 : ");
		int index = sc.nextInt();
		
		// 여기서 유효성 검사 해보기
		// index 0 이상이고 문자열의 길이보다 작을때만 method4 실행
		
		if(index >= 0 && index < str.length()) {
			System.out.print("결과 : " + n.method4(str, index));
			
		}else {
			System.out.println("인덱스 값이 부적절합니다.");
		}
		*/
		
		/*
		// -------------------StaticMethod-----------------------
		// 생성 없이 바로 호출 가능
		// Math.random();
		StaticMethod.method1();	// 얘도 생성없이 바로 호출 가능한 Static 메소드	
		StaticMethod.method2();
		System.out.println(StaticMethod.method2());	// return 값은 출력하지 않으면 보이지 않는다.
		StaticMethod.method3("차은우");
		System.out.println(StaticMethod.method4("apple", "kiwi"));	// return 출력해야만 확인 가능
		*/
		
		// -------------------OverloadingTest-----------------------
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10,"ㅎㅎㅎㅎ");
		ot.test("ㅋㅋㅋㅋ",20);
		ot.test(10,10);
		ot.test("차은우");
		
		// 오버로딩의 대표적인 예 => print()
		System.out.print(0);
        System.out.print("안녕");

	}





}


