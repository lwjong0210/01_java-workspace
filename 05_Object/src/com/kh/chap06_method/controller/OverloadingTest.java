package com.kh.chap06_method.controller;

public class OverloadingTest {
	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것
	
	// 같은 메소드 명이기 때문에 어떤것을 돌려야 할지 몰라서 에러가 발생
	/*
	public void test() {
		System.out.println("a");
	}

	public void test() {
		System.out.println("b");		
	}
	*/
	
	// 반환형 매개변수 없는 메소드
	public void test() {
		
	}
	
	// 반환형 없고 매개변수 1개 있는 메소드
	public void test(int a) {
		
	}
	
	// 반환형 없고 매개변수 2개(정수 먼저) 있는 메소드
	public void test(int a, String s) {
		
	}
	
	// 반환형 없고 매개변수 2개(문자 먼저) 있는 메소드
	public void test(String s, int a){
		
	}
	
	// 반환형 없고 매개변수 2개(둘다 정수) 있는 메소드
	public void test(int a, int b) {
		
	}
	
	/*
	public void test(int c, int d) {	=> 안됨
		
	}
	오버로딩이 가능하려면 매개변수명이 아니라
	매개변수의 개수와 순서가 다르게 작성돼야함.
	*/
	
	public void test(String str) {
		
	}
	/*
	public int test(String str) {
			
	}
	반환형이라도 상관 없음!!
	무조건 !!!! 매개변수가 달라야한다.
	*/
	
	/*
	private void test(String str) {
		
	}
	접근제한자랑도 상관 없음!!!
	무조건 !!!! 매개변수가 달라야한다.!!!
	*/
	
	/*
	 * * 결론
	 * 오버로딩 :  한 클래스내에 동일한 이름의 클래스들
	 * 			단, 매개변수명, 접근제한자, 반환형을 다 떠나서
	 *			매개변수의 자료형과 개수, 순서가 다르게 작성돼있어야함!!!
	 */

}
