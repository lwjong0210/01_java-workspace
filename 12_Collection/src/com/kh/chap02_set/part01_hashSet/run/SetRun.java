package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		// Object equals()		=> 두 객체의 "주소값"을 비교해서 일치하면 true / 일치하지 않으면 false 반환
		// Object hashCode()	=> 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		
		// String equals() 		=> "실제 담긴 문자열"을 가지고 비교해서 일치하면 true / 일치하지 않으면 false 반환
		// String hashCode()	=> "실제 담긴 문자열"을 가지고 10진수의 형태롤 만들어서 반환
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("반갑습니다.");		// 0x123
		hs1.add(new String("반갑습니다."));	// 0x234
		// 1. equals() => true
		// 2. hashCode() => true	
		// 중복으로 판단
		// 오버라이딩돼서 hashCode는 같아짐 System.identityHashCode()는 다름
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1);	// 저장 순서 유지 안됨!!(인덱스 개념 없음), 중복된 데이터(동일객체) 보관 불가능
		
		HashSet<Student> hs2 = new HashSet<>();
		// 존잘월드 3명이 산다고 가정하자
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("차은우", 26, 85));
		hs2.add(new Student("주지훈", 24, 20));
		hs2.add(new Student("공유", 43, 100));	// 공유가 있는데 실수로 하나를 떠 씀 => hashSet이니까 중복값인 공유는 사라지겠지 ?
		
		System.out.println(hs2);	// 저장 순서 유지 안됨!!(인덱스 개념 없음) / 중복 제거 안됨 => 왜> 동일객체로 판단이 안되고 있어서
		// 첫번째 공유와 네번째 공유와 hashCode 값이 다르다. => 즉 다른 값으로 판단.
		// 해결방법 : Student에서 hashCode를 오버라이딩 한다.
		
		// HashSet 이라는 공간에 객체가 추가 될 때마다 동일 객체인지 비교
		// 동일 객체 : 각 객체마다 hashCode() 호출결과가 일치하고, equals() 비교시 true 일 경우
		
		// Student equals() 오버라이딩		=> "실제 각 필드에 담긴 데이터" 들이 다 일치하면 true / false
		// Student hashCode() 오버라이딩 	=> "실제 각 필드에 담긴 데이터" 들이 일치하면 동일한 10진수 반환
		
		System.out.println("=======================================================");
		System.out.println(new Student("공유",43,100).hashCode());
		System.out.println(new Student("공유",43,100).hashCode());
		// 재정의한 hashCode() 메소드에 의해 둘다 결과 똑같음
		
		System.out.println(new Student("공유",43,100).equals(new Student("공유",43,100)));	// 오버라이딩 안했으면 원래 false가 나옴
		System.out.println("=======================================================");
		
		
		// hs2.get(1);	=> 인덱스의 개념도 없고 get메소드 자체가 정의되어 있지 않음!! (한 객체만 뽑아올 수 없음!!)
		
		// HashSet에 담긴 모든 객체들에 순차적으로 접근
		// 1. for문 사용 가능 (단, 향상돤 for문(for each문)만 사용 가능!!)
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("======================================");
		
		// 2. ArrayList에 담아준 다음 ArrayList를 반복문 돌려가며 접근
		// ArrayList에 담는 첫번째 방법 : ArrayList 생성 후 addAll 메소드 이용해서 통째로 추가하기
		
		ArrayList <Student> list = new ArrayList<>();
		list.addAll(hs2);
		
		// ArrayList에 담는 두번째 방법 : ArrayList 생성과 동시에 통째로 추가하기
		ArrayList <Student> list2 = new ArrayList<>(hs2);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		// 근데 이거 왜 쓰는거임 ? 
		// 중복된 데이터가 들어오면 절대 안되는 경우 !!!	=> 근데 거의 안쓰임...
		
		System.out.println("======================================");
		
		// 3. Iterator 반복자를 이용해서 순차적을 접근
		Iterator<Student> it = hs2.iterator();	// hs2에 담겨있는 객체들을 Iterator(반복자)에 담는 과정
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
//		it.next();	// NoSuchElementException : 더 이상 뽑을 요소 없음
		
		
		
	}

}
