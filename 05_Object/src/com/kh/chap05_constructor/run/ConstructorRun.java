package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 기본생성자로 객체 생성
		User u1 = new User();
		System.out.println(u1.information());
		// 각 필드에 JVM 초기값들 담겨 있음!!
		
		// 회원가입시 필수 입력사항만 입력 받는다면?
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pwd002");
		u2.setUserName("차은우");
		System.out.println(u2.information());
		*/
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user02","pwd02","차은우");
		System.out.println(u2.information());
		
		// 그럼 setter 안만들어도 되지 않을까...? => 안됨
		// 비번을 바꾸는 경우 비번만 변경, 개명을 한 경우 이름만 변경
		u2.setUserName("차으누");
		System.out.println(u2.information());
		
		// getter는..?
		// 비번을 까먹은 경우에는 비번만 보여줘야 함. 그때 getter가 필요
		
		// 3. 매개변수 5개짜리 생성자로 객체 생성
		// "user03" "pwd03" "장원영" 23 '여'
		// information() 출력
		User u3 = new User("user03", "pwd03", "장원영", 23, '여');
		System.out.println(u3.information());
	}

}
