package com.kh.practice.api.run;

import java.util.Scanner;

import com.kh.practice.api.controller.BookController;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		BookController bc = new BookController(); // BookController 메소드에 접근하기 위해 bc라는 레퍼런스 생성
		
		// 1. 도서 전체 출력
		System.out.println("-----------1. 기존의 전체 도서 추가---------");
		// printAll() 메소드 호출
		bc.printAll();
		
		// 2_1. 추가할 도서 입력 받기
		System.out.println("-----------2. 새로운 도서 추가----------");
		
		System.out.print("도서명을 입력하시오 : ");
		String newTitle = sc.nextLine();
		
		System.out.print("저자명을 입력하시오 : ");
		String newAuthor = sc.nextLine();
		
		System.out.print("출판사명을 입력하시오 : ");
		String newPublisher = sc.nextLine();
		
		System.out.print("출판일 (2023-06-14 과 같이 '-'구분자를 이용하여 입력하시오) : ");
		String newDate = sc.nextLine(); // 날짜도 먼저 문자열로 받기
		
		System.out.print("가격을 입력하시오 : ");
		String newPrice = sc.nextLine();
		
		// 2_2. 입력받은 값들을 BookController의 insertBook() 메소드로 전달
		try {
			bc.insertBook(newTitle, newAuthor, newPublisher, newDate, newPrice);
			
		} catch(RuntimeException e){
			System.out.println("도서추가 오류발생");
		}
		System.out.println("추가도서 추가완료");
		
		// 3. 5번째 도서 출간일 출력
		System.out.println("---------3. 5번째 도서 출간일 출력---------");
		//printBookPublishDate() 메소드 호출
		bc.printBookPublishDate();
		
		// 4. 검색할 도서명 입력 (키워드)
		System.out.println();
		System.out.print("검색할 도서명을 입력하시오 : ");
		String searchTitle = sc.nextLine();
		
		// searchBook(searchTitle) 메소드 호출
		bc.searchBook(searchTitle);
	}

}
