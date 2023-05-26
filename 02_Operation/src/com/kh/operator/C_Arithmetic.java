package com.kh.operator;

public class C_Arithmetic {
	
	/*
	 * 산술연산자 (이항연산자 == 두개의 값을 가지고 연산)
	 * + - * / %
	 * 
	 * (* / %) > (+ -)  
	 */

	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + num1 + num2);	// num1,num2를 문자로 생각하고 더함 =>103이 나옴..
		System.out.println("num1 + num2 = " + (num1 + num2));	// 숫자 num1, 숫자 num2를 더한 후 문자로 변환 => 13이 나옴
//		System.out.println("num1 - num2 = " + num1 - num2);	// 에러발생 : 문자 - 숫자 불가
		System.out.println("num1 - num2 = " + (num1 - num2));	// 결과 : 7
		System.out.println("num1 * num2 = " + (num1 * num2));	// 결과 : 30	곱셈연산은 우선순위 먼저! 하지만 가독성 위해 ()
		System.out.println("num1 / num2 = " + (num1 / num2));	// 결과 : 3 니누기 연산시 몫 출력
		System.out.println("num1 % num2 = " + (num1 % num2));	// 결과 : 1 나누기 연산시 나머지 출력 <홀짝>
		
		// 값 % 2 == 0 라는 건 짝수란 소리
		// 값 % 2 == 1 라는 건 홀수랑 소리
		
		// 값 % 5 == 0 라는 건 5의 배수란 소리
		// 값 % 3 == 0 라는 건 3의 배수란 소리
		
	}
	
	public void quiz1(){
		int a = 5;	
		int b = 10;
	    int c = (++a) + b;	// a = 6, b = 10, c = 16
	    int d = c / a;	// a = 6, b = 10, c = 16, d = 2 
	    int e = c % a;	// a = 6, b = 10, c = 16, d = 2, e = 4  
	    int f = e++;	// a = 6, b = 10, c = 16, d = 2, e = 4(5), f = 4
	    int g = (--b) + (d--);	// a = 6, b = 9, c = 16, d = 2(1), e = 5, f = 4, g = 11
	    int h = 2;// a = 6, b = 9, c = 16, d = 1, e = 5, f = 4, g = 11, h = 2
	    int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	    // a = 6(7), b = 9, c = 15, d = 1, e = 6, f = 4, g = 11(10), h = 2
	    // 6 + 9 / (15 / 4 ) * (11 - 1) % (6 + 2)
	    // 6 + 9 / 3 * 10 % 8
	    // 6 + 3 * 10 % 8
	    // 6 + 30 % 8
	    // 6 + 6 => 12
	    
	    // a = 7, b = 9, c = 15, d = 1, e = 6, f = 4, g = 10, h = 2, i = 12
	    
	    System.out.println("a : " + a); 
	    System.out.println("b : " + b); 
	    System.out.println("c : " + c);   
	    System.out.println("d : " + d);   
	    System.out.println("e : " + e);   
	    System.out.println("f : " + f);   
	    System.out.println("g : " + g);   
	    System.out.println("h : " + h);   
	    System.out.println("i : " + i);   
	}

}
